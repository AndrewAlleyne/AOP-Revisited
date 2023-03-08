package com.example.aoprevisited;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/")
    public String hello() {
        return " Something is in the water";
    }
}
