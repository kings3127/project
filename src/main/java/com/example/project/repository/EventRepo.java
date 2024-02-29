package com.example.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.project.model.Event;

@Repository
public interface EventRepo extends JpaRepository<Event,Integer>
{
    @Query("SELECT e FROM Event e WHERE e.id=?1")
    List<Event> findById(int id);
}
