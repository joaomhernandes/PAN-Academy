package com.springmongodb.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodb.mongodb.model.Consulta;
import com.springmongodb.mongodb.service.ConsultaService;

@RestController
@RequestMapping(path = "/consultas")
public class ConsultaController {
	
	@Autowired
	private ConsultaService consultaService;

	@GetMapping
	public List<Consulta> obterTodos() {
		return this.consultaService.obterTodos();
}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Consulta> obterPorCodigo(@PathVariable String id) {
		Consulta obj = this.consultaService.obterPorCod(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@PostMapping
	public Consulta criar(@RequestBody Consulta consulta) {
		return this.consultaService.criar(consulta);
	}
	
	@DeleteMapping(value = "/{id}")
	public Consulta deletar(@PathVariable String id) {
		return this.consultaService.deletar(id);
	}

}
