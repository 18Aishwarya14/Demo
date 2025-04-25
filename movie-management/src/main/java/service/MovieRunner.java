package service;

import entity.MovieEntity;
import repo.MovieRepo;
import repo.MovieRepoImpl;

import java.time.LocalDate;

public class MovieRunner {
    public static void main(String[] args){
        MovieEntity movieEntity=new MovieEntity();
        //movieEntity.setMovieId(2);
        movieEntity.setLanguage("Kannada");
        movieEntity.setHero_name("sudeep");
        movieEntity.setHeroine_name("Radhika");
        movieEntity.setRelease_date(LocalDate.of(2022,8, 5 ));


        MovieRepo repo=new MovieRepoImpl();
        repo.saveMovie(movieEntity);
        repo.readMovies();

    }
}
