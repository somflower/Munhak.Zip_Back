package com.example.jpetstore.test;


import com.example.jpetstore.dao.SearchDao;
import com.example.jpetstore.dao.mybatis.MybatisSearchMovieDao;
import com.example.jpetstore.domain.Movie;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.*;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/dataAccessContext-mybatis.xml")

//영화 검색 테스트 케이스
public class SearchTest {

    @Autowired
    private MybatisSearchMovieDao mybatisSearchMovieDao;

    @Test
    public void testSearchMovieByKeyword() throws Exception {
        // Given
        // String keyword = "파";

        // When
        List<Movie> movies = mybatisSearchMovieDao.searchMovieByKeyword("파");
        assertNotNull(movies);
        System.out.println("검색결과 가져오기");

        // Check if there are any search results
        if (!movies.isEmpty()) {
            // Then
            for (Movie movie : movies) {
                // Check if movie is not null
                if (movie != null) {

                    System.out.println("MvId: " + movie.getMvId());
                    System.out.println("Title: " + movie.getMvTitle());
                    System.out.println("Star: " + movie.getMvStar());
                    System.out.println("MvDirector: " + movie.getMvDirector());
                    System.out.println("MvDetail: " + movie.getMvDetail());

                    System.out.println("--------------------------");
                } else {

                    System.out.println("Movie is null");
                }
            }
        } else {
            // Log a message if there are no search results
            System.out.println("No search results found");
        }
        System.out.println();
    }

}