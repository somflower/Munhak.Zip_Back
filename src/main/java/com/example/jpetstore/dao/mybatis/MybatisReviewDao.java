package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.ReviewDao;
import com.example.jpetstore.dao.mybatis.mapper.ReviewMapper;
import com.example.jpetstore.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

@Repository
public class MybatisReviewDao implements ReviewDao {
    @Autowired
    private ReviewMapper reviewMapper;

    @Override
    public void insertMyReview(Review review) throws DataAccessException {
        reviewMapper.insertMyReview(review);
    }


}
