package com.avicular.recipeapp.service;

import com.avicular.recipeapp.entity.User;
import com.avicular.recipeapp.user.AppUser;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

	public User findByUserName(String userName);

	public void save(AppUser appUser);
}
