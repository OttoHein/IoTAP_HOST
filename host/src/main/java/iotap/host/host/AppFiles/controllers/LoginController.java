package iotap.host.host.AppFiles.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/employee")
public class LoginController {

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value={"/scan/{id}"}, method = RequestMethod.GET)
    public String employerScan(@PathVariable("id") String id){
        return "redirect:index/" + id;
    }

    @RequestMapping(value={"/index/{id}"}, method = RequestMethod.GET)
    public ModelAndView employee(@PathVariable("id") String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("employeeIndex");
        return modelAndView;
    }
}