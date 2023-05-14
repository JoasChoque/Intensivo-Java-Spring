package com.intensivo.intensivao.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "tb_game")
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	//customizando o nome da coluna no banco
	@Column(name = "game_year")
	private Integer ano;
	
	private String genero;
	private String imgUrl;
	private String plataforma;
	private Double pontuacao;
	
	@Column(columnDefinition = "TEXT")
	private String descCurto;
	
	@Column(columnDefinition = "TEXT")
	private String descLong;
	
	public Game(){}

	/*Opcional, serve apenas para instanciar outro game*/
	public Game(Long id, String titulo, Integer ano, String genero, String imgUrl,String plataforma,Double pontuacao, String descCurto, String descLong) {
		this.id = id;
		this.titulo = titulo;
		this.ano = ano;
		this.genero = genero;
		this.imgUrl = imgUrl;
		this.plataforma = plataforma;
		this.pontuacao=pontuacao;
		this.descCurto = descCurto;
		this.descLong = descLong;
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

	//metodos para comparar um objeto com outro
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
