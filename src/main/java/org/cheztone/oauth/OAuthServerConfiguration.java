package org.cheztone.oauth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * Created by tonyproum on 14/04/15.
 * For cheztone-oauth
 */
@Configuration
@EnableWebSecurity
@EnableAuthorizationServer
public class OAuthServerConfiguration implements AuthorizationServerConfigurer {

    public void configure(AuthorizationServerSecurityConfigurer security) throws Exception {

    }

    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.configure(clients.inMemory());
    }

    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {

    }


}
