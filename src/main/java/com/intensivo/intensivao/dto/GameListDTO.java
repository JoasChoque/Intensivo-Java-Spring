package com.intensivo.intensivao.dto;

import com.intensivo.intensivao.model.GameList;

public class GameListDTO {
	private Long id;
	private String nome;
	
	/*Constructors*/
	public GameListDTO() {}

	public GameListDTO(GameList entity) {
		id = entity.getId();
		nome = entity.getNome();
	}

	/*Getters*/
	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}
	
	
}
