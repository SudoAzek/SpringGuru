package com.mezonworks.spring5webapp.controllers;

import com.mezonworks.spring5webapp.repositories.BookRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookController {
    private BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @RequestMapping(value = "/books", produces = {"application/json; charset=UTF-8"})
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());

//        return "books";
        return "books";
    }
}
