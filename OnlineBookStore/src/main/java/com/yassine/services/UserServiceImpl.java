package com.yassine.services;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yassine.daos.RoleDao;
import com.yassine.daos.UserDao;
import com.yassine.models.User;
import com.yassine.models.UserRole;

@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	@Autowired
	private RoleDao roleDao;
	@Override
	public User createUser(User user, Set<UserRole> userRole) {
		User u = userDao.findByUsername(user.getUsername());
		if (u!=null) {
			throw new UsernameNotFoundException("Username " + user.getUsername() + " already exist");
		}else {
			System.out.println("______________________");
			System.out.println(user.getUsername());
			System.out.println(user.getUserRoles());
			System.out.println("______________________");
			for(UserRole r : userRole) {
				roleDao.save(r.getRole());
				System.out.println("#############"+r.getRole().getName());
			}
			user.getUserRoles().addAll(userRole);
			u = userDao.save(user);
		}
		return u;
	}
}
