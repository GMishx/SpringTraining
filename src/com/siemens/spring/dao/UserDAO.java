package com.siemens.spring.dao;

import java.util.ListIterator;

import com.siemens.spring.bean.User;

public interface UserDAO {

	void insertUser(User user);
	
	void updateUser(User user);
	
	void deleteUser(User user);

	ListIterator<User> fetchAllUsers();
}
