package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Interest;
import com.example.jpetstore.domain.User;
import org.springframework.dao.DataAccessException;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;
import java.util.Map;

public interface UserDao {

    public User getUserById(Long id) throws DataAccessException;
    //비번 변경
    public void updatePassword(Long id, String newPassword) throws DataAccessException;

    public User findUser(String hint, String nickname) throws DataAccessException;

    public void updateNickname(Long id, String newNickname) throws DataAccessException;

    public User existingNickname(String nickname) throws DataAccessException;

    public void deleteUser(Long id) throws DataAccessException;

    public List<User> findAllUser() throws DataAccessException;

    public void addInterest(Interest interest) throws DataAccessException;

    public Interest findInterest(Long id) throws DataAccessException;

    public void updateInterest(Long id, String genre) throws DataAccessException;

    public void addUser(User user) throws DataAccessException;
}
