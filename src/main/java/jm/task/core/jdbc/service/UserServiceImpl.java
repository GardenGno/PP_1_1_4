package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDaoHibernateImpl userDaoHibernate = new UserDaoHibernateImpl();

    public UserServiceImpl() {
    }

    @Override
    public void createUsersTable() {
        this.userDaoHibernate.createUsersTable();
    }

    @Override
    public void dropUsersTable() {
        this.userDaoHibernate.dropUsersTable();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
        this.userDaoHibernate.saveUser(name, lastName, age);
    }

    @Override
    public void removeUserById(long id) {
        this.userDaoHibernate.removeUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return this.userDaoHibernate.getAllUsers();
    }

    @Override
    public void cleanUsersTable() {
        this.userDaoHibernate.cleanUsersTable();
    }
}
