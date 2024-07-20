package com.Task.TaskSpringBoot.Service;

import com.Task.TaskSpringBoot.Model.Task;
import com.Task.TaskSpringBoot.Repository.TaskRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service

public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    private Task preDefinedTask = new Task(); // Initialize with predefined JSON model

    public Task modifyMenu(Map<String, String> inputs) {
        String jsonModel = preDefinedTask.toJson();

        for (Map.Entry<String, String> entry : inputs.entrySet()) {
            jsonModel = jsonModel.replace(entry.getKey(), entry.getValue());
        }

        Task modifiedMenu = new Task();
        modifiedMenu.fromJson(jsonModel);
        taskRepository.save(modifiedMenu);
        return modifiedMenu;
    }

}
