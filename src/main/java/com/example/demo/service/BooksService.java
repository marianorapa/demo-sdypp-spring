package com.example.demo.service;

import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookSavedDto;

public interface BooksService {

    public BookSavedDto process(BookRequestDto bookRequestDto);

}
