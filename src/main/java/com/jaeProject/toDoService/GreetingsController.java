package com.jaeProject.toDoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @RequestMapping("/")
    public String getGreeting(){
        return "hello worldddd";
    }
}
