package com.insper.partida.common;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDTO {
    String message;
    Integer code;
    LocalDate time;
}
