package com.training.AWS101;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AWScontroller {

    @GetMapping("/")
    public String hello() {
        return "And! Here it is Deployed...!";
    }
}
