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
    @Select("SELECT * FROM USER_TABLE WHERE ID = #{id}")
    User getUserById(Long id);
    @Transactional
   // @Update("UPDATE USER_TABLE SET NICKNAME = #{newnickname} WHERE ID = #{id}")
    int updateUserNickname(@Param("id") Long id, @Param("newnickname") String newnickname);


    @Transactional
    //@Update("UPDATE USER_TABLE SET PASSWORD = #{newpassword} WHERE ID = #{id}")
    int updateUserPassword(@Param("id") Long id, @Param("newpassword") String newpassword);
}

