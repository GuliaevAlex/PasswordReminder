package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBRequest {
    String resource;
    String login;
    String password;

    public void add(){
        String sql = "INSERT INTO source (resource, login, password) VALUES (?,?,?)";

        try(Connection connection = DBManagement.connect();
                PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
                preparedStatement.setString(1, resource);
                preparedStatement.setString(2, login);
                preparedStatement.setString(3, password);
                preparedStatement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
