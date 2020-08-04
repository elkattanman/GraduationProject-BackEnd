package com.mufic.Final.security.services;

import com.mufic.Final.model.User;
import com.mufic.Final.repositories.UserRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserPrincipalDetailsService implements UserDetailsService {

    private UserRepository userRepository;

    public UserPrincipalDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {

        User user = userRepository.findByUsername(s)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("USER_NOT_FOUND '%s'.", s)));

        return new UserPrincipal(user);
    }
}
