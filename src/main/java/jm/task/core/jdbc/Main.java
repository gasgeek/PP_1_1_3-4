package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        UserService service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser("Svetlana", "Sidorova", (byte) 25);
        service.saveUser("Snegana", "Snegova", (byte) 26);
        service.saveUser("Petr", "Kross", (byte) 27);
        service.saveUser("Fedia", "Fedorov", (byte) 28);
        System.out.println(service.getAllUsers());
        service.cleanUsersTable();
        service.dropUsersTable();
        Util.closeConnection();
       /* Util.closeSessionFactory();*/
    }
}
