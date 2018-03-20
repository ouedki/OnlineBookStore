package com.yassine;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yassine.configuration.SecurityUtility;
import com.yassine.models.Role;
import com.yassine.models.User;
import com.yassine.models.UserRole;
import com.yassine.services.UserService;

@SpringBootApplication
public class OnlineBookStoreApplication implements CommandLineRunner{
	
	@Autowired
	private UserService userService;


	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		// TODO Auto-generated method stub
//		User user1 = new User(null, "user1", SecurityUtility.passwordEncoder().encode("1234"), "samir", "oussou", "samir@gmail.com", "2100001111", true);
//		User user2 = new User(null, "admin", SecurityUtility.passwordEncoder().encode("1234"), "reda", "talyani", "reda@gmail.com", "2100002222", true);
//		Set<UserRole> userRoles = new HashSet<>();
//		
//		Role role1=new Role();
//		role1.setName("ROLE_USER");
//		userRoles.add(new UserRole(user1, role1));
//		
//		userService.createUser(user1, userRoles);
//		
//		Set<UserRole> userRoles2 = new HashSet<>();
//		Role role2=new Role();
//		role2.setName("ROLE_ADMIN");
//		userRoles2.add(new UserRole(user2, role2));
//		
//		userService.createUser(user2, userRoles2);

	}
}
