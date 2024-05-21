package com.example.Carservicecompany.service;
 
import java.util.List;
 
import com.example.Carservicecompany.exception.ResourceNotFoundException;
import com.example.Carservicecompany.model.CarService;
 
public interface CarServiceService {
	public CarService saveCarService(CarService CarService) throws ResourceNotFoundException;
	public CarService getCarService(int id) throws ResourceNotFoundException;
	public CarService updateCarService(int id,CarService CarService) throws ResourceNotFoundException;
	public boolean deleteCarServiceById(int id) throws ResourceNotFoundException;
	public List<CarService> showAll();

 
}
