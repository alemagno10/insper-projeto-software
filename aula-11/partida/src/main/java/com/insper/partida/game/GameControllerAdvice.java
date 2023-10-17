package com.insper.partida.game;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.insper.partida.common.ErrorDTO;
import com.insper.partida.equipe.Exception.MissingRequiredFieldsException;
import com.insper.partida.game.Exception.DuplicateTeamException;
import com.insper.partida.game.Exception.GameNotFoundException;

@ControllerAdvice
public class GameControllerAdvice {

    @ExceptionHandler(GameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDTO gameNotFound(GameNotFoundException ex){
        ErrorDTO error = new ErrorDTO(ex.getMessage(), 404, LocalDate.now());
        return error;
    }

    @ExceptionHandler(DuplicateTeamException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO duplicateTeam(DuplicateTeamException ex){
        ErrorDTO error = new ErrorDTO(ex.getMessage(), 400, LocalDate.now());
        return error;
    }

    @ExceptionHandler(MissingRequiredFieldsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO MissingRequiredFieldsException(MissingRequiredFieldsException ex){
        ErrorDTO error = new ErrorDTO(ex.getMessage(), 400, LocalDate.now());
        return error;
    }
}
