package br.com.brunosilveira.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.brunosilveira.model.Escola;
import br.com.brunosilveira.repository.EscolaRepository;


@Service
public class EscolaService {
	
	@Autowired
	private EscolaRepository escolaRepository;
	
	public Escola insertOrUpdate(Escola escola) {
		return escolaRepository.save(escola);
	}
	
	public List<Escola> findAll(){
		List<Escola> escola = new ArrayList<>();
		escolaRepository.findAll().forEach(escola :: add);
		return escola;
	}
	
	public Optional<Escola> findOne(int id){
		return escolaRepository.findById(id);
	}
	
	public void remove(int id) {
		escolaRepository.deleteById(id);
	}
}
