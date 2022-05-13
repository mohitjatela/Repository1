package com.mvc.userservice;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.dao.Userdao;
import com.mvc.entity.User;
@Service
public class UserService {
	@Autowired
	private Userdao dao;
	@Transactional
	public int createUser(User user) {
		return dao.insert(user);
	}
}
