package com.springmongodb.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodb.mongodb.model.Paciente;

public interface PacienteRepository extends MongoRepository<Paciente, String>{

}
