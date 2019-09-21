package com.egogrow.commerce.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.egogrow.commerce.dao.MemberDAO;
import com.egogrow.commerce.dto.MemberDTO;
import com.egogrow.commerce.enums.StateEnum;
import com.egogrow.commerce.service.MemberService;
import com.egogrow.commerce.user.MemberInfo;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO memberDAO;
	
	// 시큐리티의 내용 외 파라미터를 추가하고 싶을 때, 아래 사용 
	boolean accountNonExpired = true; 
	boolean credentialsNonExpired = true; 
	boolean accountNonLocked = true;
	
	@Override
	public UserDetails loadUserByUsername(String ssoId) throws UsernameNotFoundException {
		MemberDTO user = memberDAO.getMemberById(ssoId);
        
        if(user==null){
            throw new UsernameNotFoundException("Username not found");
        }
        
        boolean enabled = user.getMemberState().equals(StateEnum.Active);
        
        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_"+user.getRoleType()));

        MemberInfo result = new MemberInfo (
			user.getMemberSsoId(),
			user.getMemberPassword(), 
			enabled,
			accountNonExpired,
			credentialsNonExpired,
			accountNonLocked,
			authorities,
			user.getMemberName()
		);

        return result;        

	}
	
	@Override
	public MemberDTO getMemberById(String ssoId) {
		return memberDAO.getMemberById(ssoId);
	}

}
