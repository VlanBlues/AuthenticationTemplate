package com.lan.authentication.auth.config.shiro.jwt;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * JwtToken
 * @author lan
 */
public class JwtToken implements AuthenticationToken {
    /**
     * Token
     */
    private String token;

    public JwtToken(String token) {
        this.token = token;
    }

    @Override
    public Object getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
