package com.egogrow.commerce.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.egogrow.commerce.dto.MemberDTO;

@Repository("memberDAO")
public class MemberDAO {
	
    @Inject
    private SqlSessionTemplate sqlSession;
    
    public MemberDTO getUserById(String id) {
        return sqlSession.selectOne("member.selectUserById", id);
    }    

}
