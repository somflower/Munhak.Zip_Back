package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.LoginDao;
import com.example.jpetstore.dao.mybatis.mapper.LoginMapper;
import com.example.jpetstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MybatisLoginDao implements LoginDao {
    //LoginDao 재정의 및 구현
    @Autowired
    private LoginMapper loginMapper;

    @Transactional
    @Override
    public User userLogin(String userId, String password) throws DataAccessException {
        return loginMapper.userLogin(userId, password);
    }
}
