package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisMypageDao;
import com.example.jpetstore.dao.mybatis.MybatisUserDao;

public abstract class UserServiceImpl implements UserService{

    private MybatisUserDao mybatisUserDao;

    public UserServiceImpl(MybatisMypageDao mybatisMypageDao) {
        this.mybatisUserDao = mybatisUserDao;
    }

    public void updatePassword(Long id, String newPassword) {
        mybatisUserDao.updatePassword(id, newPassword);
    }

    public void updateNickname(Long id, String newNickname) { mybatisUserDao.updateNickname(id, newNickname); }

    public void deleteUser(Long id) { mybatisUserDao.deleteUser(id); }
}
