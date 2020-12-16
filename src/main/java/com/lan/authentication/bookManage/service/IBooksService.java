package com.lan.authentication.bookManage.service;

import com.lan.authentication.bookManage.entity.Books;
import com.baomidou.mybatisplus.extension.service.IService;

import java.awt.print.Book;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
public interface IBooksService extends IService<Books> {
    Books getBookById(String bno);
}
