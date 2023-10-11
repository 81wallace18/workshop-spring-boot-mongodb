package com.wallace.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wallace.workshopmongo.domain.User;

public interface UserRepository extends MongoRepository<User, String>{
	
}
