package com.linelike.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.linelike.entity.User;

@Repository
public class UserDaoImpl implements UserDao {
	
	private final JdbcTemplate jdbcTemplate;
	
	@Autowired
	public UserDaoImpl(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public User getUserFromId() {
		
		//セッション保持方法決定後に作成
		
		return null;
	}

	@Override
	public void insert(User user) {
		jdbcTemplate.update("INSERT INTO users (name, password) VALUES(?, ?)", 
				user.getName(), user.getPassword());
	}

}
