package com.example.jpetstore.dao;

import com.example.jpetstore.domain.User;
import org.springframework.dao.DataAccessException;

public interface MypageDao {

    //닉네임 변경
    public int updateNickname(String userId, String newNickname) throws DataAccessException;

}
