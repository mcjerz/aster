package com.mcjerz.aster.controller;

import com.mcjerz.aster.entity.User;
import com.mcjerz.aster.repository.UserRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// Still needs controller implementation triggering SB validation before persisting an entity


@RestController

public class UserController {

        private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
        public List<User> getUsers() {
            return userRepository.findAll();
        }

        @PostMapping("/adduser")
        void addUser(@RequestBody User user) {
            userRepository.save(user);
        }

}
