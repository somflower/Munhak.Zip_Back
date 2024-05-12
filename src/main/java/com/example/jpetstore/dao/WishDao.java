package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Movie;
import com.example.jpetstore.domain.Review;

import java.util.List;
import java.util.Map;

public interface WishDao {
    List<Movie> getWishMovie(int id); // 찜한 영화 가져오기
    List<Review> getWishReview(int id); // 찜한 리뷰 가져오기
    int deleteWishReview(int id, int rvId); // 찜한 리뷰 삭제하기
    List<Review> getMyReview(String userId); // 내가 쓴 리뷰 가져오기
}
