package com.ska.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping(path = "/newMsg")
    public String m1(){
        return "welcome to democontroller class..!";
    }
}
