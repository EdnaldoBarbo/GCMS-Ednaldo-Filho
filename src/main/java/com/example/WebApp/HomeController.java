package com.example.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public @ResponseBody String greeting() {
        return "Hello, World!";
    }

    @RequestMapping("/ednal")
    public @ResponseBody String greetingednal() {
        return "Hello, Ednaldo!";
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Endpoint final";
    }
}
