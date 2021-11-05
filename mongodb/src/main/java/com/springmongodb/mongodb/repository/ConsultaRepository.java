package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.mongodb.model.Consulta;

public interface ConsultaRepository extends MongoRepository<Consulta, String> {

}
