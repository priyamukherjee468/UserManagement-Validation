package com.example.UserManagementValidation.Service;

import com.example.UserManagementValidation.Model.User;
import com.example.UserManagementValidation.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getallusers() {
        return userRepo.getUsers();
    }

    public String addUsers(List<User> users) {
        List<User> originalList=userRepo.getUsers();
        originalList.addAll(users);
        return "users are added!";
    }

    public String addUser(User user) {
        List<User> originalList=userRepo.getUsers();
        originalList.add(user);
        return "user are added!";
    }

    public String RemoveUser(Integer uId) {
        List<User> originalList=userRepo.getUsers();
        for(User u:originalList){
            if(uId.equals(u.getUserId())){
                originalList.remove(u);
                return "user removed!";
            }
        }
        return "id not found.";
    }

       public String UpdateUser(Integer id, String emailId) {
        List<User> originalList=userRepo.getUsers();
        for(User u:originalList){
            if(id.equals(u.getUserId())){
                u.setUserEmail(emailId);
                return "Updated.!";
            }
        }
        return "id not found.";
    }
}
