package com.linelike.service;

import java.util.Optional;

import com.linelike.entity.User;

public interface UserService {
	Optional<User> getUser();
	
	void insert(User user);
}
