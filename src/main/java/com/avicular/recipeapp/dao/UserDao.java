package com.avicular.recipeapp.dao;

import com.avicular.recipeapp.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
