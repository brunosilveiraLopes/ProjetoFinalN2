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

import br.com.brunosilveira.model.Aluno;
import br.com.brunosilveira.service.AlunoService;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
	@Autowired 
	private AlunoService AlunoService;
	
	@PostMapping
	public Aluno insert(@RequestBody Aluno aluno) {
		return AlunoService.insertOrUpdate(aluno);
	}
	
	@PutMapping
	public Aluno update(@RequestBody Aluno aluno) {
		return AlunoService.insertOrUpdate(aluno);
	}
	
	@GetMapping
	public List<Aluno> findAll(){
		return AlunoService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Aluno> findOne(@PathVariable int id){
		return AlunoService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		AlunoService.remove(id);
	}
	
}
