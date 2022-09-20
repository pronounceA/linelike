package com.linelike.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.linelike.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@GetMapping("/{id}")
	public User getUser(@PathVariable int id) {
		//設計により適宜変更
		return new User(id);
	}
	
	@PostMapping("/create")
	public void create(User user) {
		//何かしらの処理
		//service無しでdaoだけ作成してみる
	}
}
