package com.adarivamsi.moviesinfoservice.data;

import com.adarivamsi.moviesinfoservice.model.RequestMovieInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class MovieInfo {
    @Id
    private String movieInfoId;
    private String name;
    private Integer year;
    private List<String> cast;
    private LocalDate releaseDate;

    public MovieInfo(RequestMovieInfo requestMovieInfo) {
        this.name = requestMovieInfo.getName();
        this.year = requestMovieInfo.getYear();
        this.cast = requestMovieInfo.getCast();
        this.releaseDate = requestMovieInfo.getReleaseDate();
    }
}
