package com.auth.loginsuperseguro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class LoginSuperSeguroApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginSuperSeguroApplication.class, args);
    }

}
