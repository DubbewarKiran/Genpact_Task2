package com.example.Genpact_Tesk2.Services;


import com.example.Genpact_Tesk2.Entitys.Address;
import com.example.Genpact_Tesk2.Entitys.Org;
import com.example.Genpact_Tesk2.Repositorys.Org_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class Org_Service {

    @Autowired
    Org_Repository orgRepository;
    public void add_org(Org org) {
        orgRepository.save(org);
    }

    public List<Address> org_all_branches(int id) {
        return orgRepository.findById(id).get().getAddressList();
    }
}
