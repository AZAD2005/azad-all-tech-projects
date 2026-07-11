package com.ska;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/newMethod")
    public String m1() {
        return "Hii Welcome to DemoController Class...!!";
    }

    @GetMapping("/fullName")
    public String fetchName(@RequestParam String firstName,
                            @RequestParam String lastName) {
        return String.format(
                "Hii your full name is : %s %s",
                firstName,
                lastName
        );
    }
}