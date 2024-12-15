package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user = new User("Antony", "Robbins", (byte) 24);
        User user1 = new User("Sansa", "Stark", (byte) 16);
        User user2 = new User("Jon", "Snow", (byte) 25);
        User user3 = new User("Steven", "King", (byte) 42);

        UserServiceImpl service = new UserServiceImpl();
        service.createUsersTable();
        service.saveUser(user.getName(), user.getLastName(), user.getAge());
        service.saveUser(user1.getName(), user1.getLastName(), user1.getAge());
        service.saveUser(user2.getName(), user2.getLastName(), user2.getAge());
        service.saveUser(user3.getName(), user3.getLastName(), user3.getAge());
        service.getAllUsers();
        service.cleanUsersTable();
        service.dropUsersTable();
    }
}
