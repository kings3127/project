package com.example.project.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Getter
@Setter
@NoArgsConstructor
public class EventInfo {
    @Id
    private int id; 
    private int amountExpected;
    private String eventName;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date eventDate;
    private String eventTime;

    @OneToOne
    @JsonBackReference
    private Event eventinfo;
}
