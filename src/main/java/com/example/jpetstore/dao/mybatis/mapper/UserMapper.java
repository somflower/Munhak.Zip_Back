package com.example.jpetstore.dao.mybatis.mapper;

import com.example.jpetstore.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface UserMapper {
//    @Transactional
//    @Select("SELECT * FROM USER_TABLE WHERE ID = #{id}")
    User getUserById(Long id);

//    @Transactional
//    @Update("UPDATE USER_TABLE SET PASSWORD = #{newPassword} WHERE ID = #{id}")
    void updateUserPassword(@Param("id") Long id, @Param("newPassword") String newPassword);

    //힌트 통해 사용자 찾기
    User findUser(@Param("hint") String hint, @Param("nickname") String nickname);

    //사용자 닉네임 수정
    void updateUserNickname(@Param("id") Long id, @Param("newNickname") String newPassword);

    //사용자 중복 닉네임 체크
    User existingUserNickname(@Param("nickname") String nickname);

    void deleteUser(@Param("id") Long id);
}
