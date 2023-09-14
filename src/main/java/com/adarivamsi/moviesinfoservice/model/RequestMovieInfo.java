package com.adarivamsi.moviesinfoservice.model;

import lombok.Getter;

import java.time.LocalDate;
import java.util.List;

@Getter
public class RequestMovieInfo {
     String movieInfoId;
     String name;
     Integer year;
     List<String> cast;
     LocalDate releaseDate;
}
