package br.com.brunosilveira.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.brunosilveira.model.Aluno;

@Repository
public interface AlunoRepository extends CrudRepository<Aluno, Integer>{

}
