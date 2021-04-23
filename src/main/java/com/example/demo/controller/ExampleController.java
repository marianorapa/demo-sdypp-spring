package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class ExampleController {

    //@RequestMapping(value = "/", method = RequestMethod.GET)
    @GetMapping
    public String index() {
        return "Hello world!";
    }

}