package com.example.jpetstore.dao.mybatis.mapper;

import com.example.jpetstore.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface MyPageMapper {
    //DB 접근
    @Transactional
    @Select("SELECT * FROM USER_TABLE WHERE ID = #{userId}")
    User getUserById(Long userId);
    @Transactional
    @Update("UPDATE USER_TABLE SET NICKNAME = #{newnickname} WHERE USER_ID = #{userid}")
    int updateUserNickname(@Param("userid") String userid, @Param("newnickname") String newnickname);

}

