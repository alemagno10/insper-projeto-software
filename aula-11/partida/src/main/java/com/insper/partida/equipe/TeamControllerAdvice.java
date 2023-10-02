package com.insper.partida.equipe;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import java.time.LocalDate;

import com.insper.partida.common.ErrorDTO;
import com.insper.partida.equipe.Exception.MissingRequiredFieldsException;
import com.insper.partida.equipe.Exception.TeamNotFoundException;

@ControllerAdvice
public class TeamControllerAdvice {

    @ExceptionHandler(TeamNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorDTO userNotFound(TeamNotFoundException ex){
        ErrorDTO error = new ErrorDTO(ex.getMessage(), 404, LocalDate.now());
        return error;
    }

    @ExceptionHandler(MissingRequiredFieldsException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorDTO MissingRequiredFieldsException(MissingRequiredFieldsException ex){
        ErrorDTO error = new ErrorDTO(ex.getMessage(), 400, LocalDate.now());
        return error;
    }
}
