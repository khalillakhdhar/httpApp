package com.demonstration.repo;

import org.springframework.data.repository.CrudRepository;

import com.demonstration.model.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
