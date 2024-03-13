package com.example.project.service;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.project.model.Event;
import com.example.project.repository.EventRepo;
import java.util.List;

@Service
public class EventService {
    public EventRepo eventRepo;
    public EventService(EventRepo eventRepo) {
        this.eventRepo = eventRepo;
    }
    //POST:
    public Event posting(Event event)
    {
        return eventRepo.save(event);
    }
    //GET:
    public List<Event> get()
    {
        return eventRepo.findAll();
    }

    // JPA QUERY:
    public List<Event> jpa(int id)
    {
        return eventRepo.findById(id);
    }
    //pagination'
    public List<Event> pagination(int offset,int pagesize)
    {
            return eventRepo.findAll(PageRequest.of(offset, pagesize)).getContent();
    }
    //sort
    public List<Event> sort(String field)
    {
        return eventRepo.findAll(Sort.by(Sort.Direction.DESC,field));       
    }
}
