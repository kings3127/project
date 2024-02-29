package com.example.project.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.project.model.EventInfo;
import com.example.project.repository.EventInfoRepo;
import java.util.List;

@Service
public class EventInfoService {
    public EventInfoRepo eventInfoRepo;
    public EventInfoService(EventInfoRepo eventInfoRepo) {
        this.eventInfoRepo = eventInfoRepo;
    }
    public EventInfo posting(EventInfo eventInfo)
    {
        return eventInfoRepo.save(eventInfo);
    }
    public List<EventInfo> get()
    {
        return eventInfoRepo.findAll();
    }
    // //pagination
    // public Page<EventInfo> pagination(int offset,int pagesize)
    // {
    //         return eventInfoRepo.findAll(PageRequest.of(offset, pagesize));
    // }
}
