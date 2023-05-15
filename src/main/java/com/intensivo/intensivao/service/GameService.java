package com.intensivo.intensivao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intensivo.intensivao.dto.GameDTO;
import com.intensivo.intensivao.dto.GameMinDTO;
import com.intensivo.intensivao.model.Game;
import com.intensivo.intensivao.projection.GameMinProjection;
import com.intensivo.intensivao.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	//DTO servindo para customizar o formato da saida de dados
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll(){
		List<Game> result = gameRepository.findAll();
		
		//transformando uma lista de objetos Game em GameMinDTO
		return result.stream()
				//mapeando a lista recebida e instanciando objeto GameMinDTO com apenas os valores aceitos
				.map(x -> new GameMinDTO(x))
				//convertendo objetos criados novamente em lista
				.toList();
	}
	
	//buscar por ID
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		//precisa do get porque retorna um optional
		Game result = gameRepository.findById(id).get();				
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId){
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		return result.stream().map(x-> new GameMinDTO(x)).toList();
	}
}
