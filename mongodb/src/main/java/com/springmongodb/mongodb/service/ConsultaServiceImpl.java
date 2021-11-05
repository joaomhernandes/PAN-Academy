package com.springmongodb.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodb.mongodb.model.Consulta;
import com.springmongodb.mongodb.model.Medico;
import com.springmongodb.mongodb.model.Paciente;
import com.springmongodb.mongodb.repository.ConsultaRepository;
import com.springmongodb.mongodb.repository.MedicoRepository;
import com.springmongodb.mongodb.repository.PacienteRepository;

@Service
public class ConsultaServiceImpl implements ConsultaService{

	@Autowired
	ConsultaRepository consultaRepository;
	
	@Autowired
	MedicoRepository medicoRepository;
	
	@Autowired
	PacienteRepository pacienteRepository;
	
	@Override
	public List<Consulta> obterTodos() {
		return this.consultaRepository.findAll();
	}

	@Override
	public Consulta obterPorCod(String cod) {
		return this.consultaRepository
				.findById(cod)
				.orElseThrow(() -> new IllegalArgumentException("Consulta inexistente!"));
	}

	@Override
	public Consulta criar(Consulta consulta) {
		
		Medico medico = 
				this.medicoRepository
					.findById(consulta.getMedico().getId())
					.orElseThrow(() -> new IllegalArgumentException("Médico inexistente"));
			consulta.setMedico(medico);
		
		Paciente paciente = 
				this.pacienteRepository
					.findById(consulta.getPaciente().getId())
					.orElseThrow(() -> new IllegalArgumentException("Paciente inexistente"));
			consulta.setPaciente(paciente);
		
		return this.consultaRepository.save(consulta);
	}

	@Override
	public Consulta deletar(String cod) {
		Consulta retorno = obterPorCod(cod);
		this.consultaRepository.deleteById(cod);
		return retorno;
	}

	@Override
	public Consulta atualizar(String cod, Consulta consulta) {
		// TODO Auto-generated method stub
		return null;
	}
	

	
	
}
