package com.project.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.demo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    // Optional<User> existsByEmail(String email);
    boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);

    void deleteByEmail(String email);

}






