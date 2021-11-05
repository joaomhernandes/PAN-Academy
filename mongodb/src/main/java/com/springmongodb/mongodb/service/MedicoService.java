package com.springmongodb.mongodb.service;

import java.util.List;

import com.springmongodb.mongodb.model.Medico;

public interface MedicoService {
	
	public List<Medico> obterTodos();
	
	public Medico obterPorCod(String cod);
	
	public Medico criar(Medico medico);
	
	public Medico deletar(String cod);

}
