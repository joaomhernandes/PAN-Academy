package com.springmongodb.mongodb.model;

import java.io.Serializable;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document()
public class Consulta implements Serializable {
private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	@DBRef
	private Medico medico;
	@DBRef
	private Paciente paciente;
	private String prescricoes;
	private String exames;
	private String prontuario;
	private String data;
	
	public Consulta() {
		super();
	}

	public Consulta(String id, Medico medico, Paciente paciente, String prescricoes, String exames, String prontuario,
			String data) {
		super();
		this.id = id;
		this.medico = medico;
		this.paciente = paciente;
		this.prescricoes = prescricoes;
		this.exames = exames;
		this.prontuario = prontuario;
		this.data = data;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public String getPrescricoes() {
		return prescricoes;
	}

	public void setPrescricoes(String prescricoes) {
		this.prescricoes = prescricoes;
	}

	public String getExames() {
		return exames;
	}

	public void setExames(String exames) {
		this.exames = exames;
	}

	public String getProntuario() {
		return prontuario;
	}

	public void setProntuario(String prontuario) {
		this.prontuario = prontuario;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public int hashCode() {
		return Objects.hash(data, exames, id, medico, paciente, prescricoes, prontuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consulta other = (Consulta) obj;
		return Objects.equals(data, other.data) && Objects.equals(exames, other.exames) && Objects.equals(id, other.id)
				&& Objects.equals(medico, other.medico) && Objects.equals(paciente, other.paciente)
				&& Objects.equals(prescricoes, other.prescricoes) && Objects.equals(prontuario, other.prontuario);
	}
	
	
	

}
