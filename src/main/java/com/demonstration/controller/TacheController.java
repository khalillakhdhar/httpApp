package com.demonstration.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demonstration.model.Tache;
import com.demonstration.repo.TacheRepository;

@RestController
@RequestMapping("tache")
@CrossOrigin(origins = "")
public class TacheController {
@Autowired 
TacheRepository tacheRepository;
@GetMapping
public List<Tache> getAll()
{
return (List<Tache>) tacheRepository.findAll();	
}
@PostMapping
public Tache addOne(@RequestBody @Valid Tache tache)
{
	return tacheRepository.save(tache);
}
@DeleteMapping
public void deleteOne(@PathVariable long id)
{
tacheRepository.deleteById(id);	
}






}