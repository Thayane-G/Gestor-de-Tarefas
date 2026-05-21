package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String URL =
            "jdbc:mysql://localhost:3306/task_manager";

    private static final String USER = "root";

    private static final String PASSWORD = "2207daniele";

    public Connection getConnection() {

        try {

            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {

    throw new RuntimeException(e);
}
    }
}