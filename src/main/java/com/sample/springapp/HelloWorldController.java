package com.sample.springapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/hello")
    public String helloworld(){
        return "Hello world Congrats you Wrote first API!!";
    }


}
