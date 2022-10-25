package com.example.repository.impl;

import com.example.connection.JDBCConnector;
import com.example.model.User;
import com.example.repository.UserRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    private static final String CREATE_PERSON = "INSERT INTO person (name, address, age) VALUES (?,?,?)";

    private JDBCConnector connector;

    public UserRepositoryImpl(JDBCConnector connector){

        this.connector=connector;
    }


    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public User findById(int id) throws SQLException {
        return null;
    }

    @Override
    public boolean createT(User user) throws SQLException {
        try(Connection connection = connector.getConnection()){
            PreparedStatement statement = connection.prepareStatement(CREATE_PERSON);
            statement.setString(1, user.getName());
            statement.setInt(2, user.getAge());
            statement.setString(3, user.getLogin());
            return statement.executeUpdate()==1;
        }
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean deleteById(int id) throws SQLException {
        return false;
    }
}
