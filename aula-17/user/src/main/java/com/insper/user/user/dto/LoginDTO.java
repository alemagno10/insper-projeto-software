package com.insper.user.user.dto;

import com.insper.user.user.UserMongo;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginDTO {
    private String email;
    private String password;

    public static ReturnUserDTO convert(UserMongo user) {
        ReturnUserDTO userDTO = new ReturnUserDTO();
        userDTO.setEmail(user.getEmail());
        userDTO.setRoles(user.getRoles());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }

}