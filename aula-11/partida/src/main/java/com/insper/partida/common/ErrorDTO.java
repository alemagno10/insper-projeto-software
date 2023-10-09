package com.insper.partida.common;

import java.time.LocalDate;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
public class ErrorDTO {
    private String message;
    private Integer code;
    private LocalDate time;
}
