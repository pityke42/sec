package com.bp.sec.service;

import com.bp.sec.dto.ApiKeyAuth;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.authority.AuthorityUtils;

public class AuthService {
    private final static String API_KEY = "pwd";
    private final static String X_API_KEY = "x_api_key";
    public static Authentication getAuth(HttpServletRequest request){
        String apiKey = request.getHeader(X_API_KEY);
        if(apiKey == null || !apiKey.equals(API_KEY)){
            throw new BadCredentialsException("wrong api key");
        }
        return new ApiKeyAuth(AuthorityUtils.NO_AUTHORITIES, apiKey);
    }
}
