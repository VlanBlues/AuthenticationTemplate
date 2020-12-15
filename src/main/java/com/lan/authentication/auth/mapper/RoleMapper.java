package com.lan.authentication.auth.mapper;

import com.lan.authentication.auth.entity.Role;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lan.authentication.auth.entity.User;

import java.util.List;

/**
 * <p>
 * 角色表 Mapper 接口
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
public interface RoleMapper extends BaseMapper<Role> {
    /**
     * 根据User查询Role
     */
    List<Role> findRoleByUser(User user);
}
