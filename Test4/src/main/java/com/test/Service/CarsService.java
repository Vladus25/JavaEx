package com.test.Service;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.Entity.CarsEntity;
import com.test.Entity.*;
import com.test.Repository.CarsRepository;
import com.test.Repository.UserRepository;

@Service
public class CarsService {
	
	@Autowired
	private CarsRepository repo;
	
	public List<CarsEntity> getCars() {
		return (List<CarsEntity>) repo.findAll();
	}	
	
	public List<CarsEntity> getCarsByUserId(int userId) {
        return repo.findByUsersId(userId);
    }
	
	public CarsEntity assignUserToCar(int userId, Long carId) {
        CarsEntity car = repo.findById(carId)
                .orElseThrow();

        UserEntity user = new UserEntity();
        user.setId(userId);
        car.setUsers(user);

        return repo.save(car);
    }
	
	
}
