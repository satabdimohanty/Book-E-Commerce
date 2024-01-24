package com.example.BookECommerce.Controller;

import com.example.BookECommerce.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @Autowired
private BookRepository bookRepository;
    @GetMapping("/getbook")
    public String book()
    {
        bookRepository.findAll();
        return "Here is all books";
    }
    @GetMapping("/selectbook")
    public String selectBook()
    {
        return "Book selected";
    }
}
