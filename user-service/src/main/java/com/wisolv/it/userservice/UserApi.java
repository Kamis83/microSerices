package com.wisolv.it.userservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApi {

    @GetMapping
    public String notUser(){
        return " you are not a user " ;
    }

}
