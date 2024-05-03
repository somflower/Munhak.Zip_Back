package com.example.jpetstore.dao;

import com.example.jpetstore.domain.User;
import org.springframework.dao.DataAccessException;

public interface UserDao {

    public User getUserById(Long id) throws DataAccessException;
    //비번 변경
    public void updatePassword(Long id, String newPassword) throws DataAccessException;

    public User findUser(String hint, String nickname) throws DataAccessException;

    public void updateNickname(Long id, String newNickname) throws DataAccessException;

    public User existingNickname(String nickname) throws DataAccessException;
}
