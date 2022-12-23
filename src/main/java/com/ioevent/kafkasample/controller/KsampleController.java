package com.ioevent.kafkasample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/kapi")
@RestController
public class KsampleController {

//	@Autowired
//    Producer kafkaProducer;
//
//
//    @GetMapping("/produce")
//    public String sendMessage(@RequestParam("message") String message)
//    {
//        kafkaProducer.sendMessageToTopic(message);
//        return "Message sent Successfully to the topic ";
//    }
    
    @GetMapping("/test")
    public String test()
    {
        return "UnderControl";
    }
}
