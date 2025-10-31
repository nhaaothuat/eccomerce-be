package com.example.eccomerce.shared.authentication.application;

public final class AuthenticatedUser {
    public static final String PREFERRED_USERNAME="email";

    private AuthenticatedUser(){

    }

    public static Username username(){
        return optionalUsername().o
    }
}
