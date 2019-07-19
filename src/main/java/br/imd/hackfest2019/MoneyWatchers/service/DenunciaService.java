package br.imd.hackfest2019.MoneyWatchers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.imd.hackfest2019.MoneyWatchers.domain.Denuncia;
import br.imd.hackfest2019.MoneyWatchers.repository.DenunciaRepository;

@Service
public class DenunciaService {

	@Autowired
	private DenunciaRepository repository;
	
	public List<Denuncia> getAll(){
		return repository.findAll();
	}

	public String salvarDenuncia(Denuncia denuncia) {
		repository.save(denuncia);
		return "Salvo com sucesso";
	}
	
}
