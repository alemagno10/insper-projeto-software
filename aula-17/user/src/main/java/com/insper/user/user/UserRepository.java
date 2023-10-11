package com.insper.user.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    Boolean existsByEmailAndPassword(String email, String password);
}