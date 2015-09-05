package org.cheztone.oauth;

import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;

/**
 * Created by Tony (20004507)
 * 17/08/2015
 */
public class MongoDbClientDetailService implements ClientDetailsService{

    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        return null;
    }

}
