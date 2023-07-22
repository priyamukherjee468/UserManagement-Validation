package com.example.UserManagementValidation.Repository;

import com.example.UserManagementValidation.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepo {
    @Autowired
    public List<User> userList;
    public List<User> getUsers() {
        return userList;
    }
}
