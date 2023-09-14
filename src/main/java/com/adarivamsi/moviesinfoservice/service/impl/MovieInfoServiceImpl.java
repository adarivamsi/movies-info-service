package com.adarivamsi.moviesinfoservice.service.impl;

import com.adarivamsi.moviesinfoservice.data.MovieInfo;
import com.adarivamsi.moviesinfoservice.repository.MovieInfoRepository;
import com.adarivamsi.moviesinfoservice.service.MoviesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class MovieInfoServiceImpl implements MoviesInfoService {

    @Autowired
    MovieInfoRepository movieInfoRepository;

    public Mono<MovieInfo> addMovieInfo(MovieInfo movieInfo) {
        return movieInfoRepository.save(movieInfo);
    }
}
