package com.niit.movieservice.movieArtifact.controller;

import com.niit.movieservice.movieArtifact.model.Movie;
import com.niit.movieservice.movieArtifact.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    private MovieService movieService;

    @Autowired
    MovieController(MovieService movieService){
        this.movieService=movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie){
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllMovies() {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.FOUND);
    }

    @GetMapping("/movie/{movieName}")
    public ResponseEntity<?> getAllMovieByMovieName(@PathVariable String movieName) {
        return new ResponseEntity<>(movieService.getMovieByMovieName(movieName), HttpStatus.FOUND);
    }

    @DeleteMapping("/delete-movie/{movieId}")
    public ResponseEntity<?> deleteMovie(@PathVariable String movieId){
        return new ResponseEntity<>(movieService.deleteMovieByMovieId(movieId), HttpStatus.OK);
    }

    @PutMapping("/movies/{movieName}")
    public ResponseEntity<?> updateMovie(@RequestBody Movie movie,@PathVariable String movieName) {
        return new ResponseEntity<>(movieService.updateMovie(movie,movieName), HttpStatus.OK);
    }

}







