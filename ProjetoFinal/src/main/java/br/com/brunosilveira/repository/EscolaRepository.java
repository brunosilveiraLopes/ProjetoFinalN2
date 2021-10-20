package br.com.brunosilveira.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.brunosilveira.model.Escola;

@Repository
public interface EscolaRepository extends CrudRepository<Escola, Integer>{

}