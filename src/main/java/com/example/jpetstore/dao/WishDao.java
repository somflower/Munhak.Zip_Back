package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Movie;
import com.example.jpetstore.domain.Review;

import java.util.List;
import java.util.Map;

public interface WishDao {
    List<Movie> getWishMovie(int id); // 찜한 영화 가져오기
    Review getWishReview(String userId); // 찜한 리뷰 가져오기
    // public String getMyReview(String userId); // 내가 쓴 리뷰 가져오기
}
