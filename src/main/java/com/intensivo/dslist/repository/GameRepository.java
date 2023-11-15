package com.intensivo.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivo.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
	
	

}
