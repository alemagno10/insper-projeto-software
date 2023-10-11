package com.insper.user.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class TokenDTO {
    private String email;
    private String token;
    private List<String> roles;
}
