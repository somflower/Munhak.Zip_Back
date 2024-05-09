package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.WishDao;
import com.example.jpetstore.dao.mybatis.mapper.WishMapper;
import com.example.jpetstore.domain.Movie;
import com.example.jpetstore.domain.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MybatisWishDao implements WishDao {
    // WishDao 재정의 및 구현
    @Autowired
    private WishMapper wishMapper;

    @Override
    public List<Movie> getWishMovie(int id) throws DataAccessException{
        return wishMapper.getWishMovie(id);
    }

    @Override
    public List<Review> getWishReview(int id) throws DataAccessException{
        return wishMapper.getWishReview(id);
    }

    @Override
    public int deleteWishReview(int id, int rvId) throws DataAccessException{
        return wishMapper.deleteWishReview(id, rvId);
    }

    @Override
    public List<Review> getMyReview(String userId) throws DataAccessException{
        return wishMapper.getMyReview(userId);
    }
}
