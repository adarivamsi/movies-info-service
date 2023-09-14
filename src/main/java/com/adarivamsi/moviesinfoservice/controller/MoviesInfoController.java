package com.adarivamsi.moviesinfoservice.controller;

import com.adarivamsi.moviesinfoservice.data.MovieInfo;
import com.adarivamsi.moviesinfoservice.model.RequestMovieInfo;
import com.adarivamsi.moviesinfoservice.service.MoviesInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1")
public class MoviesInfoController {

    @Autowired
    MoviesInfoService moviesInfoService;

    @PostMapping("/movieInfos")
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<MovieInfo> addMovieInfo(@RequestBody RequestMovieInfo requestMovieInfo) {
        MovieInfo movieInfo = new MovieInfo(requestMovieInfo);
        return moviesInfoService.addMovieInfo(movieInfo).log();
    }
}
