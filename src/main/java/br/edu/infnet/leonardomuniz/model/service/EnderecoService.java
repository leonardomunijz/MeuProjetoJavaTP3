package br.edu.infnet.leonardomuniz.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.leonardomuniz.model.domain.Endereco;
import br.edu.infnet.leonardomuniz.model.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public Integer incluir(Endereco endereco) {
		Endereco savedEndereco = enderecoRepository.save(endereco);
		return savedEndereco.getId(); // Assuming Endereco has a method to get the ID
	}

	public void excluir(Integer id) {
		enderecoRepository.deleteById(id);
	}

	public Collection<Endereco> obterLista(){
		return (Collection<Endereco>) enderecoRepository.findAll();
	}

	public Endereco obter(Integer id){
		return enderecoRepository.findById(id).orElse(null);
	}
}
