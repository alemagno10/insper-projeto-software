package com.insper.partida.equipe.Exception;

public class TeamNotFoundException extends RuntimeException{
    public TeamNotFoundException(){
        super("Team not found!");
    }
}
