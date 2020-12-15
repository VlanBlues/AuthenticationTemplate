package com.lan.authentication.auth.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lan.authentication.auth.exception.CustomUnauthorizedException;
import com.lan.authentication.auth.model.common.Constant;
import com.lan.authentication.auth.model.common.ResponseBean;
import com.lan.authentication.auth.entity.User;
import com.lan.authentication.auth.service.IUserService;
import com.lan.authentication.util.AesCipherUtil;
import com.lan.authentication.util.JedisUtil;
import com.lan.authentication.util.JwtUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private IUserService userService;
    
    @RequestMapping("/test")
    public String ClassName(){
        return "success";
    }

    /**
     * RefreshToken过期时间
     */
    @Value("${refreshTokenExpireTime}")
    private String refreshTokenExpireTime;
    /**
     * 登录授权
     */
    @PostMapping("/login")
    public ResponseBean login(@RequestBody User user, HttpServletResponse httpServletResponse) {
        // 查询数据库中的帐号信息
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("account",user.getAccount());
        User userTemp = userService.getOne(wrapper);
        if (userTemp == null) {
            throw new CustomUnauthorizedException("该帐号不存在(The account does not exist.)");
        }
        // 密码进行AES解密
        String key = AesCipherUtil.deCrypto(userTemp.getPassword());
        // 因为密码加密是以帐号+密码的形式进行加密的，所以解密后的对比是帐号+密码
        if (key.equals(user.getAccount() + user.getPassword())) {
            // 清除可能存在的Shiro权限信息缓存
            if (JedisUtil.exists(Constant.PREFIX_SHIRO_CACHE + user.getAccount())) {
                JedisUtil.delKey(Constant.PREFIX_SHIRO_CACHE + user.getAccount());
            }
            // 设置RefreshToken，时间戳为当前时间戳，直接设置即可(不用先删后设，会覆盖已有的RefreshToken)
            String currentTimeMillis = String.valueOf(System.currentTimeMillis());
            JedisUtil.setObject(Constant.PREFIX_SHIRO_REFRESH_TOKEN + user.getAccount(), currentTimeMillis,
                    Integer.parseInt(refreshTokenExpireTime));
            // 从Header中Authorization返回AccessToken，时间戳为当前时间戳
            String token = JwtUtil.sign(user.getAccount(), currentTimeMillis);
            httpServletResponse.setHeader("Authorization", token);
            httpServletResponse.setHeader("Access-Control-Expose-Headers", "Authorization");
            return new ResponseBean(HttpStatus.OK.value(), "登录成功(Login Success.)", null);
        } else {
            throw new CustomUnauthorizedException("帐号或密码错误(Account or Password Error.)");
        }
    }

    /**
     * 获取用户列表
     */
    @GetMapping
    @RequiresPermissions(logical = Logical.AND, value = {"user:view"})
    public ResponseBean user() {
        IPage<User> userDtoIPage = new Page<>(1,10);
        IPage<User> page = userService.page(userDtoIPage);
        return new ResponseBean(HttpStatus.OK.value(), "查询成功(Query was successful)", page);
    }

    /**
     * 测试登录
     */
    @GetMapping("/article")
    public ResponseBean article() {
        Subject subject = SecurityUtils.getSubject();
        // 登录了返回true
        if (subject.isAuthenticated()) {
            return new ResponseBean(HttpStatus.OK.value(), "您已经登录了(You are already logged in)", null);
        } else {
            return new ResponseBean(HttpStatus.OK.value(), "你是游客(You are guest)", null);
        }
    }
    
    @RequestMapping("/list")
    @RequiresPermissions(logical = Logical.AND, value = {"user:edit"})
    public String getList(){
        return "test";
    }
}
