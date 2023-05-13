package com.lucianozimermann.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucianozimermann.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>
{

}