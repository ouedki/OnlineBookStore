package com.yassine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.yassine.daos.UserDao;
import com.yassine.models.User;

@Service
public class UserSecurityService implements UserDetailsService{

	@Autowired
	private UserDao userDao;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userDao.findByUsername(username);
		if (user == null) {
			throw new UsernameNotFoundException("Username " +  username + " not found in data base");
		}
		return user;
	}
}