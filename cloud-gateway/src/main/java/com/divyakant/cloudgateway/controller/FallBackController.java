package com.divyakant.cloudgateway.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackController {

    @GetMapping("/userServiceFallBack")
    @HystrixCommand
    public String userServiceFallBackMethod()
    {
        return "User Service is unavailable, Please try again after some time";
    }
    @GetMapping("/departmentServiceFallBack")
    @HystrixCommand
    public String departmentServiceFallBackMethod()
    {
        return "Department Service is unavailable, Please try again after some time";
    }
}
