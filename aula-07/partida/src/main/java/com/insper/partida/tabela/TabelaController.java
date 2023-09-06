package com.insper.partida.tabela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insper.partida.game.GameService;

import java.util.*;;

@RestController
@RequestMapping("/tabela")
public class TabelaController{

    @Autowired
    private TabelaService tabelaService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<TimeDTO> getTabela(){

    }
}