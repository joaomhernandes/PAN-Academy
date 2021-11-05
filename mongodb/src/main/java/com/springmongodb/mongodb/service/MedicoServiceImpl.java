package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Medico;
import com.springmongodb.mongodb.repository.MedicoRepository;

@Service
public class MedicoServiceImpl implements MedicoService {

	@Autowired
	MedicoRepository medicoRepository;
	
	@Override
	public List<Medico> obterTodos() {
		return this.medicoRepository.findAll();
	}
	
	@Override
	public Medico obterPorCod(String cod) {
		return this.medicoRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Médico inexistente!"));
	}
	

	@Override
	public Medico criar(Medico medico) {	
		return this.medicoRepository.save(medico);
	}
	
	@Override
	public Medico deletar(String cod) {
		Medico retorno = obterPorCod(cod);
		this.medicoRepository.deleteById(cod);
		return retorno;
	}

		
	
	
}
