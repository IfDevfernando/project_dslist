package com.intensivo.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intensivo.dslist.dto.GameMinDto;
import com.intensivo.dslist.entities.Game;
import com.intensivo.dslist.repository.GameRepository;

@Service
public class GameService {
	//injection
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll(){
		List<Game> result=gameRepository.findAll();
		return result.stream().map(x->new GameMinDto(x)).toList();
		
	}

}
