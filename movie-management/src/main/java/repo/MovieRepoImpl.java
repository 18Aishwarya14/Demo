package repo;

import entity.MovieEntity;

import java.sql.*;

import static java.lang.Class.forName;

public class MovieRepoImpl implements MovieRepo {
    @Override
    public void saveMovie(MovieEntity entity) {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String username = "root";
        String psw = "root@123";
        // movie_id,movie_name,hero_Name,heroine_Name,language,release_data
        String query = "insert into movie_info( languagel, hero_name, heroine_name, release_date)" +
                "values(?,?,?,?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            // statement.setInt(1,entity.getMovieId());
            statement.setString(1, entity.getLanguage());
            statement.setString(2, entity.getHero_name());
            statement.setString(3, entity.getHeroine_name());
            statement.setDate(4, Date.valueOf(entity.getRelease_date()));
            statement.execute();


            System.out.println(entity.getMovieId() + ":Date is saved");


        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void readMovies() {
        String url = "jdbc:mysql://localhost:3306/moviedata";
        String username = "root";
        String psw = "root@123";
        // movie_id,movie_name,hero_Name,heroine_Name,language,release_data
        String query = "select * from movie_info";


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, psw);
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet set = statement.executeQuery();

            while (set.next()) {
                System.out.print((set.getInt("movie_id") + " "
                        + set.getString("languagel")) + " " + set.getDate("release_date"));
                System.out.println(" ");
            }

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}






