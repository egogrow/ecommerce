package com.egogrow.commerce.dto;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@SuppressWarnings("serial")
public class UserAuthDTO implements UserDetails {
	
	private String userId;
	private String userPassword;
	private String userAuthority;
	private Boolean userEnabled;
	private String userName;
	
	// 계정이 갖고 있는 권한 목록 리턴
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		ArrayList<GrantedAuthority> auth = new ArrayList<>();
		auth.add(new SimpleGrantedAuthority(userAuthority));
		
		return auth;
	}

	@Override
	public String getPassword() {
		return userPassword;
	}

	@Override
	public String getUsername() {
		return userId;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	
	// 계정 활성/비활성
	@Override
	public boolean isEnabled() {
		return userEnabled;
	}

	public String getNAME() {
		return userName;
	}

	public void setNAME(String name) {
		userName = name;
	}
	
}
