package com.ska.controllers;


import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "controller")
public class OcpDemoController {


    @GetMapping(path = "/welcomeMessage")
    public String message() {
        return "Hii Welcome to OcpDemController class..! ";
    }

    @GetMapping(path = "/fetchFullname")
    public String fullName(@RequestParam String firstName, @RequestParam String lastName) {

        return String.format("Hii Your Full Name is : %s %s", firstName, lastName);
    }
}
