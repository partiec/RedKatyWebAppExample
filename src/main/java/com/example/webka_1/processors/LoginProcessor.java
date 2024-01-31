package com.example.webka_1.processors;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {
    private static final String USERNAME = "katy";
    private static final String PASSWORD = "password";

    public boolean isNameAndPasswordCorrect(String name, String password) {
        if (USERNAME.equals(name) && PASSWORD.equals(password)) {
            return true;
        } else return false;
    }


}
