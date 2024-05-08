package com.example.jpetstore.dao.mybatis.mapper;

import com.example.jpetstore.domain.Movie;
import com.example.jpetstore.domain.Review;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

@Mapper
public interface WishMapper {
     List<Movie> getWishMovie(int id);
     List<Review> getWishReview(int id);
     List<Review> getMyReview(String userId);
}
