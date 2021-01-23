package com.sandbox.springbootgcpsandbox.service;

import com.sandbox.springbootgcpsandbox.entites.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    public List<User> getAll() {
        return List.of(User.builder()
                        .id(1)
                        .firstName("John")
                        .lastName("Doe")
                        .email("john.doe@gmail.com")
                        .build(),
                User.builder()
                        .id(2)
                        .firstName("Adam")
                        .lastName("Smith")
                        .email("adam.smith@gmail.com")
                        .build(),
                User.builder()
                        .id(2)
                        .firstName("Oleh")
                        .lastName("Onufryk")
                        .email("oleh.onufryk@gmail.com")
                        .build()
        );
    }
}
