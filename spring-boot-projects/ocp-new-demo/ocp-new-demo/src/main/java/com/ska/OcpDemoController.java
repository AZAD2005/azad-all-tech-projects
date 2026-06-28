package com.ska;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OcpDemoController {


    @GetMapping(path = "/welcomeMessage")
    public String welcomeMessage(){
        return "Hii Welcome to OcpDemoController Class....!";
    }

    @GetMapping(path = "/fetchFullname")
    public String fullName(@RequestParam String firstName,@RequestParam String lastName){

        return String.format("Hii Your Full Name is : %s %s",firstName,lastName);

    }
}
