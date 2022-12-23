package com.ioevent.kafkasample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/kapi")
@RestController
public class KsampleController {
    
    @GetMapping("/test")
    public String test()
    {
        return "UnderControl";
    }
}
