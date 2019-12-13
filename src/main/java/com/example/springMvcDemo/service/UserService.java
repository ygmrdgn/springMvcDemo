package com.example.springMvcDemo.service;

import com.example.springMvcDemo.model.Users;
import com.example.springMvcDemo.repository.RoleRepository;
import com.example.springMvcDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.Valid;
import java.util.Arrays;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Users findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public Users findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    public void saveUser(@Valid Users user) {
        user.setRoles(Arrays.asList(roleRepository.findByRole("USER")));
//        user.setEnabled(true);
        userRepository.save(user);
    }
}
