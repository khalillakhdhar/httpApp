package com.demonstration.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demonstration.model.User;
import com.demonstration.repo.UserRepository;

@RestController
@RequestMapping("user")
public class UserController {
@Autowired 
UserRepository userRepository;
@GetMapping
public List<User> getAll()
{
return (List<User>) userRepository.findAll();	
}
@PostMapping
public User addOne(@RequestBody @Valid User user)
{
	return userRepository.save(user);
}
@DeleteMapping
public void deleteOne(@PathVariable long id)
{
userRepository.deleteById(id);	
}






}
