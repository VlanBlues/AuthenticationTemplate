package com.lan.authentication.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lan.authentication.auth.entity.Permission;
import com.lan.authentication.auth.entity.Role;

import java.util.List;

/**
 * <p>
 * 资源表 Mapper 接口
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
public interface PermissionMapper extends BaseMapper<Permission> {

    /**
     * 根据Role查询Permission
     */
    List<Permission> findPermissionByRole(Role role);
}
