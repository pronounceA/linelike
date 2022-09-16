package com.linelike.dao;

import com.linelike.entity.User;

public interface UserDao {
	User getUserFromId();
	
	void insert(User user);
}
