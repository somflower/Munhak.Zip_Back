package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.UserDao;
import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;
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
    public User getUserById(Long userId) throws DataAccessException {
        return null;
    }

    @Override
    public int updatePassword(String userId, String newPassword) throws DataAccessException {
        return 0;
    }
}
