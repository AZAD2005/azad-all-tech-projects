package com.ska.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    @GetMapping(path = "/welMsg")
    public String msg(){
        return "Hii welcome to spring boot...!";
    }


    @GetMapping(path = "/fetchFullName")
    public String fullName() {
        return "Hii my name is : Shaik Azad";

    }
}
