package com.sodep.web;

import com.sodep.entities.Task;
import com.sodep.services.TaskService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author rodrigo
 *
 */
@Controller
public class HomeController {

    @Autowired
    private TaskService taskService;
	
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public ModelAndView getHomePage() {
        List<Task> tasks = taskService.findAll();
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("tasks", tasks);
        return mav;
    }
}
