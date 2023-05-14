package com.intensivo.intensivao.model;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tb_belonging")
public class Belonging {
	//Essa classe foi criada e chamada para auxiliar a comunicação N para N
	//onde haverão duas chaves primárias vindo das outras 2 models, por conta disso é 
	//criada uma terceira classe/tabela contendo ambas as chaves como estrangeiras
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer posicao;
	
	/*Construtores*/
	public Belonging() {}

	public Belonging(Game game, GameList gameList, Integer posicao) {
		id.setGame(game);
		id.setGameList(gameList);
		this.posicao = posicao;
	}

	/*Getters and Setters*/
	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPosicao() {
		return posicao;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	/*Métodos para comparação*/
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
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
}
