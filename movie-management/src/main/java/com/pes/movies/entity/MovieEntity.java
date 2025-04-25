package com.pes.movies.entity;


import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class MovieEntity {
    private int movie_id;
    private String languagel;
    private String hero_name;
    private String heroine_name;
    private LocalDate release_date;
}
