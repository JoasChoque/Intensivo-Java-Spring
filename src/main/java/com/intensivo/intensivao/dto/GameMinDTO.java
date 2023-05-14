package com.intensivo.intensivao.dto;

import com.intensivo.intensivao.model.Game;
import com.intensivo.intensivao.projection.GameMinProjection;

public class GameMinDTO {
	private Long id;
	private String titulo;
	private Integer ano;
	private String imgUrl;
	private String descCurto;
	
	/*Constructors*/
	public GameMinDTO() {}

	//instanciando um objeto GameMinDTO a partir da entidade Game, copiando os valores do Game
	public GameMinDTO(Game entity) {
		id = entity.getId();
		titulo = entity.getTitulo();
		ano = entity.getAno();
		imgUrl = entity.getImgUrl();
		descCurto = entity.getDescCurto();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		id = projection.getId();
		titulo = projection.getTitulo();
		ano = projection.getGameYear();
		imgUrl = projection.getImgUrl();
		descCurto = projection.getDescCurto();
	}

	/*Getters*/
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getDescCurto() {
		return descCurto;
	}
	
	
	
	
}
