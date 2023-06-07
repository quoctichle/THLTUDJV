package com.example.Tich_buoi3.services;

import com.example.Tich_buoi3.entity.CustomUserDetail;
import com.example.Tich_buoi3.entity.User;
import com.example.Tich_buoi3.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService implements UserDetailsService {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUserName(username);
        if(user == null)
            throw new UsernameNotFoundException("Use not found");
        return new CustomUserDetail(user, userRepository);
    }
}