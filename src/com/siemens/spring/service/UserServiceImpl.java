package com.siemens.spring.service;

import java.util.ListIterator;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.siemens.spring.bean.User;
import com.siemens.spring.dao.UserDAO;

@Transactional
@Service(value = "userService")
public class UserServiceImpl implements UserService {

	@Autowired(required = true)
	UserDAO userDAO;

	@Transactional
	@Override
	public void insertUser(User user) {
		userDAO.insertUser(user);
	}

	@Override
	public ListIterator<User> fetchAllUsers() {
		return userDAO.fetchAllUsers();
	}

	@Transactional
	@Override
	public void updateUser(User user) {
		userDAO.updateUser(user);
	}

	@Transactional
	@Override
	public void deleteUser(User user) {
		userDAO.deleteUser(user);
	}

}
