package com.insper.partida.aposta;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Document("bet")
public class Bet {

    @Id
    private Integer id;
    private BetStatus status;
    private BetResult result;

    private String gameIdentifier;

}
