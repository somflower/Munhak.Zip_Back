package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisMypageDao;
import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;

public class MypageService {

    //뭔가 이상함
    // 주석처리한 부분처럼 코드를 작성하면 mybatisMypageDao를 작성한 이유가 없음
    // 그냥 바로 DB에 접근해버리는 코드를 넣어버린 셈....
//    private final MyPageMapper myPageMapper;
//
//
//    public MypageService(MyPageMapper myPageMapper){
//        this.myPageMapper = myPageMapper;
//    }
//
//    public int updateNickname(String userId, String newNickname){
//        return myPageMapper.updateUserNickname(userId, newNickname);
//    }

    //서비스에서는 dao호출
    private final MybatisMypageDao mybatisMypageDao;

    public MypageService(MybatisMypageDao mybatisMypageDao) {
        this.mybatisMypageDao = mybatisMypageDao;
    }

    public int updateNickname(String userId, String newNickname) {
        return mybatisMypageDao.updateNickname(userId, newNickname);
    }

}
