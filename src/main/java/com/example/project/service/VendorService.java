package com.example.project.service;

import org.springframework.stereotype.Service;

import com.example.project.model.VendorModel;
import com.example.project.repository.VendorRepo;

@Service
public class VendorService {
    public VendorRepo vendorRepo;

    public VendorService(VendorRepo vendorRepo) {
        this.vendorRepo = vendorRepo;
    }
    public VendorModel saving(VendorModel vendorModel)
    {
        return vendorRepo.save(vendorModel);
    }
    
}
