package com.insper.partida.game.Exception;

public class GameNotFoundException extends RuntimeException{
    public GameNotFoundException(){
        super("Game Not Found!");
    }
}
