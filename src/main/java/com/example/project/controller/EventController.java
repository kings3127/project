package com.example.project.controller;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.example.project.model.Event;
import com.example.project.service.EventService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class EventController {
    public EventService eventService;

    public EventController(EventService eventService) {
        this.eventService = eventService;
    }
    @PostMapping("/post")
    public ResponseEntity<Event> post(@RequestBody Event event)
    {
        Event obj=eventService.posting(event);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }
    @GetMapping("/getevent")
    public ResponseEntity<List<Event>> getting()
    {
        List<Event> obj2=eventService.get();
        return new ResponseEntity<>(obj2,HttpStatus.OK );
    }
    @GetMapping("/jpa")
    public List<Event> jpa(@PathVariable int id)
    {
        return eventService.jpa(id);
    }

    @GetMapping("/paging/{offset}/{pagesize}")
    public List<Event> pagination(@PathVariable int offset,@PathVariable int pagesize)
    {
        return eventService.pagination(offset, pagesize);
    }
    

    @GetMapping("/sort/{field}")
    public List<Event> getMethodName(@PathVariable String field) {
        return eventService.sort(field);
    }
}
