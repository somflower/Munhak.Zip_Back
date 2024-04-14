package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisMypageDao;

public interface UserService {
    public int updatePassword(Long id, String newPassword);

}
