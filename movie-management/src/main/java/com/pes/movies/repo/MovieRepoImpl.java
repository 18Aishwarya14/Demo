package com.pes.movies.repo;

import com.pes.movies.entity.MovieEntity;

import java.sql.*;

public class MovieRepoImpl implements MovieRepo{
    @Override
    public void saveMovie(MovieEntity entity){
        String url="jdbc:mysql://localhost:3306/moviedata";
        String userName="root";
        String psw="Root@123";
        String query="insert into movie_info(movie_name, movie_hero, movie_heroine, language, release_date) values(?,?,?,?,?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =DriverManager.getConnection(url,userName,psw);
            PreparedStatement statement =connection.prepareStatement(query);
            statement.setInt(1,entity.getMovie_id());
            statement.setString(1,entity.getMovie_name());
            statement.setString(2,entity.getMovie_hero());
            statement.setString(3,entity.getMovie_heroine());
            statement.setString(4,entity.getLanguage());
            statement.setDate(5, Date.valueOf(entity.getRelease_date()));
            statement.execute();
            System.out.println(entity.getMovie_name()+": Data is saved");

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readMovies() {
        String url="jdbc:mysql://localhost:3306/moviedata";
        String userName="root";
        String psw="Root@123";
        String query="select * from movie_info";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =DriverManager.getConnection(url,userName,psw);
            PreparedStatement statement =connection.prepareStatement(query);
            ResultSet set=statement.executeQuery();
            while(set.next()) {
                System.out.print(set.getInt("movie_id") + " " + set.getString("movie_name")+" "+set.getDate("release_date"));
                System.out.println("");
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}