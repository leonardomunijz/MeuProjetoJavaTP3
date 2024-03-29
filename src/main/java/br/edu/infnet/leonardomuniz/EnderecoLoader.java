package br.edu.infnet.leonardomuniz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.leonardomuniz.model.domain.Endereco;
import br.edu.infnet.leonardomuniz.model.service.EnderecoService;
import br.edu.infnet.leonardomuniz.model.service.LocalidadeService;

@Component
public class EnderecoLoader implements ApplicationRunner {

	@Autowired
	private LocalidadeService localidadeService;
	@Autowired
	private EnderecoService enderecoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		Endereco endereco1 = localidadeService.obterPorCep("20010020");
		Endereco endereco2 = localidadeService.obterPorCep("21941909");
		Endereco endereco3 = localidadeService.obterPorCep("21931582");

		// Assuming that Endereco has an ID field
		Integer id1 = enderecoService.incluir(endereco1); // Assuming incluir() returns the ID
		Integer id2 = enderecoService.incluir(endereco2);
		Integer id3 = enderecoService.incluir(endereco3);

		System.out.println(" - [ENDEREÇO]: " + enderecoService.obter(id1));
		System.out.println(" - [ENDEREÇO]: " + enderecoService.obter(id2));
		System.out.println(" - [ENDEREÇO]: " + enderecoService.obter(id3));

		// Método excluir() espera um ID e retorno VOID
		enderecoService.excluir(id1);
		Endereco enderecoRemovido = enderecoService.obter(id1);
		if (enderecoRemovido == null) {
			System.out.println(" -- [ENDEREÇO REMOVIDO COM SUCESSO]: ID " + id1);
		} else {
			System.out.println(" -- [ERRO AO REMOVER ENDEREÇO]: ID " + id1);
		}

		System.out.println(" --- [LISTA DE ENDEREÇOS]: \n" + enderecoService.obterLista());
	}


}