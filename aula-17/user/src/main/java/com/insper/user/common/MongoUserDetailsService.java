package com.insper.user.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.insper.user.user.UserMongo;
import com.insper.user.user.UserRepository;

// como será feito acesso aos usarios 
@Service
public class MongoUserDetailsService implements UserDetailsService{

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) {
        UserMongo userMongo = userRepository.findByEmail(username);
        if(userMongo == null) throw new UnsupportedOperationException("Unimplemented method 'loadUserByUsername'");
        return User.builder().username(userMongo.getEmail()).password(userMongo.getPassword()).roles(userMongo.getRoles().toArray(String[]::new)).build();
    }
    
}
