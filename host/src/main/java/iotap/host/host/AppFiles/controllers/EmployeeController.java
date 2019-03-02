package iotap.host.host.AppFiles.controllers;

import iotap.host.host.AppFiles.entities.Employee;
import iotap.host.host.AppFiles.entities.Task;
import iotap.host.host.AppFiles.repositories.EmployeeRepository;
import iotap.host.host.AppFiles.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TaskRepository taskRepository;

    @RequestMapping(value = {"/test"}, method = RequestMethod.GET)
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value={"/employee/scan/{id}"}, method = RequestMethod.GET)
    public RedirectView employeeScan(@PathVariable("id") String id){
        return new RedirectView("/employee/index/" + id);
    }


    @RequestMapping(value={"/employee/index/{id}"}, method = RequestMethod.GET)
    public ModelAndView employeeMain(@PathVariable("id") String id){
        Employee person = employeeRepository.findByCardChip(id);
        System.out.println(person);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("person", person);
        //modelAndView.addObject("first_name",person.getFirstName());
        modelAndView.setViewName("employeeIndex");
        return modelAndView;
    }

    @RequestMapping(value={"employee/tasks/{id}"}, method = RequestMethod.GET)
    public ModelAndView employeeTasks(@PathVariable("id") Integer id){
        ModelAndView modelAndView = new ModelAndView();
        List<Task> tasks = taskRepository.findAll();
        modelAndView.addObject("tasks", tasks);
        modelAndView.setViewName("employeeTasks");
        return modelAndView;
    }

    @RequestMapping(value={"employee/task/{id}/{taskId}"}, method = RequestMethod.GET)
    public ModelAndView employeeTaskOverview(@PathVariable("id") Integer id,
                                             @PathVariable("taskId") Integer taskId){
        ModelAndView modelAndView = new ModelAndView();
        List<Task> tasks = taskRepository.findAll();
        modelAndView.addObject("tasks", tasks);
        modelAndView.setViewName("employeeTasks");
        return modelAndView;
    }

    @RequestMapping(value={"employee/summary/{id}"}, method = RequestMethod.GET)
    public ModelAndView employeeTaskOverview(@PathVariable("id") String id){
        ModelAndView modelAndView = new ModelAndView();
        List<Task> employeeTask = new ArrayList<Task>();
        List<Task> tasks = taskRepository.findAll();
        for (Task t : tasks) {
           if( t.getEmployee().toString() == id)
           {
               employeeTask.add(t);
           }
        }
        modelAndView.addObject("tasks");
        modelAndView.setViewName("employeeTasksOverview");
        return modelAndView;
    }

}