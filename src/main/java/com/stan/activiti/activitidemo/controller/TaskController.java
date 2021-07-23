package com.stan.activiti.activitidemo.controller;

import lombok.extern.slf4j.Slf4j;
import org.activiti.api.task.model.Task;
import org.activiti.api.task.model.builders.TaskPayloadBuilder;
import org.activiti.api.task.runtime.TaskRuntime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("task")
public class TaskController {

    @GetMapping("create")
    public void testTask() {
        log.info("启动控制器了");
    }
}
