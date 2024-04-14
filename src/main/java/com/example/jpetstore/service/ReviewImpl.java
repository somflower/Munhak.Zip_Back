package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisReviewDao;
import com.example.jpetstore.domain.Review;
import org.springframework.stereotype.Service;

@Service
public class ReviewImpl {
    private final MybatisReviewDao mybatisReviewDao;

    public ReviewImpl(MybatisReviewDao mybatisReviewDao) {
        this.mybatisReviewDao = mybatisReviewDao;
    }

    public void insertMyReview(Review review) {
        mybatisReviewDao.insertMyReview(review);
    }
}
