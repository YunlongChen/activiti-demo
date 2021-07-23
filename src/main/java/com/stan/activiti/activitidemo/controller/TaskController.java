package com.stan.activiti.activitidemo.controller;

import com.stan.activiti.activitidemo.ActivitiDemoApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("task")
public class TaskController {
    private final Logger log = LoggerFactory.getLogger(ActivitiDemoApplication.class);

    @GetMapping("create")
    public void testTask() {
        log.info("启动控制器了");
    }
}
