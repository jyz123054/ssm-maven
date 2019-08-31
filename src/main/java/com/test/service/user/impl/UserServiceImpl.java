package com.test.service.user.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.test.dao.UserServiceDao;
import com.test.model.UserEntity;
import com.test.service.user.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserServiceDao userServiceDao;

	@Override
	public UserEntity getUserInfo(Long id) {
		return userServiceDao.getUserInfo(id);
	}
	
}
