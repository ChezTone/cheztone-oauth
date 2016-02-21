package org.cheztone.security.config;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;

@Service
public class CheztoneUserDetailsService implements UserDetailsService {

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new UserDetails() {
            public Collection<? extends GrantedAuthority> getAuthorities() {
                GrantedAuthority grantedAuthority = new GrantedAuthority() {
                    public String getAuthority() {
                        return "USER";
                    }
                };
                return Collections.singleton(grantedAuthority);
            }

            public String getPassword() {
                return "password";
            }

            public String getUsername() {
                return "user";
            }

            public boolean isAccountNonExpired() {
                return false;
            }

            public boolean isAccountNonLocked() {
                return false;
            }

            public boolean isCredentialsNonExpired() {
                return false;
            }

            public boolean isEnabled() {
                return true;
            }
        };
    }
}
