package com.example.WebApp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
    // Novo endpoint
    @GetMapping("/hello")
    public String helloWorld() {
        return "Endpoint final";
    }
    //Endpoint hotfix
    @GetMapping("/hotfix")
    public String helloWorld() {
        return "Endpoint hotfix";
    }
    //Endpoint hotfix
    @GetMapping("/hotfix")
    @ResponseBody
    public String hotfixEndpoint() {
        return "Hotfix aplicado! Versão: 1.0.1";
    }
}
