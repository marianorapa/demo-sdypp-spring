package com.example.demo.controller;

import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookSavedDto;
import com.example.demo.service.BooksService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    Logger logger = LoggerFactory.getLogger(BooksController.class);

    @Autowired
    BooksService booksService;

    @PostMapping("/books")
    public BookSavedDto save(@RequestBody BookRequestDto bookRequestDto) {
        logger.info(String.format("Book received %s", bookRequestDto));
        return booksService.process(bookRequestDto);
    }

}