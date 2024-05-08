package com.ngash.ThinkConstructive.service;

import com.ngash.ThinkConstructive.model.CloudVendor;
import com.ngash.ThinkConstructive.repository.CloudVendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CloudVendorService implements CloudVendorInterface{

    @Autowired
    CloudVendorRepository cloudVendorRepository;

    @Override
    public CloudVendor createCloudVendor(CloudVendor cloudVendor) {
        return cloudVendorRepository.save(cloudVendor);
    }

    @Override
    public CloudVendor updateCloudVendor(CloudVendor cloudVendor, int id) {
        CloudVendor existingCloudVendor = cloudVendorRepository.findById(String.valueOf(id)).get();
        if(!cloudVendor.getVendorName().isEmpty() && cloudVendor.getVendorName()!=null){
            existingCloudVendor.setVendorName(cloudVendor.getVendorName());
        }

        if(cloudVendor.getVendorAddress() != null && !cloudVendor.getVendorAddress().isEmpty()){
            existingCloudVendor.setVendorAddress(cloudVendor.getVendorAddress());
        }

        return cloudVendorRepository.save(existingCloudVendor);
    }

    @Override
    public String deleteCloudVendor(int id) {
         cloudVendorRepository.deleteById(String.valueOf(id));
         return "CloudVendor deleted Successfully!";
    }

    @Override
    public CloudVendor findACloudVendor(int id){
        return cloudVendorRepository.findById(String.valueOf(id)).get();
    }

    @Override
    public List<CloudVendor> findAllCloudVendors(){
        List<CloudVendor> allVendors = cloudVendorRepository.findAll();
        System.out.println("All vendors: " + allVendors);
        return cloudVendorRepository.findAll();
    }

}





