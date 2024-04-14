package com.example.jpetstore.dao.mybatis.mapper;

import com.example.jpetstore.domain.Review;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ReviewMapper {
    void insertMyReview(Review review);
}
