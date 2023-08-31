package com.insper.partida.aposta;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BetRespository extends MongoRepository<Bet, Integer> {
    List<Bet> findByGameIdentifier(String gameId);
}
