package com.lan.authentication.auth.service.impl;

import com.lan.authentication.auth.entity.User;
import com.lan.authentication.auth.mapper.UserMapper;
import com.lan.authentication.auth.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
