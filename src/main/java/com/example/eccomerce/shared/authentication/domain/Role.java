package com.example.eccomerce.shared.authentication.domain;

import org.springframework.util.Assert;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Role {
    ADMIN,
    USER,
    ANONYMOUS,
    UNKNOWN;

    private static final String Prefix="ROLE_";
    private static final Map<String,Role> ROLES=buildRole();

    private static Map<String, Role> buildRole() {
    return Stream.of(values()).collect(Collectors.toUnmodifiableMap(Role::key, Function.identity()));
    }

    public String key(){
        return Prefix+ name();
    }

    public static Role from(String role){
        Assert.hasText("role",role);
        return ROLES.getOrDefault(role,UNKNOWN);
    }


}
