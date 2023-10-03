package com.insper.partida.tabela.dto;

import org.modelmapper.ModelMapper;

import com.insper.partida.tabela.Tabela;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TabelaDTO {

    private static ModelMapper modelMapper = new ModelMapper();

    private String id;
    private String identifier;
    private String nome;
    private Integer pontos;
    private Integer golsPro;
    private Integer golsContra;
    private Integer vitorias;
    private Integer derrotas;
    private Integer empates;
    private Integer jogos;

    public static TabelaDTO covert(Tabela tabela){
        return modelMapper.map(tabela, TabelaDTO.class);
    }
}

