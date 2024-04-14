package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisUserDao;

public interface UserService {

    //public UserServiceImpl(MybatisUserDao mybatisUserDao);

    public int updateNickname(String id, String newPassword);
}
