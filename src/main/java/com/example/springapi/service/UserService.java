package com.example.springapi.service;

import com.example.springapi.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    private List<User> userList;

    public UserService(List<User> userList) {
        userList = new ArrayList<>();

        User user1 = new User(1,"cata",21,"catacoman11@gmail.com");
        User user2 = new User(2,"serbi",20,"serbi@gmail.com");
        User user3 = new User(3,"dragos",22,"dragos@gmail.com");
        User user4 = new User(4,"raul",23,"raul@gmail.com");
        User user5 = new User(5,"nati",20,"nati@gmail.com");

    }

    public User getUser(Integer id) {
    }
}
