package com.example.Genpact_Tesk2.Services;


import com.example.Genpact_Tesk2.Entitys.Address;
import com.example.Genpact_Tesk2.Entitys.Org;
import com.example.Genpact_Tesk2.Repositorys.Address_Repository;
import com.example.Genpact_Tesk2.Repositorys.Org_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Address_Service {

    @Autowired
    Address_Repository addressRepository;

    @Autowired
    Org_Repository orgRepository;


    public void add_address(Address address) {
        Org org;
        org=orgRepository.findById(address.getOrg__id()).get();
        org.getAddressList().add(address);
      //  List<Address> addressList=org.getAddressList();
//        System.out.printf("Before"+addressList.size());
//        addressList.add(address);
//        System.out.println("After"+addressList.size());
        //org.setAddressList(addressList);

        orgRepository.save(org);
    }
}
