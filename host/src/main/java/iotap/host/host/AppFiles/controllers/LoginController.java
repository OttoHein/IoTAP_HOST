package iotap.host.host.AppFiles.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class LoginController {

    @RequestMapping(value = {"/employee/test"}, method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value={"/employee/scan/{id}"}, method = RequestMethod.GET)
    public RedirectView employerScan(@PathVariable("id") String id){
        return new RedirectView("/employee/index/" + id);
    }

    @RequestMapping(value={"/employee/index/{id}"}, method = RequestMethod.GET)
    public ModelAndView employee(@PathVariable("id") String id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("employeeIndex");
        return modelAndView;
    }
}