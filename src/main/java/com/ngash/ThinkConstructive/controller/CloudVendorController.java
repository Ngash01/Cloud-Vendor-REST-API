package com.ngash.ThinkConstructive.controller;

import com.ngash.ThinkConstructive.model.CloudVendor;
import com.ngash.ThinkConstructive.service.CloudVendorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {

    @Autowired
    CloudVendorInterface cloudVendorInterface;

    @PostMapping("/create")
    public CloudVendor createCloudVendor(@RequestBody CloudVendor cloudVendor){
        return cloudVendorInterface.createCloudVendor(cloudVendor);
    }

    @GetMapping("/findOne/{id}")
    public CloudVendor findACloudVendor(@PathVariable("id") int id){
        return cloudVendorInterface.findACloudVendor(id);
    }

    @GetMapping("/findAll")
    public List<CloudVendor> findAllCloudVendors(){
        return cloudVendorInterface.findAllCloudVendors();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteCloudVendor(@PathVariable("id") int id){
        return cloudVendorInterface.deleteCloudVendor(id);
    }


    @PutMapping("/update/{id}")
    public CloudVendor updateMapping(@RequestBody CloudVendor cloudVendor, @PathVariable("id") int id){
        return cloudVendorInterface.updateCloudVendor(cloudVendor, id);
    }

}










