package com.intensivo.intensivao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.intensivo.intensivao.model.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	//Pegar a posição alterada para modificar
	@Modifying
	@Query(nativeQuery=true, value= "UPDATE tb_belonging SET posicao = :newPosicao WHERE list_id = :listId AND game_id = :gameId")
	void updateBelongingPosition(Long listId, Long gameId,Integer newPosicao);
}
