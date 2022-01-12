package com.weslyramalho.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.weslyramalho.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
