package com.example.jpetstore.dao.mybatis;

import com.example.jpetstore.dao.SearchDao;
import com.example.jpetstore.dao.mybatis.mapper.SearchMovieMapper;
import com.example.jpetstore.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public class MybatisSearchMovieDao implements SearchDao {

    @Autowired
    private SearchMovieMapper searchmoviemapper;

    @Transactional
    @Override
    public List<Movie> searchMovieByKeyword(String keyword) throws DataAccessException {

        return searchmoviemapper.searchMovieByKeyword(keyword);
    }
}
