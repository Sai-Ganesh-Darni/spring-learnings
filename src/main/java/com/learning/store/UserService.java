package com.learning.store;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

//@Service
public class UserService {
    private UserRepsitory userRepsitory;
    private NotificationService notificationService;

    public UserService(UserRepsitory userRepsitory, NotificationService notificationService){
        this.userRepsitory = userRepsitory;
        this.notificationService = notificationService;
    }

    public void registerUser(User user){
        if(userRepsitory.findUserById(user.getId()) != null || userRepsitory.findUserByEmail(user.getEmail()) != null){
            throw new IllegalArgumentException("User with Id or email Already exists");
        }
        userRepsitory.save(user);
        notificationService.send("Welcome to our club, Thanks for Registering", user.getEmail());
    }

    public void getUsers(){
        ArrayList<User> users = userRepsitory.getUsers();
        for(User user: users){
            System.out.println(
                    "User:\n" +
                            "ID: "+user.getId() + "\n" +
                            "Name: "+user.getName() + "\n" +
                            "Email: "+user.getEmail() + "\n"
            );
        }
    }

}
