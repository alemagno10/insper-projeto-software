package com.insper.partida.equipe.Exception;

public class TeamAlreadyExistsException extends RuntimeException {

    public TeamAlreadyExistsException() {
        super("Team Already Exists!");
    }

}
