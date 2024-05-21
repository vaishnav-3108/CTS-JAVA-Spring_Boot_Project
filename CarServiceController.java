package com.example.Carservicecompany.controller;
 
import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
 
import com.example.Carservicecompany.model.CarService;
import com.example.Carservicecompany.service.CarServiceService;
 
import jakarta.validation.Valid;
 
@RestController
@RequestMapping("/CarService")
public class CarServiceController {

 
	@Autowired
	CarServiceService car;

	@GetMapping("/show/{id}")
	@ResponseStatus(HttpStatus.OK)
	public CarService getCarServiceById(@PathVariable int id){
		return car.getCarService(id);
	}
	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public CarService SaveCarService(@Valid @RequestBody CarService carservice) {
		return car.saveCarService(carservice);	
	}
	@PutMapping("/update/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public CarService updateCarService(@PathVariable int id, @RequestBody CarService CarService) {
		return car.updateCarService(id, CarService);
	}
	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.ACCEPTED)
	public boolean deleteCarServiceById(@PathVariable int id) {
		return car.deleteCarServiceById(id);
	}
	@GetMapping("/all")
	public List<CarService>showAll(){
		return car.showAll();
	}

 
}