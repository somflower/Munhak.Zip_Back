package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisMypageDao;
import com.example.jpetstore.dao.mybatis.MybatisUserDao;

public abstract class UserServiceImpl implements UserService{

    private final MybatisUserDao mybatisUserDao;

    public UserServiceImpl(MybatisMypageDao mybatisMypageDao) {
        this.mybatisUserDao = mybatisUserDao;
    }

    public int updateNickname(String id, String newNickname) {
        return mybatisUserDao.updatePassword(id, newNickname);
    }
}
