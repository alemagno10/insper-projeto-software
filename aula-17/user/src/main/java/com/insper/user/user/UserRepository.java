package com.insper.user.user;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<UserMongo, String> {
    UserMongo findByEmailAndPassword(String email, String password);
    UserMongo findByEmail(String email);
}
