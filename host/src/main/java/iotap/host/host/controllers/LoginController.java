package iotap.host.host.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class LoginController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}