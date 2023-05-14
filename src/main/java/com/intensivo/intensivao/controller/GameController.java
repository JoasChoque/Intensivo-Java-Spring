package com.intensivo.intensivao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensivo.intensivao.dto.GameMinDTO;
import com.intensivo.intensivao.model.Game;
import com.intensivo.intensivao.service.GameService;

@RestController
//configurando caminho da requisição
@RequestMapping(value = "/games")
public class GameController {
	
	//controller injeta o service e service injeta a JPA
	@Autowired
	private GameService gameService;
	
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		return gameService.findAll();
	}
}
