package com.egogrow.commerce.dao;

import javax.inject.Inject;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.egogrow.commerce.dto.UserAuthDTO;

@Repository("userAuthDAO")
public class UserAuthDAO {
	
    @Inject
    private SqlSessionTemplate sqlSession;
    
    public UserAuthDTO getUserById(String username) {
        return sqlSession.selectOne("user.selectUserById", username);
    }

}
