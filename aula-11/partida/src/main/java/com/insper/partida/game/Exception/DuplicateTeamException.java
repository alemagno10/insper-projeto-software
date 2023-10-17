package com.insper.partida.game.Exception;

public class DuplicateTeamException extends RuntimeException{
    public DuplicateTeamException(){
        super("Home team must be different from visitor!");
    }
}
