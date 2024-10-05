package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("name1", "lastName1", (byte)24);
        userService.saveUser("name2", "lastName2", (byte)33);
        userService.saveUser("name3", "lastName3", (byte)51);
        userService.saveUser("name4", "lastName4", (byte)12);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
