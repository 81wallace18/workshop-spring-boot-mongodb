package com.wallace.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.wallace.workshopmongo.domain.Post;

public interface PostRepository extends MongoRepository<Post, String>{
	
}