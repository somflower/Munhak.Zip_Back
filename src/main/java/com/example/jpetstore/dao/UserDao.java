package com.example.jpetstore.dao;

import com.example.jpetstore.domain.User;
import org.springframework.dao.DataAccessException;

public interface UserDao {

    public User getUserById(Long userId) throws DataAccessException;
    //비번 변경
    public int updatePassword(String userId, String newPassword) throws DataAccessException;
}
