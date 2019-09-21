package com.egogrow.commerce.service.impl;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.egogrow.commerce.dao.MemberDAO;
import com.egogrow.commerce.dto.MemberDTO;
import com.egogrow.commerce.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
	
	@Inject
	private MemberDAO memberDAO;

	@Override
	public MemberDTO getMemberById(String ssoId) {
		return memberDAO.getMemberById(ssoId);
	}

}
