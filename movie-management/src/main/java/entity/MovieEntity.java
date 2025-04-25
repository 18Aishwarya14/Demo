package entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
public class MovieEntity {



    private int movieId;
    private String language;
    private String hero_name;
    private String heroine_name;
    private LocalDate release_date;
}
