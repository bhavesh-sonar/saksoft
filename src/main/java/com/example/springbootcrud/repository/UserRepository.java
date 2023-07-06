package com.example.springbootcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcrud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    

}
