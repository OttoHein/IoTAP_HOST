package iotap.host.host.AppFiles.controllers;

import iotap.host.host.AppFiles.entities.TaskDetail;
import iotap.host.host.AppFiles.repositories.TaskDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/task") // This means URL's start with /demo (after Application path)
public class TaskController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TaskDetailRepository taskDetailRepository;

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewTask (@RequestParam String location
            , @RequestParam String name, @RequestParam String description) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        TaskDetail n = new TaskDetail(name, location, description, null, null, false, false, 5, null);
        taskDetailRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<TaskDetail> getAllTaskDetails() {
        // This returns a JSON or XML with the users
        return taskDetailRepository.findAll();
    }
}