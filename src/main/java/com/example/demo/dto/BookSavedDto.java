package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class BookSavedDto {

    private String id;

    private String title;

    private LocalDateTime date;

}