package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.mongodb.model.Medico;

public interface MedicoRepository extends MongoRepository<Medico, String>  {

}
