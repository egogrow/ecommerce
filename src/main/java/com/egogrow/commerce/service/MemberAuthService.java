package com.egogrow.commerce.service;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;

public interface MemberAuthService extends AuthenticationProvider {

	@Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException;
    @Override
    public boolean supports(Class<?> authentication);	
	public boolean matchPassword(String loginPwd, String password) throws Exception;
	
}
