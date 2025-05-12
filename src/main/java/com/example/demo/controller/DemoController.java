package com.example.demo.controller;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("demo")
public class DemoController {

    @GetMapping
    public String demo() {
        return "";
    }
}
