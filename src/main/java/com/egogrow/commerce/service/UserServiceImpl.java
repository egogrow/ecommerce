package com.egogrow.commerce.service;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.egogrow.commerce.dao.UserAuthDAO;
import com.egogrow.commerce.dto.UserAuthDTO;

@Service
public class UserServiceImpl implements UserDetailsService {
	
	@Inject
	private UserAuthDAO userAuthDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserAuthDTO user = userAuthDAO.getUserById(username);
        
        if( user == null ) {
            throw new UsernameNotFoundException(username);
        }
        
        return user;
	}

}
