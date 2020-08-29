package com.curso.udemy.nelioalves.cursomc.dto;

import java.io.Serializable;

import com.curso.udemy.nelioalves.cursomc.domain.Estado;

public class EstadoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer Id;
	
	private String nomeString;
	
	public EstadoDTO() {
		
	}

	public EstadoDTO(Estado estado) {
		Id = estado.getId();
		this.nomeString = estado.getNome();
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNomeString() {
		return nomeString;
	}

	public void setNomeString(String nomeString) {
		this.nomeString = nomeString;
	}
	
	

}
