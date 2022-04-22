/*
package jm.task.core.jdbc.dao;

import com.mysql.cj.exceptions.CJOperationNotSupportedException;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class UserDaoJDBCImpl extends Util implements UserDao {


    public UserDaoJDBCImpl() {
    }

    Connection connection = Util.getConnection();



    public void createUsersTable() {
        final String CREATE_USER_TABLE = "CREATE TABLE IF NOT EXISTS User"
                + "(id INT(5) NOT NULL AUTO_INCREMENT,"
                + " name VARCHAR(50) NOT NULL, "
                + " lastName VARCHAR(50) NOT NULL, "
                + " age INT NOT NULL, " + "PRIMARY KEY(id))";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(CREATE_USER_TABLE);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {
        final String DROP_USER_TABLE = "DROP TABLE IF EXISTS User";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(DROP_USER_TABLE);
        } catch (SQLException e) {
            System.out.println("Exception due table drop");
        }
    }

    public void saveUser(String name, String lastName, byte age) {
        final String SAVE_USER = "INSERT INTO User (name, lastName, age) VALUES " + " (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_USER);
            preparedStatement.setString(1, name );
            preparedStatement.setString(2, lastName);
            preparedStatement.setByte(3, age);
            preparedStatement.executeUpdate();
            System.out.println("New user: " + name + " was added in db.");
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void removeUserById(long id) {
        final String REMOVE_USER_BY_ID = "DELETE FROM User WHERE id = :id";
        try (PreparedStatement preparedStatement = connection.prepareStatement(REMOVE_USER_BY_ID)) {
            preparedStatement.setLong(1, id);
        } catch (SQLException e) {
            System.out.println("Failed to remove user by id");
        }
    }

    public List<User> getAllUsers() {
        List<User> userArrayList = new ArrayList<>();
        final String GET_ALL_USERS = "SELECT * FROM User";
        try (Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery(GET_ALL_USERS);
            while (resultSet.next()) {
                userArrayList.add(new User(resultSet.getString("name"),
                        resultSet.getString("lastName"),
                        resultSet.getByte("age")));
            }
        } catch (SQLException e) {
            System.out.println("Failed to get all users");
        }
        return userArrayList;
    }

    public void cleanUsersTable() {
        final String CLEAN_USERS_TABLE = "DELETE FROM User";
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate(CLEAN_USERS_TABLE);
    } catch (SQLException e) {
            System.out.println("Failed to clean Users table");
        }
    }
}
*/
