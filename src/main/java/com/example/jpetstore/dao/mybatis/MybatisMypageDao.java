package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.MypageDao;
import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;
import com.example.jpetstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisMypageDao implements MypageDao {
      //MypageDao 재정의 및 구현
    private MyPageMapper myPageMapper;
    public int updateNickname(String userId, String newNickname) throws DataAccessException{
        return myPageMapper.updateUserNickname(userId,newNickname);
    }
}
