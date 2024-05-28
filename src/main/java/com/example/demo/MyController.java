package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1", produces = MediaType.APPLICATION_JSON_VALUE)
public class MyController {

    @GetMapping("/slow")
    public String slow() {
        for(int i = 0; i < 1000; i++) {
            RandomStringGenerator.generateRandomString(30);
        }
        return "Slow generated string: " + RandomStringGenerator.generateRandomString(30);
    }

    @GetMapping("/fast")
    public String fast() {
        return "Fast generated string: " + RandomStringGenerator.generateRandomString(30);
    }
}
