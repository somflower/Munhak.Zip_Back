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
    public void updatePassword(Long id, String newPassword) throws DataAccessException {
        System.out.println("MybatisUserDao - updatePassword - id: " + id + ", newPassword: " + newPassword);
        userMapper.updateUserPassword(id, newPassword);
    }

    @Override
    public User findUser(String hint,String nickname) throws DataAccessException{
        System.out.println("MybatisUserDao - findUser - hint: " + hint + ", nickname: " + nickname);
        return userMapper.findUser(hint, nickname);
    }

    @Override
    public void updateNickname(Long id, String newNickname) throws DataAccessException{
        System.out.println("MybatisUserDao - updateNickname - id: " + id + ", nickname: " + newNickname);
        userMapper.updateUserNickname(id, newNickname);
    }
}
