package com.test.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.Entity.CarsEntity;
import com.test.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

}

