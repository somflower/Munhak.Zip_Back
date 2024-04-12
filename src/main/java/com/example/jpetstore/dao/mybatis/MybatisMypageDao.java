package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.MypageDao;
import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;
import com.example.jpetstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class MybatisMypageDao implements MypageDao {
      //MypageDao 재정의 및 구현
   @Autowired  //의존성 주입을 해주지 않으면, 즉(@Autowired)를 해주지 않으면 NullPointerException에러가 나니 주의!!!!
    private MyPageMapper myPageMapper;

    @Transactional  //Transactional 어노테이션을 정의해주어 트랜잭션 관리를 해준다.
//이 어노테이션을 정의해주지 않으면 변경이 발생할 때 DB에 반영이 안될 수도 있음. 해주는 것이 좋습니다.!!!!!
//이 어노테이션은 변경을 트랜잭션으로 묶어서 커밋하거나 롤백하는 데 사용됩니다!!!
    public User getUserById(Long userId) throws DataAccessException {
        return myPageMapper.getUserById(userId);
    }

    @Transactional
   public int updateNickname(String userId, String newNickname) throws DataAccessException {
        System.out.println("MybatisMypageDao - updateNickname - userId: " + userId + ", newNickname: " + newNickname);
        return myPageMapper.updateUserNickname(userId, newNickname);
    }



}
