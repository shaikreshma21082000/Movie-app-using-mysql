package com.niit.movieservice.movieArtifact.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    private String movieId;
    private String movieName;
    private String movieType;
    private String cast;

    public Movie() {
    }

    public Movie(String movieId, String movieName, String movieType, String cast) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.movieType = movieType;
        this.cast = cast;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieType() {
        return movieType;
    }

    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }

    public String getCast() {
        return cast;
    }

    public void setCast(String cast) {
        this.cast = cast;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieId=" + movieId +
                ", movieName='" + movieName + '\'' +
                ", movieType='" + movieType + '\'' +
                ", cast='" + cast + '\'' +
                '}';
    }
}