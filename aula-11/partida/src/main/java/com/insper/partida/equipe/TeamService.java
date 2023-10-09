package com.insper.partida.equipe;

import com.insper.partida.equipe.Exception.MissingRequiredFieldsException;
import com.insper.partida.equipe.Exception.TeamNotFoundException;
import com.insper.partida.equipe.dto.SaveTeamDTO;
import com.insper.partida.equipe.dto.TeamReturnDTO;
import com.insper.partida.equipe.exception.TeamAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;


    public List<TeamReturnDTO> listTeams() {
        return teamRepository.findAll().stream().map(team -> TeamReturnDTO.covert(team)).collect(Collectors.toList());
    }

    public TeamReturnDTO saveTeam(SaveTeamDTO saveTeam) {
        if(saveTeam.getIdentifier() == null || saveTeam.getName() == null || saveTeam.getStadium() == null){
            throw new MissingRequiredFieldsException();
        }

        Team team = new Team();
        team.setName(saveTeam.getName());
        team.setIdentifier(saveTeam.getIdentifier());

        team = teamRepository.save(team);
        return TeamReturnDTO.covert(team);
    }


    public void deleteTeam(String identifier) {

        Team team = teamRepository.findByIdentifier(identifier);
        if (team != null) {
            teamRepository.delete(team);
        } else {
            throw new TeamNotFoundException();
        }
    }

    public Team getTeam(String identifier) {
        Team team = teamRepository.findByIdentifier(identifier);
        return team;
    }

    public TeamReturnDTO getTeamDTO(String identifier) {
        Team team = teamRepository.findByIdentifier(identifier);
        if(team == null) throw new TeamNotFoundException();
        return TeamReturnDTO.covert(team);
    }
}
