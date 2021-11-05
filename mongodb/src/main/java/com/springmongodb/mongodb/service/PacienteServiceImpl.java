package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Paciente;
import com.springmongodb.mongodb.repository.PacienteRepository;

@Service
public class PacienteServiceImpl implements PacienteService {
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@Override
	public List<Paciente> obterTodos() {
		return this.pacienteRepository.findAll();
	}
	
	@Override
	public Paciente obterPorCod(String cod) {
		return this.pacienteRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Paciente inexistente!"));
	}
	
	@Override
	public Paciente criar(Paciente paciente) {	
		return this.pacienteRepository.save(paciente);
	}
	
	@Override
	public Paciente deletar(String cod) {
		Paciente retorno = obterPorCod(cod);
		this.pacienteRepository.deleteById(cod);
		return retorno;
	}
	
	
}
