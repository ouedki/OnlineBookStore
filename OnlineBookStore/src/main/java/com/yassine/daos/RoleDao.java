package com.yassine.daos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yassine.models.Role;

public interface RoleDao extends JpaRepository<Role, Long>{
	Role findByName(String name);
}
