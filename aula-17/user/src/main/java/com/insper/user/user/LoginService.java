package com.insper.user.user;

import java.util.HashMap;
import org.springframework.stereotype.Service;
import com.insper.user.user.dto.ReturnUserDTO;

@Service
public class LoginService {
    
    private HashMap<String, ReturnUserDTO> cache = new HashMap<>();

    public ReturnUserDTO get(String token){
        ReturnUserDTO user = cache.get(token);
        if(user == null){
            throw new RuntimeException("User not found");
        }
        return user;
    }

    public void put(String token, ReturnUserDTO user){
        cache.put(token, user);
    }
}
