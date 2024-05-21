package com.example.Carservicecompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Carservicecompany.model.CarService;
@Repository
public interface CarServiceRepository extends JpaRepository<CarService,Integer>{

}
