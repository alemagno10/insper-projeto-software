package com.insper.partida.equipe.Exception;

public class MissingRequiredFieldsException extends RuntimeException{
    public MissingRequiredFieldsException(){
        super("Required Fields are missing!");
    }
}