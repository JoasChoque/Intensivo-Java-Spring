package com.intensivo.intensivao.model;

import java.util.Objects;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Dizendo que a classe representa 2 campos de tabela, encapsulando 2 atributos em 1 classe só
@Embeddable
public class BelongingPK {
	//é passado o valor de ambas as tabelas para poder
	//utilizar ambas as chaves mas num conjunto só
	@ManyToOne
	@JoinColumn(name="game_id")
	private Game game;
	
	@ManyToOne
	@JoinColumn(name="list_id")
	private GameList gameList;
	
	/*constructors*/
	public BelongingPK() {}

	public BelongingPK(Game game, GameList gameList) {
		this.game = game;
		this.gameList = gameList;
	}

	/*Getters and Setters*/
	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public GameList getGameList() {
		return gameList;
	}

	public void setGameList(GameList gameList) {
		this.gameList = gameList;
	}

	/*Métodos para comparação*/
	@Override
	public int hashCode() {
		return Objects.hash(game, gameList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BelongingPK other = (BelongingPK) obj;
		return Objects.equals(game, other.game) && Objects.equals(gameList, other.gameList);
	}
}
