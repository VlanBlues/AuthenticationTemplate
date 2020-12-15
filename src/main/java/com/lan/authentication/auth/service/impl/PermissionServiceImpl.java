package com.lan.authentication.auth.service.impl;

import com.lan.authentication.auth.entity.Permission;
import com.lan.authentication.auth.mapper.PermissionMapper;
import com.lan.authentication.auth.service.IPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 资源表 服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
