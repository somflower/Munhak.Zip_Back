package com.example.jpetstore.dao;

import com.example.jpetstore.dao.mybatis.mapper.MyPageMapper;
import com.example.jpetstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;

public interface MypageDao {

    public User getUserById(Long id) throws DataAccessException;
    //닉네임 변경
    public int updateNickname(Long id, String newNickname) throws DataAccessException;

    //현재 비밀번호 확인 -> 이것도 굳이 dao를 만들 필요는 없을 듯

    //비밀번호 변경
    public int changePassword(Long id, String newPassword) throws DataAccessException;
    //새 비밀번호 확인까지 DB에 넣을 필요는 없을 듯 프론트 단에서 하면 될듯

}
