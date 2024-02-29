package com.example.project.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.model.VendorModel;


@Repository
public interface VendorRepo extends JpaRepository<VendorModel,Integer>
{
    
}
