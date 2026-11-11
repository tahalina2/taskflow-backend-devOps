package com.taskflow.taskflow.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @GetMapping("/api/hello")
    public String get(){
        return "Hello from TaskFlow Back-End";
    } 


}

