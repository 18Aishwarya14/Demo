package com.pes.movies.service;


import entity.MovieEntity;
import repo.MovieRepo;
import repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args){
        MovieEntity movieEntity=new MovieEntity();
        movieEntity.setMovieId(1);
        movieEntity.setLanguage("KGF 2");
        movieEntity.setHero_name("yash");
        movieEntity.setHeroine_name("Srinidhi");
        movieEntity.setRelease_date(LocalDate.of(2022,8, 5 ));


        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(movieEntity);
        repo.readMovies();
    }
}
