package com.yassine.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.models.User;

public interface UserDao extends JpaRepository<User, Long>{
	User findByUsername(String username);
}
