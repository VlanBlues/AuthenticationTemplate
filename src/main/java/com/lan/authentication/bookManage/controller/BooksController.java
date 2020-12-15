package com.lan.authentication.bookManage.controller;


import com.lan.authentication.util.Result;
import com.lan.authentication.bookManage.service.IBooksService;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lan 
 * @since 2020-12-15
 */
@RestController
@RequestMapping("/books")
public class BooksController {
    @Resource
    private IBooksService booksService;
    
    @RequestMapping("/getAll")
    @RequiresPermissions(logical = Logical.AND, value = {"user:edit"})
    public Result getAll(){
        return Result.success(booksService.list());
    }
}
