package org.cheztone.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public class CheztoneAuthenticationManager implements AuthenticationManager{

    @Autowired
    private UserDetailsService cheztoneUserDetailsService;

    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UserDetails userDetails = cheztoneUserDetailsService.loadUserByUsername(authentication.getName());
        return  new UsernamePasswordAuthenticationToken(userDetails.getUsername(),userDetails.getPassword(), userDetails.getAuthorities());
    }

}
