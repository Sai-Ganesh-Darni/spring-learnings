package com.learning.store;

import java.util.ArrayList;

public interface UserRepsitory {
    void save(User user);
    ArrayList<User> getUsers();
    User findUserById(Long id);
    User findUserByEmail(String email);
}

