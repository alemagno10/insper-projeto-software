package com.insper.partida.game.dto;

import com.insper.partida.game.Game;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class EditGameDTO {
    private Integer scoreHome;
    private Integer scoreAway;
    private Integer attendance;

    public static EditGameDTO covert(Game game){
        EditGameDTO edit = new EditGameDTO();
        edit.setScoreHome(game.getScoreHome());
        edit.setScoreAway(game.getScoreAway());
        edit.setAttendance(game.getAttendance());
        return edit;
    }
}

