package com.example.demo.service;

import com.example.demo.dto.BookRequestDto;
import com.example.demo.dto.BookSavedDto;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class BooksServiceImpl implements BooksService {

    public BookSavedDto process(BookRequestDto bookRequestDto) {
        return new BookSavedDto("12345", bookRequestDto.getTitle(), LocalDateTime.now());
    }
}
