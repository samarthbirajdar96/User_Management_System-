package com.geekster.UserManagementSystem;

import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class Beansfactory {

    @Bean
    List<User> getdata(){
        return new ArrayList<>();
    }
}
