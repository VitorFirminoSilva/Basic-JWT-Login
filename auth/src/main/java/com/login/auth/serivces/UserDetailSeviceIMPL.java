package com.login.auth.serivces;

import com.login.auth.details.UserDataDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class UserDetailSeviceIMPL implements UserDetailsService {

    private final UserService userService;

    public UserDetailSeviceIMPL(UserService userService) {
        this.userService = userService;
    }
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        if (!userService.existsByUsername(username)) {
            throw new UsernameNotFoundException("User email not found");
        }

        return new UserDataDetails(userService.findByUsername(username));
    }

}
