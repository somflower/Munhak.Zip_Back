package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisLoginDao;

public class LoginService {
    private final MybatisLoginDao mybatisLoginDao;

    public LoginService(MybatisLoginDao mybatisLoginDao) {
        this.mybatisLoginDao = mybatisLoginDao;
    }

}
