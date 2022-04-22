package jm.task.core.jdbc.util;

/*import jm.task.core.jdbc.model.User;
import org.hibernate.Session;*/
import org.hibernate.SessionFactory;
/*
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
*/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String userName = "root";
    private static final String password = "root";
    private static final String connectionUrl = "jdbc:mysql://localhost:3306/jdbc";
    private static final String driverName = "com.mysql.cj.jdbc.Driver";
    private static Connection connection;
    private static SessionFactory sessionFactory;

    public static Connection getConnection() {
        try {
            Class.forName(driverName);
            connection = DriverManager.getConnection(connectionUrl, userName, password);
            System.out.println("Connection succeed");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Couldn't establish connection");
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("Failed due attempt to close connection");
            }
        }
    }
   /* public static SessionFactory createHibernateSessionFactory() {
        try {
            Properties properties = new Properties();
            properties.setProperty("hibernate.connection.url", connectionUrl);
            properties.setProperty("hibernate.connection.username", userName);
            properties.setProperty("hibernate.connection.password", password);
            properties.setProperty("hibernate.current_session_context_class", "thread");
            properties.setProperty("show_sql", "true");
            Configuration configuration = new Configuration()
                    .addProperties(properties)
                    .addAnnotatedClass(User.class);
            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties())
                    .build();
            return configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void closeSessionFactory() {
        if (sessionFactory != null) {
            sessionFactory.close();
            System.out.println("SessionFactory has closed");
        }
    }*/
}