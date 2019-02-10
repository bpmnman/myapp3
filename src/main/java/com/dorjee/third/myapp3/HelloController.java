package com.dorjee.third.myapp3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${profile.name}")
    private String profileName;

    @GetMapping("")
    public String sayHello() {
        return "Saying hello from profile -> " + profileName;
    }
}
