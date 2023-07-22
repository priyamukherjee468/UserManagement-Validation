package com.example.UserManagementValidation.Controller;

import com.example.UserManagementValidation.Model.User;
import com.example.UserManagementValidation.Service.UserService;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.PUT;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("users")
    public List<User> getallusers(){
        return userService.getallusers();
    }
    @PostMapping("users")
    String  addUsers(@RequestBody List<User> users){
return userService.addUsers(users);
    }
    @PostMapping("user")
    String  addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @DeleteMapping("user")
    String RemoveUser(@RequestParam @Max(1000)Integer uId){
        return userService.RemoveUser(uId);
    }

    @RequestMapping(value = "user/{id}/email/{emailId}",method = PUT)
    String UpdateUser(@PathVariable Integer id, @PathVariable @Email String emailId){
        return userService.UpdateUser(id,emailId);
    }
}
