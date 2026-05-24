package com.learning.store;

import java.util.ArrayList;

public class DbUserRepsitory implements UserRepsitory{
    @Override
    public void save(User user) {
        System.out.println("DB User Repository");
    }

    @Override
    public ArrayList<User> getUsers() {
        return null;
    }

    @Override
    public User findUserByEmail(String email) {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }
}
