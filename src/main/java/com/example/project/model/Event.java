package com.example.project.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Event {
    @Id
    private int id;
    private String name;
    @JsonManagedReference
    @OneToOne(mappedBy = "eventinfo", cascade = CascadeType.ALL)
    private EventInfo eventInfo;

    @JsonManagedReference
    @OneToMany(mappedBy = "event",cascade = CascadeType.ALL)
    private List<VendorModel> vendorModels; 
}
