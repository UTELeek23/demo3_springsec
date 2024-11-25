package com.leek.demo3_springsec.config;

import com.leek.demo3_springsec.Entity.Role;
import com.leek.demo3_springsec.Entity.Users;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SimpleTimeZone;

@Service
public class MyUserService implements UserDetailsService {
    private static final long serialVersionUID = 1L;
    private Users user;
    public MyUserService(Users user) {
        this.user = user;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        Set<Role> roles = user.getRoles();
        List<SimpleGrantedAuthority>
    }
}
