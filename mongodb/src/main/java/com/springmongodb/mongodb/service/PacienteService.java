package com.springmongodb.mongodb.service;

import java.util.List;

import com.springmongodb.mongodb.model.Paciente;

public interface PacienteService {
	
	public List<Paciente> obterTodos();
	
	public Paciente obterPorCod(String cod);
	
	public Paciente criar(Paciente paciente);
	
	public Paciente deletar(String cod);
}
