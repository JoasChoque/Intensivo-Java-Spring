package com.intensivo.intensivao.dto;

import org.springframework.beans.BeanUtils;

import com.intensivo.intensivao.model.Game;

public class GameDTO {
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataforma;
	private Double pontuacao;
	private String imgUrl;
	private String descCurto;
	private String descLong;
	
	/*Constructors*/
	public GameDTO() {}
	
	public GameDTO(Game entity) {
		//copia os dados dos objetos para a classe(para isso usamos o this)
		BeanUtils.copyProperties(entity, this);
	}

	/*Getters and Setters*/
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}

	public Double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(Double pontuacao) {
		this.pontuacao = pontuacao;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getDescCurto() {
		return descCurto;
	}

	public void setDescCurto(String descCurto) {
		this.descCurto = descCurto;
	}

	public String getDescLong() {
		return descLong;
	}

	public void setDescLong(String descLong) {
		this.descLong = descLong;
	}
	
	
}
