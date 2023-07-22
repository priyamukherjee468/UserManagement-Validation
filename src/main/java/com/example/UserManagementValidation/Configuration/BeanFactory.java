package com.example.UserManagementValidation.Configuration;

import com.example.UserManagementValidation.Model.Type;
import com.example.UserManagementValidation.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
    @Bean
    public List<User> getinitialisedList(){
        User initUser=new User(0,"Bitzz","bitz@geekster.com","abed","9898989898",26, LocalDate.of(1996,12,12), Type.ADMIN);
        List<User> initList = new ArrayList<>();
        initList.add(initUser);

        return initList;
    }
}
