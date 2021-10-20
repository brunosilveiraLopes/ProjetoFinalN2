package br.com.brunosilveira.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.brunosilveira.model.Professor;
import br.com.brunosilveira.repository.ProfessorRepository;

@Service
public class ProfessorService {
	
	@Autowired
	private ProfessorRepository professorRepository;
	
	public Professor insertOrUpdate(Professor professor) {
		return professorRepository.save(professor);
	}
	
	public List<Professor> findAll(){
		List<Professor> professor = new ArrayList<>();
		professorRepository.findAll().forEach(professor :: add);
		return professor;
	}
	
	public Optional<Professor> findOne(int id){
		return professorRepository.findById(id);
	}
	
	public void remove(int id) {
		professorRepository.deleteById(id);
	}
}
