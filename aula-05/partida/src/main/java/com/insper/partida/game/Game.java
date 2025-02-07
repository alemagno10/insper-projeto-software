package com.insper.partida.game;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Getter
@Setter
@Document("game")
public class Game {

    @Id
    private String id;

    private String identifier;

    private Integer scoreHome;

    private Integer scoreAway;

    private String away;

    private String home;

    private String stadium;

    private Integer attendance;

    private LocalDateTime gameDate;

    private String status;

}
