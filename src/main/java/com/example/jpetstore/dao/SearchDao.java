package com.example.jpetstore.dao;

import com.example.jpetstore.domain.Movie;

import java.util.List;

public interface SearchDao {

    public List<Movie> searchMovieByKeyword(String keyword);
}
