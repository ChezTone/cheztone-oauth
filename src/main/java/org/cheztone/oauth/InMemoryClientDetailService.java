package org.cheztone.oauth;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/**
 * Created by Tony (20004507)
 * 22/07/2015
 */
@Component
public class InMemoryClientDetailService implements ClientDetailsService {

    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        ClientDetails clientDetails = new ClientDetails() {
            public String getClientId() {
                return null;
            }

            public Set<String> getResourceIds() {
                return null;
            }

            public boolean isSecretRequired() {
                return false;
            }

            public String getClientSecret() {
                return null;
            }

            public boolean isScoped() {
                return false;
            }

            public Set<String> getScope() {
                return null;
            }

            public Set<String> getAuthorizedGrantTypes() {
                return null;
            }

            public Set<String> getRegisteredRedirectUri() {
                return null;
            }

            public Collection<GrantedAuthority> getAuthorities() {
                return null;
            }

            public Integer getAccessTokenValiditySeconds() {
                return null;
            }

            public Integer getRefreshTokenValiditySeconds() {
                return null;
            }

            public boolean isAutoApprove(String scope) {
                return false;
            }

            public Map<String, Object> getAdditionalInformation() {
                return null;
            }
        };
        return clientDetails;
    }
}
