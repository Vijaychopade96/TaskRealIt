nopackage com.Task.TaskSpringBoot.Controller;

import com.Task.TaskSpringBoot.Model.Task;
import com.Task.TaskSpringBoot.Service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Map;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @PostMapping("/modify")
    public Task taskModify(@RequestBody Map<String, String> inputs) {
        return taskService.modifyMenu(inputs);
    }
    
      @PostMapping("/create")
      public Task create(Task task){
       return taskservice.cretaeTask(task);
   }
}
