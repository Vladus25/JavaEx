package com.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
	
import com.test.Entity.CarsEntity;
import com.test.Service.CarsService;

@RestController
public class CarsController {
	
	@Autowired
	private CarsService serv;
	
	@GetMapping("/getAllCars")
	public List<CarsEntity> getUsers() {
		return serv.getCars();
	}
	
	@GetMapping("/cars/users/{userId}")
    public List<CarsEntity> getCarsByUserId(@PathVariable int userId) {
        return serv.getCarsByUserId(userId);
    }
	
	@PostMapping("/cars/{carId}/users/{userId}")
    public ResponseEntity<CarsEntity> assignUserToCar(@PathVariable Long carId, @PathVariable int userId) {
        CarsEntity updatedCar = serv.assignUserToCar(userId, carId);
        return ResponseEntity.ok(updatedCar);
    }
	
}