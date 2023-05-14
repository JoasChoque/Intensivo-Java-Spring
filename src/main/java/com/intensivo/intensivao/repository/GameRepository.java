package com.intensivo.intensivao.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivo.intensivao.model.Game;

public interface GameRepository extends JpaRepository<Game,Long> {
	
}
