package com.example.jpetstore.test;

import com.example.jpetstore.dao.mybatis.MybatisWishDao;
import com.example.jpetstore.domain.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.*;

//사용할 DB 선언
@RunWith(SpringJUnit4ClassRunner.class) //Unit 프레임워크에게 사용할 테스트 러너(runner)를 지정하는 데 사용
@ContextConfiguration(locations = "file:src/main/resources/dataAccessContext-mybatis.xml")  //테스트 실행에 필요한 애플리케이션 컨텍스트를 구성하는 방법을 지정

public class WishTest {
    @Autowired
    private MybatisWishDao mybatisWishDao;

    @Test // 좋아하는 영화
    public void testGetWishMovie() throws Exception{
        List<Movie> movie1 = mybatisWishDao.getWishMovie(21);
        System.out.println("mih 찜한 영화 가져오기");
        for (Movie movie : movie1) {
            System.out.println("Title: " + movie.getMvTitle());
            System.out.println("Star: " + movie.getMvStar());
            System.out.println("--------------------------");
        }
        System.out.println();

        List<Movie> movie2 = mybatisWishDao.getWishMovie(3);
        System.out.println("dayun 찜한 영화 가져오기");
        for (Movie movie : movie2) {
            System.out.println("Title: " + movie.getMvTitle());
            System.out.println("Star: " + movie.getMvStar());
            System.out.println("--------------------------");
        }
        System.out.println();

        List<Movie> movie3 = mybatisWishDao.getWishMovie(2);
        System.out.println("HMY 찜한 영화 가져오기");
        for (Movie movie : movie3) {
            System.out.println("Title: " + movie.getMvTitle());
            System.out.println("Star: " + movie.getMvStar());
            System.out.println("--------------------------");
        }
    }

    /*@Test
    public void testGetWishReview() throws Exception{
        // 좋아하는 리뷰

    }
    @Test
    public void testGetMyReview() throws Exception{
    // 내가 작성한 리뷰
    }*/


}
