package com.insper.partida.tabela;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface TabelaRepository extends MongoRepository<Tabela, String>{
    Tabela findByIdentifier(String identifier);
    Tabela findByNome(String nome);
    Boolean existsByNome(String nome);
}
