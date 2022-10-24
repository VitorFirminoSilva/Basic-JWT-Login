package com.login.auth.security;

public interface JWTProps_env {
    public static final int TOKEN_EXPIRE = 600_000;
    public static final String TOKEN_PASSWORD = "password";
    public static final String HEADER_ATTR = "Authorization";
    public static final String ATTRIBUTE_PREFIX = "Bearer ";
}
