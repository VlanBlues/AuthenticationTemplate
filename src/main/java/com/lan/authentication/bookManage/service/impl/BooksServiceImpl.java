package com.lan.authentication.bookManage.service.impl;

import com.lan.authentication.bookManage.entity.Books;
import com.lan.authentication.bookManage.mapper.BooksMapper;
import com.lan.authentication.bookManage.service.IBooksService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lan
 * @since 2020-12-15
 */
@Service
public class BooksServiceImpl extends ServiceImpl<BooksMapper, Books> implements IBooksService {

    @Resource
    private BooksMapper booksMapper;
    
    @Override
    @Cacheable(value = "Book", key = "'id_'+#bno")
    public Books getBookById(String bno) {
        Books books = booksMapper.selectById(bno);
        System.out.println("执行方法");
        return books;
    }
}
