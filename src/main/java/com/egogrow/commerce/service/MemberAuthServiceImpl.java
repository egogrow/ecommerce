package com.egogrow.commerce.service;

import java.util.Collection;

import javax.inject.Inject;

import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import com.egogrow.commerce.dto.MemberDTO;

@Service("memberAuthService")
public class MemberAuthServiceImpl implements MemberAuthService {
	
	@Inject
	private MemberService memberService;
	
	@SuppressWarnings("unchecked")
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        
        String id = (String) authentication.getPrincipal();
        String password = (String) authentication.getCredentials();
        
        MemberDTO user = (MemberDTO) memberService.loadUserByUsername(id);
        Collection<GrantedAuthority> authorities = (Collection<GrantedAuthority>) user.getAuthorities();
        
        try {
			if(!matchPassword(password, user.getPassword())) {
			    throw new BadCredentialsException(id);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
        if(!user.isEnabled()) {
            throw new BadCredentialsException(id);
        }
        
        return new UsernamePasswordAuthenticationToken(id, password, authorities);
    }

	@Override
	public boolean supports(Class<?> authentication) {
		return true;
	}

	@Override
	public boolean matchPassword(String loginPassword, String password) throws Exception {
		return loginPassword.equals(password);
	}

}
