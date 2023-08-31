package com.insper.partida.equipe.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TeamReturnDTO {
    private String identifier;
    private String name;

    public static TeamReturnDTO covert(String identifier, String name) {
        TeamReturnDTO teamReturnDTO = new TeamReturnDTO();
        teamReturnDTO.setIdentifier(identifier);
        teamReturnDTO.setName(name);
        return teamReturnDTO;
    }
}
