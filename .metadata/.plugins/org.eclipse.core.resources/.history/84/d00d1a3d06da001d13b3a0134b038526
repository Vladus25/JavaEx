package com.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.Service.UserService;
import com.test.Entity.CarsEntity;
import com.test.Entity.UserEntity;

@RestController
public class UserController {
	
	@Autowired
	private UserService serv;
	
	@GetMapping("/getAllUsers")
	public List<UserEntity> getUsers() {
		return serv.getUsers();
	}
	
	@PostMapping("/addUser")
	public ResponseEntity<UserEntity> addUser(@RequestBody UserEntity user) {
		UserEntity newUser = serv.addUsers(user);
		return ResponseEntity.ok(newUser);
	}
	
	@DeleteMapping("/users/{userId}")
	public ResponseEntity<UserEntity> deleteUser(@PathVariable Integer userId) {
		try {
			serv.deleteUser(userId);
			return ResponseEntity.noContent().build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
	}
}