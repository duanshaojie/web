package cn.duanshaojie.service.impl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.duanshaojie.dao.UserDao;
import cn.duanshaojie.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public HashMap<String, Object> findUser(String username) {
		return userDao.findUserByUsername(username);
	}

}
