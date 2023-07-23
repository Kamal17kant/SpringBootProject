package com.jpa.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.entities.Users;


public interface UserRepo extends JpaRepository<Users, Integer> {
		public List<Users> findByName(String name);
		public List<Users> findByNameAndCity(String name,String city);
}
