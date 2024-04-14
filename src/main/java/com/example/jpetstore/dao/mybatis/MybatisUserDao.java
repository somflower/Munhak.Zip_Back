package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.UserDao;
import com.example.jpetstore.dao.mybatis.mapper.UserMapper;
import com.example.jpetstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisUserDao implements UserDao {

    @Autowired
    private UserMapper userMapper;
    @Override
    public User getUserById(Long id) throws DataAccessException {
        return userMapper.getUserById(id);
    }

    @Override
    public int updatePassword(String userId, String newPassword) throws DataAccessException {
        System.out.println("MybatisUserDao - updatePassword - userId: " + userId + ", newPassword: " + newPassword);
        return userMapper.updateUserPassword(userId, newPassword);
    }
}
