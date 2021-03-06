package com.egogrow.commerce.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.egogrow.commerce.dto.MemberDTO;

public interface MemberService extends UserDetailsService {

	/**
	 * ID와 일치하는 계정의 정보를 조회하는 메서드 입니다.
	 * 
	 * @param id 조회할 계정 ssoId 
	 */
	@Override
	public abstract UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException;
	
	public MemberDTO getMemberById(String ssoId);
	
}
