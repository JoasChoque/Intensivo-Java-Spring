package com.intensivo.intensivao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.intensivo.intensivao.model.Game;
import com.intensivo.intensivao.projection.GameMinProjection;

public interface GameRepository extends JpaRepository<Game,Long> {
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.titulo, tb_game.game_year AS `ano`, tb_game.img_url AS imgUrl,
			tb_game.desc_curto AS descCurto, tb_belonging.posicao
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.posicao
				""")
	
	//Parametro passado por este método é o mesmo da consulta do where (:listId)
	//servindo para criar uma consulta personalizada 
	List<GameMinProjection> searchByList(Long listId);
}
