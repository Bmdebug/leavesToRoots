package com.top.sports.data.center.service;

import java.util.List;
import java.util.Map;
import com.top.sports.data.center.repository.UserDao;
import com.top.sports.data.center.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
	private UserDao userDao;
	
	public List<User> getByMap(Map<String,Object> map){
		return userDao.getByMap(map);
	}
	
	public User getById(Integer id){
		return userDao.getById(id);
	}
	
	public User create(User user){
		userDao.create(user);
		return user;
	}
	
	public User update(User user){
		userDao.update(user);
		return user;
	}
	
	public int delete(Integer id){
		return userDao.delete(id);
	}
    
}