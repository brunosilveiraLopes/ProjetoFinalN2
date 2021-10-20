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

import br.com.brunosilveira.model.Escola;
import br.com.brunosilveira.service.EscolaService;

@RestController
@RequestMapping("/escola")
public class EscolaController {
	@Autowired 
	private EscolaService escolaService;
	
	@PostMapping
	public Escola insert(@RequestBody Escola escola) {
		return escolaService.insertOrUpdate(escola);
	}
	
	@PutMapping
	public Escola update(@RequestBody Escola escola) {
		return escolaService.insertOrUpdate(escola);
	}
	
	@GetMapping
	public List<Escola> findAll(){
		return escolaService.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<Escola> findOne(@PathVariable int id){
		return escolaService.findOne(id);
	}
	
	@DeleteMapping("/{id}")
	public void remove(@PathVariable int id) {
		escolaService.remove(id);
	}
	
}

