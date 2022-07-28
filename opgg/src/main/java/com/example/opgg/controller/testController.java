package com.example.opgg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class testController {

    @GetMapping(value = "/test")
    public String test(){
        return "test controller";
    }
}
