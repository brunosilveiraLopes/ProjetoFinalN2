package br.com.brunosilveira.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.brunosilveira.model.Professor;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Integer>{

}
