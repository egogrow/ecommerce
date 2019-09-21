package com.egogrow.commerce.dao;

import org.springframework.stereotype.Repository;

import com.egogrow.commerce.dto.MemberDTO;

@Repository("memberDAO")
public interface MemberDAO extends BaseDAO<Integer,MemberDTO> {

	public MemberDTO getMemberById(String ssoId);
	
}
