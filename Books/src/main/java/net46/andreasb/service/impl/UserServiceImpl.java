package net46.andreasb.service.impl;

import net46.andreasb.model.User;
import net46.andreasb.service.UserService;



public class UserServiceImpl implements UserService {

	@Override
	public void add(User user) {
		//Persist the user object here. 
		System.out.println("User added successfully");

	}

}
