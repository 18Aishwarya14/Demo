package repo;

import entity.MovieEntity;

public interface  MovieRepo {
    void saveMovie(MovieEntity entity);


    void readMovies();
}
