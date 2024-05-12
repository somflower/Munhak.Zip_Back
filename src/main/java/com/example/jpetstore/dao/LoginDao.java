package com.example.jpetstore.dao;

import com.example.jpetstore.domain.User;
import org.springframework.dao.DataAccessException;

public interface LoginDao {
    User userLogin(String userId, String password) throws DataAccessException;
}
