package com.example.jpetstore.dao;

import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;
import com.example.jpetstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

public interface MypageDao {

    public User getUserById(Long userId) throws DataAccessException;
    //닉네임 변경
    public int updateNickname(String userId, String newNickname) throws DataAccessException;

}
