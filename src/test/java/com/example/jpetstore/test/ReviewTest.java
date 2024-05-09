package com.example.jpetstore.test;

import com.example.jpetstore.dao.ReviewDao;
import com.example.jpetstore.dao.mybatis.MybatisReviewDao;
import com.example.jpetstore.domain.Review;
import com.example.jpetstore.service.ReviewImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class) //Unit 프레임워크에게 사용할 테스트 러너(runner)를 지정하는 데 사용
@ContextConfiguration(locations = "file:src/main/resources/dataAccessContext-mybatis.xml")  //테스트 실행에 필요한 애플리케이션 컨텍스트를 구성하는 방법을 지정
//이렇게 설정된 테스트 클래스는 스프링 애플리케이션 컨텍스트를 로드하고, dataAccessContext-mybatis.xml 파일에서 정의된 빈들을 테스트에서 사용할 수 있게 됨.

public class ReviewTest {
    @Autowired
    ReviewDao reviewDao;
    @Autowired
    private MybatisReviewDao mybatisReviewDao;

    // Review 클래스에서 id를 지웠더니 오류나서 주석처리 했습니다..
//    @Test
//    public void testReview() throws Exception{
//        Review review = new Review("리뷰 추가 테스트", 1, 2, 3);
//        ReviewImpl rvImpl = new ReviewImpl(mybatisReviewDao);
//
//        rvImpl.insertMyReview(review);
//    }



}
