package com.auth.loginsuperseguro.controllers;

import com.auth.loginsuperseguro.repository.authRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.auth.loginsuperseguro.UserClass.UserClass;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping("/api")
public class authController {

    @Autowired
    private authRepository repository;


    @PostMapping("/loggeo")
    public void logger(@RequestBody UserClass person){
        repository.consultarApi();

    }
}
