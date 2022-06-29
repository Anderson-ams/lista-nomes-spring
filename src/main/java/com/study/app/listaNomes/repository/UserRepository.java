package com.study.app.listaNomes.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.study.app.listaNomes.models.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	
}
