package com.devsuperior.dslist.repository;

import com.devsuperior.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

// camada de acesso a dados, ou seja, é responsável por realizar as consultas
public interface GameRepository extends JpaRepository<Game, Long> {
}
