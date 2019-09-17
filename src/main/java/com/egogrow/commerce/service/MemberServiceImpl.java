package com.egogrow.commerce.service;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.egogrow.commerce.dao.MemberDAO;
import com.egogrow.commerce.dto.MemberDTO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO memberDAO;
	
	@Override
	public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException {
		MemberDTO user = memberDAO.getUserById(id);
		
        if( user == null ) {
            throw new UsernameNotFoundException(id);
        }
        
		return user;
	}

}