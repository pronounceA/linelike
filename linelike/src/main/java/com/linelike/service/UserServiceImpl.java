package com.linelike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.linelike.dao.UserDao;
import com.linelike.entity.User;

@Service
public class UserServiceImpl implements UserDao {
	
	private final UserDao dao;
	
	@Autowired
	public UserServiceImpl(UserDao dao) {
		this.dao = dao;
	}

	@Override
	public User getUserFromId() {
		
		//後で作るよ
		
		return null;
	}

	@Override
	public void insert(User user) {
		dao.insert(user);
	}

}
