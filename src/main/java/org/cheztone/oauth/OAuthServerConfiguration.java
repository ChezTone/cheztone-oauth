package org.cheztone.oauth;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.builders.ClientDetailsServiceBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.ClientDetailsService;

import javax.annotation.Resources;

/**
 * Created by tonyproum on 14/04/15.
 * For cheztone-oauth
 */
@Configuration
@EnableWebSecurity
@EnableAuthorizationServer
public class OAuthServerConfiguration implements AuthorizationServerConfigurer {

    @Autowired
    ClientDetailsService inMemoryClientDetailService;

    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

    }

    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory()
                .withClient("tone")
                .authorizedGrantTypes("authorization_code")
                .authorities("ROLE_CLIENT")
                .scopes("read", "trust")
                .redirectUris("http://cheztone.org")
                .secret("secret123")
                .and()
                .withClient("my-client-with-secret")
                .authorizedGrantTypes("client_credentials", "password")
                .authorities("ROLE_CLIENT")
                .scopes("read")
                .secret("secret");
    }

    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

    }


}
