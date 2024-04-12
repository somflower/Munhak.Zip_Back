package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;

public class MypageService {

    private final MyPageMapper myPageMapper;


    public MypageService(MyPageMapper myPageMapper){
        this.myPageMapper = myPageMapper;
    }

    public int updateNickname(String userId, String newNickname){
        return myPageMapper.updateUserNickname(userId, newNickname);
    }
}
