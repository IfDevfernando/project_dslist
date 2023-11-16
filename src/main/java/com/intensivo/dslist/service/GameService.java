package com.intensivo.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intensivo.dslist.dto.GameDTO;
import com.intensivo.dslist.dto.GameMinDto;
import com.intensivo.dslist.entities.Game;
import com.intensivo.dslist.projections.GameMinProjection;
import com.intensivo.dslist.repository.GameRepository;

@Service
public class GameService {
	//injection
	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result=gameRepository.findById(id).get();
		return new GameDTO(result);
		
	}
	@Transactional(readOnly = true)
	public List<GameMinDto> findAll(){
		List<Game> result=gameRepository.findAll();
		return result.stream().map(x->new GameMinDto(x)).toList();
		
	}
	@Transactional(readOnly = true)
	public List<GameMinDto> findByList(Long listId){
		List<GameMinProjection> result=gameRepository.searchByList(listId);
		return result.stream().map(x->new GameMinDto(x)).toList();
	}

}
