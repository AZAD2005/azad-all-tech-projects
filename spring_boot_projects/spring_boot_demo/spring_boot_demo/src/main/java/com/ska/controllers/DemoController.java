package com.ska.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping(path = "/welcomeMessage")
    public String m1() {
        return "Welcome to SpringBoot....!";
    }

    @GetMapping(path = "/fetchFullName/{fName}")
    public String name(@PathVariable String fName) {
        return String.format("Hii your firstName is : %s", fName);
    }

    @GetMapping(path = "/sendQueryParam")
    public String details(@RequestParam String name, @RequestParam String city, @RequestParam String pincode) {
        return String.format("Hi i am %s and i am from %s my pincode is %s", name, city, pincode);
    }

}
