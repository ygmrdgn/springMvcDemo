package com.example.springMvcDemo.repository;

import com.example.springMvcDemo.model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
    Users findByUsername(String username);

    Users findByEmail(String email);
}
