package com.adarivamsi.moviesinfoservice.service;

import com.adarivamsi.moviesinfoservice.data.MovieInfo;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface MoviesInfoService {
    Mono<MovieInfo> addMovieInfo(MovieInfo movieInfo);
}
