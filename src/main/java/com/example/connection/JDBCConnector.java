package com.example.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnector {
    //создаем поля! 1 - юрл, 2 - имя, 3 - пароль. Можно посмотреть в датабасе баночка с инстурментом
        private static final String JDBC_URL = "jdbc:mysql://localhost:3306/testdb";
        private static final String USER = "root";
        private static final String PASSWORD = "11092002";
        private Connection connection;

        //теперь надо написать метод котоырй возращает коннектион с учетом данных

        public Connection getConnection() {
            //если конекош = 0,
            if (connection == null) {
                try {
                    connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD);
                    return connection;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            return connection;
        }
}
