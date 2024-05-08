package com.example.jpetstore.dao.mybatis.mapper;

import com.example.jpetstore.domain.Movie;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Mapper
public interface SearchMovieMapper {
    //    검색 키워드로 영화 검색

    List<Movie> searchMovieByKeyword(@Param("keyword") String keyword);

}
