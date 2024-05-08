package com.example.jpetstore.service;

import com.example.jpetstore.dao.mybatis.MybatisSearchMovieDao;
import com.example.jpetstore.domain.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchMoviesService {
    @Autowired
    private MybatisSearchMovieDao searchMovieDao;

    public List<Movie> searchMoviesByTitle(String keyword) {

        return searchMovieDao.searchMovieByKeyword(keyword);
    }
}
