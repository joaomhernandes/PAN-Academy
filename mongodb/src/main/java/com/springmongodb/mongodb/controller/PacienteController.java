package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodb.mongodb.model.Paciente;
import com.springmongodb.mongodb.service.PacienteService;

@RestController
@RequestMapping(path = "/pacientes")
public class PacienteController {
	
	@Autowired
	private PacienteService pacienteService;

	@GetMapping
	public List<Paciente> obterTodos() {
		return this.pacienteService.obterTodos();
}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Paciente> obterPorCodigo(@PathVariable String id) {
		Paciente obj = this.pacienteService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Paciente criar(@RequestBody Paciente paciente) {
		return this.pacienteService.criar(paciente);
	}
	
	@DeleteMapping(value = "/{id}")
	public Paciente deletar(@PathVariable String id) {
		return this.pacienteService.deletar(id);
	}
	
	@PutMapping(value = "/{id}")
	public Paciente atualizar(@PathVariable String id, @RequestBody Paciente paciente) {
		Paciente newPaciente = this.pacienteService.atualizar(id, paciente);
		return this.pacienteService.atualizar(id, newPaciente);
		
	}
}
