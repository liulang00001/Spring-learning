package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liulang
 * @version 1.0
 * @date 2022/9/22 20:10
 * @description:
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookdao;


}
