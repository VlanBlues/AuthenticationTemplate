package com.lan.authentication.auth.service.impl;

import com.lan.authentication.auth.entity.UserRole;
import com.lan.authentication.auth.mapper.UserRoleMapper;
import com.lan.authentication.auth.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户角色表 服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
