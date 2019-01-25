package com.annotation.controller;

import com.annotation.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description:
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/22 15:44
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
