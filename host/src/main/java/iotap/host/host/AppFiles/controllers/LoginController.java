package iotap.host.host.AppFiles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LoginController {

    @RequestMapping(value = {"/"})
    public String index() {
        return "Greetings from Spring Boot!";
    }

}