package com.ngash.ThinkConstructive.service;

import com.ngash.ThinkConstructive.model.CloudVendor;

import java.util.List;
import java.util.Optional;

public interface CloudVendorInterface {

    public CloudVendor createCloudVendor(CloudVendor cloudVendor);
    public CloudVendor updateCloudVendor(CloudVendor cloudVendor, int id);
    public String deleteCloudVendor(int id);
    public CloudVendor findACloudVendor(int id);
    public List<CloudVendor> findAllCloudVendors();

}




