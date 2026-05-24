package com.learning.store;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;


@Repository
public class InMemoryUserRepository implements UserRepsitory{
    private HashMap<Long, User> userHashMap;

    public InMemoryUserRepository(){
        this.userHashMap = new HashMap<>();
    }

    @Override
    public void save(User user) {
        userHashMap.put(user.getId(), user);
    }

    public User findUserByEmail(String email){
        for(Long userId: userHashMap.keySet()){
            User user = userHashMap.get(userId);
            if(user.getEmail().equals(email)){
                return user;
            }
        }
        return null;
    }

    public User findUserById(Long id){
        return userHashMap.getOrDefault(id, null);
    }

    public ArrayList<User> getUsers(){
        ArrayList<User> users = new ArrayList<>();
        for(Long userId: userHashMap.keySet()){
            User user = userHashMap.get(userId);
            users.add(user);
        }
        return users;
    }
}
