package com.example.jpetstore.test;

import com.example.jpetstore.dao.SearchDao;
import com.example.jpetstore.dao.mybatis.MybatisSearchMovieDao;
import com.example.jpetstore.domain.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/resources/dataAccessContext-mybatis.xml")

public class SearchTest {
    @Autowired
    private SearchDao searchDao;

    @Autowired
    private MybatisSearchMovieDao mybatisSearchMovieDao;

    @Test
    public void testSearchMovieByKeyword() throws IOException {
        // Given
        String keyword = "파";

        // When
        List<Movie> movies = mybatisSearchMovieDao.searchMovieByKeyword(keyword);

        // Then
        assertNotNull(movies);
        assertFalse(movies.isEmpty());
        for (Movie movie : movies) {
            assertNotNull(movie.getMvId());
            assertNotNull(movie.getMvTitle());
            assertNotNull(movie.getMvStar());
            assertNotNull(movie.getMvDetail());
            assertTrue(movie.getMvTitle().contains(keyword));
            System.out.println("Title: " + movie.getMvTitle());
            System.out.println("Star: " + movie.getMvStar());
            System.out.println("--------------------------");
        }
    }
}