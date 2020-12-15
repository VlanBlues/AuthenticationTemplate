package com.lan.authentication.util;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lan.authentication.auth.exception.CustomException;
import com.lan.authentication.auth.mapper.UserMapper;
import com.lan.authentication.auth.model.common.Constant;
import com.lan.authentication.auth.entity.User;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 获取当前登录用户工具类
 *
 * @author wliduo[i@dolyw.com]
 * @date 2019/3/15 11:45
 */
@Component
public class UserUtil {

    private final UserMapper userMapper;

    @Autowired
    public UserUtil(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * 获取当前登录用户
     *
     * @param
     * @return com.lan.authentication.auth.model.UserDto
     * @author wliduo[i@dolyw.com]
     * @date 2019/3/15 11:48
     */
    public User getUser() {
        String token = SecurityUtils.getSubject().getPrincipal().toString();
        // 解密获得Account
        String account = JwtUtil.getClaim(token, Constant.ACCOUNT);
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("account",account);
        User user = userMapper.selectOne(wrapper);
        // 用户是否存在
        if (user == null) {
            throw new CustomException("该帐号不存在(The account does not exist.)");
        }
        return user;
    }

    /**
     * 获取当前登录用户Id
     *
     * @param
     * @return com.lan.authentication.auth.model.UserDto
     * @author wliduo[i@dolyw.com]
     * @date 2019/3/15 11:48
     */
    public Integer getUserId() {
        return getUser().getId();
    }

    /**
     * 获取当前登录用户Token
     *
     * @param
     * @return com.lan.authentication.auth.model.UserDto
     * @author wliduo[i@dolyw.com]
     * @date 2019/3/15 11:48
     */
    public String getToken() {
        return SecurityUtils.getSubject().getPrincipal().toString();
    }

    /**
     * 获取当前登录用户Account
     *
     * @param
     * @return com.lan.authentication.auth.model.UserDto
     * @author wliduo[i@dolyw.com]
     * @date 2019/3/15 11:48
     */
    public String getAccount() {
        String token = SecurityUtils.getSubject().getPrincipal().toString();
        // 解密获得Account
        return JwtUtil.getClaim(token, Constant.ACCOUNT);
    }
}
