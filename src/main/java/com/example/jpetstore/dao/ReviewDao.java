package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Review;
import org.springframework.dao.DataAccessException;

public interface ReviewDao {

    void insertMyReview(Review review) throws DataAccessException;

}
