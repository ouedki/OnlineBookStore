package com.yassine.services;

import java.util.Set;

import com.yassine.models.User;
import com.yassine.models.UserRole;

public interface UserService {
	User createUser(User user, Set<UserRole> userRole);
}
