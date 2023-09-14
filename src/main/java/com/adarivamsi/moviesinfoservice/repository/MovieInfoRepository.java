package com.adarivamsi.moviesinfoservice.repository;

import com.adarivamsi.moviesinfoservice.data.MovieInfo;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInfoRepository extends ReactiveMongoRepository<MovieInfo, String> {
}
