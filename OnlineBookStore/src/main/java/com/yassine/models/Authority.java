package com.yassine.models;

import org.springframework.security.core.GrantedAuthority;

/**
 * Created by Yassine.
 */
public class Authority implements GrantedAuthority{
	private static final long serialVersionUID = 98751L;
	private final String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}
