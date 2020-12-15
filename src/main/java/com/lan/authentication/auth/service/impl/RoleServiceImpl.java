package com.lan.authentication.auth.service.impl;

import com.lan.authentication.auth.entity.Role;
import com.lan.authentication.auth.mapper.RoleMapper;
import com.lan.authentication.auth.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
