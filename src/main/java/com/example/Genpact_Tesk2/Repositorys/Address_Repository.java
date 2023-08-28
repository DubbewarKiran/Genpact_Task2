package com.example.Genpact_Tesk2.Repositorys;


import com.example.Genpact_Tesk2.Entitys.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Address_Repository extends JpaRepository<Address,Integer> {
}
