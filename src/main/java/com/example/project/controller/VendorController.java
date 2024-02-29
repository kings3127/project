package com.example.project.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.project.model.VendorModel;
import com.example.project.service.VendorService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class VendorController {
    public VendorService vendorService;

    public VendorController(VendorService vendorService) {
        this.vendorService = vendorService;
    }
    @PostMapping("/vendor")
    public VendorModel save(@RequestBody VendorModel vendorModel)
    {
        return vendorService.saving(vendorModel);
    }
}
