package com.weslyramalho.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslyramalho.dsmovie.entities.Score;
import com.weslyramalho.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	

}
