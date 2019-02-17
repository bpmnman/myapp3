package com.dorjee.third.myapp3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${profile.dorjee}")
    private String profileName;

    @GetMapping("")
    public String sayHello() {
        return "Yo, Saying helloasfdfas from pasdfrofile -> " + profileName;
    }
}
