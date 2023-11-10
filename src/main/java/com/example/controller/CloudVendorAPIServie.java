package com.example.controller;


import com.example.model.CloudVendor;
import com.example.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloud-vendor")
public class CloudVendorAPIServie {

    CloudVendorService cloudVendorService;

    public CloudVendorAPIServie(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }


    @GetMapping("/{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
        return cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllCloudVendorDetails() {
        return cloudVendorService.getAllCloudVendor();
    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.createCloudVendor(cloudVendor);
        return "Cloud Vendore Created Successfull";
    }

    @PutMapping
    public String updCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.updCloudVendor(cloudVendor);
        return "Cloud Vendore UPD Successfull";
    }

    @DeleteMapping("/{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable("vendorId") String vendorId) {
       cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud Vendore delete Successfull";
    }

}
