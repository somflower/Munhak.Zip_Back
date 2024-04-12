package com.example.jpetstore.dao;

import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;
import com.example.jpetstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

public interface MypageDao {

    //솔직히 이 아이는 왜 있어야하는지는 모르겠습니다...
    //정리 좀 하고 나중에 교수님께 여쭤보려고 합니다..

    public User getUserById(Long userId) throws DataAccessException;
    //닉네임 변경
    public int updateNickname(String userId, String newNickname) throws DataAccessException;

}
