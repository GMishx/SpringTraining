package com.siemens.spring.service;

import java.util.ListIterator;

import com.siemens.spring.bean.User;

public interface UserService {

	void insertUser(User user);

	void updateUser(User user);
	
	void deleteUser(User user);

	ListIterator<User> fetchAllUsers();
}
