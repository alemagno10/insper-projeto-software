package com.insper.user.user;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.insper.user.user.dto.LoginDTO;
import com.insper.user.user.dto.ReturnUserDTO;
import com.insper.user.user.dto.TokenDTO;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @Autowired
    UserService userService;
    
    @PostMapping
    public TokenDTO login(@RequestBody LoginDTO loginDTO){
        ReturnUserDTO user = userService.valideUser(loginDTO.getEmail(), loginDTO.getPassword());
        String token = RandomStringUtils.random(20, true, true);
        loginService.put(token, user);
        return new TokenDTO(user.getEmail(), token, user.getRoles());
    }

    @GetMapping("/token/{token}")
    public ReturnUserDTO getByToken(@RequestParam String token){
        return loginService.get(token);
    }
}
