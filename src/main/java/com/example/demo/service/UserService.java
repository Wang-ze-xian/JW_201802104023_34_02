package com.example.demo.service;
import com.example.demo.bysj.dao.UserDao;
import com.example.demo.bysj.domain.User;

import java.sql.SQLException;
import java.util.Collection;

public final class UserService {
    private static UserDao userDao= UserDao.getInstance();
    private static UserService userService=new UserService();
    private UserService(){}

    public static UserService getInstance(){
        return userService;
    }

    public Collection<User> findAll() throws SQLException {
        return userDao.findAll();
    }

    public User find(Integer id) throws SQLException {
        return userDao.find(id);
    }

    public User findByUsername(String username) throws SQLException {
        return userDao.findByUsername(username);
    }

    public boolean delete(User user) throws SQLException{
       return userDao.delete(user);
    }

    public boolean delete(int id) throws SQLException{
        User user= this.find(id);
        return userDao.delete(user);
    }

    public boolean userToAdd(User user) throws SQLException{
        return userDao.userToAdd(user);
    }

    public User findByPasswordAndUsername(String username,String password) throws SQLException {
        return userDao.findByUsernameAndPassword(username,password);
    }

    public boolean update(User user) throws SQLException {
        return userDao.update(user);
    }

}
