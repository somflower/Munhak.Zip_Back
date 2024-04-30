package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisMypageDao;
import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;

public class MypageService {

    //서비스에서는 dao호출
    private final MybatisMypageDao mybatisMypageDao;

    public MypageService(MybatisMypageDao mybatisMypageDao) {

        this.mybatisMypageDao = mybatisMypageDao;
    }

    public int updateNickname(Long id, String newNickname) {
        return mybatisMypageDao.updateNickname(id, newNickname);
    }

    //비밀번호 변경
    public int changePassword(Long id, String newPassword){
        return mybatisMypageDao.changePassword(id, newPassword);
    }
}
