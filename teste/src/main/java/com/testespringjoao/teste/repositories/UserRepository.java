package com.testespringjoao.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.testespringjoao.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
