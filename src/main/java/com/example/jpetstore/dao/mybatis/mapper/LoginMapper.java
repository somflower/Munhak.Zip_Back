package com.example.jpetstore.dao.mybatis.mapper;

import com.example.jpetstore.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface LoginMapper {
    //DB 접근
    @Transactional
    @Select("SELECT * FROM USER_TABLE WHERE USER_ID = #{userId} and PASSWORD = #{password}")
    public User userLogin(@Param("userId") String userId, @Param("password") String password);
}
