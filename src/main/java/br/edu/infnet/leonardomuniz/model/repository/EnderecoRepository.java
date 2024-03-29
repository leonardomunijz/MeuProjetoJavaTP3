package br.edu.infnet.leonardomuniz.model.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.leonardomuniz.model.domain.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Integer> {

}