package com.insper.partida.tabela;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insper.partida.tabela.dto.TabelaDTO;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TabelaService {

    @Autowired 
    private TabelaRepository tabelaRepository;

    public List<TabelaDTO> getTabelas() {
        return tabelaRepository.findAll().stream().map(tab -> TabelaDTO.covert(tab)).collect(Collectors.toList());
    }

    public TabelaDTO getScoreTeam(String identifier){
        return TabelaDTO.covert(tabelaRepository.findByIdentifier(identifier));
    }

    public TabelaDTO saveTabela(Tabela tabela){
        return TabelaDTO.covert(tabelaRepository.save(tabela));
    }
}
