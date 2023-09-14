package com.demonstration.repo;

import org.springframework.data.repository.CrudRepository;

import com.demonstration.model.Tache;

public interface TacheRepository extends CrudRepository<Tache, Long> {

}
