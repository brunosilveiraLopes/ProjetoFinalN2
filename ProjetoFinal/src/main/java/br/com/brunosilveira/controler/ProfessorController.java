package br.com.brunosilveira.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brunosilveira.model.Professor;
import br.com.brunosilveira.service.ProfessorService;

@RestController
@RequestMapping("/professor")
public class ProfessorController {
	@Autowired 
	private ProfessorService ProfessorService;
	
	@PostMapping
	public Professor insert(@RequestBody Professor professor) {
		return ProfessorService.insertOrUpdate(professor);
	}
	
	@PutMapping
	public Professor update(@RequestBody Professor professor) {
		return ProfessorService.insertOrUpdate(professor);
	}
	
	@GetMapping
	public List<Professor> findAll(){
		return ProfessorService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Professor> findOne(@PathVariable int id){
		return ProfessorService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		ProfessorService.remove(id);
	}
	
}
