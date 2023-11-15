package com.intensivo.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensivo.dslist.dto.GameDTO;
import com.intensivo.dslist.dto.GameMinDto;
import com.intensivo.dslist.service.GameService;

@RestController
@RequestMapping(value="/games")
public class GameController {
	//roots
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDto> findAll(){
		List<GameMinDto> result=gameService.findAll();
		return result;
	}
	@GetMapping(value="/{id}")
	public GameDTO findById(@PathVariable Long id){
		GameDTO result=gameService.findById(id);
		return result;
	}
	
	

}
