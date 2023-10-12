package com.insper.partida.tabela;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.*;

@Getter
@Setter
@Document("tabela")
public class Tabela {
    @Id
    private String id;
    private String identifier;
    private String nome;
    private Integer pontos;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    private Integer golsPro;
    private Integer golsContra;
    private Integer jogos;
}
