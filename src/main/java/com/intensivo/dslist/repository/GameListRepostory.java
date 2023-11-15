package com.intensivo.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intensivo.dslist.entities.GameList;

public interface GameListRepostory extends JpaRepository<GameList, Long>{

}
