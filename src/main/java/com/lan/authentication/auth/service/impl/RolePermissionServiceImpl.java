package com.lan.authentication.auth.service.impl;

import com.lan.authentication.auth.entity.RolePermission;
import com.lan.authentication.auth.mapper.RolePermissionMapper;
import com.lan.authentication.auth.service.IRolePermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色资源表 服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {

}
