package com.example.project.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.EventInfo;
import com.example.project.service.EventInfoService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EventInfoController {
    public EventInfoService eventInfoService;
    public EventInfoController(EventInfoService eventInfoService ) {
        this.eventInfoService = eventInfoService;
    }
    @PostMapping("/postinfo")
    public EventInfo postInfo(@RequestBody EventInfo eventInfo)
    {
        return eventInfoService.posting(eventInfo);
    }


    @GetMapping("/getinfo")
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
    public ResponseEntity<EventInfo> post(@RequestBody EventInfo eventInfo)
    {
        EventInfo obj=eventInfoService.posting(eventInfo);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }
    public ResponseEntity<List<EventInfo>> getting()
    {
        List<EventInfo> obj2=eventInfoService.get();
        return new ResponseEntity<>(obj2,HttpStatus.OK);
    }
}
