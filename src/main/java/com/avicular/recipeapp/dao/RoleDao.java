package com.avicular.recipeapp.dao;

import com.avicular.recipeapp.entity.Role;

public interface RoleDao {

	public Role findRoleByName(String theRoleName);
	
}
