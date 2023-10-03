package com.insper.partida.tabela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insper.partida.tabela.dto.TabelaDTO;

import java.util.List;

@RestController
@RequestMapping("/tabela")
public class TabelaController {

    @Autowired
    private TabelaService tabelaService;

    @GetMapping
    public List<TabelaDTO> getTabela() {
        return tabelaService.getTabelas();
    }
    
    @GetMapping("/{identifier}/score")
    public TabelaDTO getScoreTeam(@PathVariable String identifier) {
        return tabelaService.getScoreTeam(identifier);
    }
}
