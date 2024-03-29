package br.edu.infnet.leonardomuniz;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.leonardomuniz.model.domain.Estado;
import br.edu.infnet.leonardomuniz.model.domain.Municipio;
import br.edu.infnet.leonardomuniz.model.service.LocalidadeService;

@Component
public class LocalidadeLoader implements ApplicationRunner {

	public final int NUMUF = 33;  // 33 é o código do Rio de Janeiro

	@Autowired
	private LocalidadeService localidadeService;

	@Override
	public void run(ApplicationArguments args) throws Exception {



		Collection<Estado> estados = localidadeService.obterEstados();

		for(Estado estado : estados) {
			if (estado.getId() == NUMUF) { // Verifica se o estado é o Rio de Janeiro
				System.out.println(" - [ESTADO]: " + estado.getNome());

				Collection<Municipio> municipios = localidadeService.obterMunicipioPorUF(NUMUF);

				for(Municipio municipio : municipios) {
					System.out.println(" -- [MUNICÍPIO DO "+estado.getNome().toUpperCase()+"]: " + municipio.getNome());
				}
			}
		}
	}
}
