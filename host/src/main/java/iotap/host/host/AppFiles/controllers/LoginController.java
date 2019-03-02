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

@RestController
@RequestMapping("/employee")
public class LoginController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value={"/scan/{id}"}, method = RequestMethod.GET)
    public String employerScan(@PathVariable("id") String id){
        return "redirect:index/" + id;
    }


    @RequestMapping(value={"/index/{id}"}, method = RequestMethod.GET)
    public ModelAndView employee(@PathVariable("id") Integer id){
        Employee person = employeeRepository.findById(id);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("id", id);
        modelAndView.addObject("first_name",person.getFirstName());
        modelAndView.setViewName("employeeIndex");
        return modelAndView;
    }
}