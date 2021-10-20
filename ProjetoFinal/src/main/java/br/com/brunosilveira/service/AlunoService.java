package br.com.brunosilveira.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.brunosilveira.model.Aluno;
import br.com.brunosilveira.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	public Aluno insertOrUpdate(Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	public List<Aluno> findAll(){
		List<Aluno> aluno = new ArrayList<>();
		alunoRepository.findAll().forEach(aluno :: add);
		return aluno;
	}
	
	public Optional<Aluno> findOne(int id){
		return alunoRepository.findById(id);
	}
	
	public void remove(int id) {
		alunoRepository.deleteById(id);
	}
}
