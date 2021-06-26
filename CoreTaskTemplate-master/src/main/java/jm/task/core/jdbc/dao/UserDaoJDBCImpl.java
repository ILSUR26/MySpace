package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {

    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

    public List<User> getAllUsers() throws SQLException {
        Connection connection = Util.getConnect();
        connection.setAutoCommit(false);
        Statement statement = null;
        ResultSet resultSet = null;
        List<User> result = new ArrayList<>();

        try {
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT id FROM User");

            while (resultSet.next()) {
                long id = resultSet.getInt("id");
                User user = new User();
                user.setId(id);
                result.add(user);
            }
            connection.commit();

        } catch (SQLException e) {
            connection.rollback();
        } finally {
            connection.close();
        }
        return result;
    }

    public void cleanUsersTable() {

    }
}
