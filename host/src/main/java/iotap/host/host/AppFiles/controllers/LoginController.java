package iotap.host.host.AppFiles.controllers;

import iotap.host.host.AppFiles.entities.Employee;
import iotap.host.host.AppFiles.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class LoginController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value={"/employee/scan/{id}"}, method = RequestMethod.GET)
    public RedirectView employeeScan(@PathVariable("id") String id){
        return new RedirectView("/employee/index/" + id);
    }


    @RequestMapping(value={"/index/{id}"}, method = RequestMethod.GET)
    public ModelAndView employeeMain(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("employeeIndex");
        return modelAndView;
    }

    @RequestMapping(value={"/index/{id}/tasks"}, method = RequestMethod.GET)
    public ModelAndView employeeTasks(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.setViewName("employeeIndex");
        return modelAndView;
    }
}