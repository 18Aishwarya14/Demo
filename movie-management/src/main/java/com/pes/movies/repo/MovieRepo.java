package com.pes.movies.repo;

import com.pes.movies.entity.MovieEntity;

public interface  MovieRepo {
    void saveMovie(MovieEntity entity);
    void readMovies();
}