package br.edu.infnet.leonardomuniz.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.leonardomuniz.clients.IEnderecoClient;
import br.edu.infnet.leonardomuniz.clients.ILocalidadeClient;
import br.edu.infnet.leonardomuniz.model.domain.Distrito;
import br.edu.infnet.leonardomuniz.model.domain.Endereco;
import br.edu.infnet.leonardomuniz.model.domain.Estado;
import br.edu.infnet.leonardomuniz.model.domain.Municipio;

@Service
public class LocalidadeService {
	
	@Autowired
	private ILocalidadeClient localidadeClient;
	
	@Autowired
	private IEnderecoClient enderecoClient;
	
	public Endereco obterPorCep(String cep) {
		return enderecoClient.obterPorCep(cep);
	}
	
	public Collection<Estado> obterEstados(){
		return localidadeClient.obterEstados();
	}

	public Collection<Municipio> obterMunicipioPorUF(Integer uf){
		return localidadeClient.obterMunicipioPorUF(uf);
	}
	
	public Collection<Distrito> obterDistritoPorMunicipio(Integer municipio){
		return localidadeClient.obterDistritoPorMunicipio(municipio);
	}
}
