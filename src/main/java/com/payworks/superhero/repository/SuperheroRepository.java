package com.payworks.superhero.repository;

import com.payworks.superhero.model.dao.SuperheroDao;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author prasa on 05-02-2018
 * @project superhero
 */
public interface SuperheroRepository extends JpaRepository<SuperheroDao, Long> {
}
