package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

    public UserServiceImpl() {
    }

    @Override
    public void createUsersTable() {
        this.userDaoJDBC.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        this.userDaoJDBC.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        this.userDaoJDBC.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        this.userDaoJDBC.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDaoJDBC.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        this.userDaoJDBC.cleanUsersTable();
    }
}
