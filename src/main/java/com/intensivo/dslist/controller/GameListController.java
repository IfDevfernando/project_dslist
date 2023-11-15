package com.intensivo.dslist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intensivo.dslist.dto.GameListDTO;
import com.intensivo.dslist.service.GameListService;

@RestController
@RequestMapping(value="/lists")
public class GameListController {
	//roots
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result=gameListService.findAll();
		return result;
	}

	
	

}
