package com.intensivo.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.intensivo.dslist.dto.GameListDTO;
import com.intensivo.dslist.entities.GameList;
import com.intensivo.dslist.repository.GameListRepostory;

@Service
public class GameListService {
	//injection
	@Autowired
	private GameListRepostory gameListRepository;
	
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll(){
		List<GameList> result=gameListRepository.findAll();
		return result.stream().map(x->new GameListDTO(x)).toList();
		
	}

}
