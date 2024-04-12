package com.example.jpetstore.dao.mybatis.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

public interface MyPageMapper {

    @Update("UPDATE USER_TABLE SET NICKNAME = #{newnickname} WHERE USER_ID = #{userid}")
    int updateUserNickname(@Param("userid") String userid, @Param("newnickname") String newnickname);

}

