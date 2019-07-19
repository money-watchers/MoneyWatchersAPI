package br.imd.hackfest2019.MoneyWatchers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.imd.hackfest2019.MoneyWatchers.domain.ObraServico;
import br.imd.hackfest2019.MoneyWatchers.repository.ObraRepository;

@Service
public class ObrasService {

	@Autowired
	private ObraRepository obraRepository;
	
	public List<ObraServico> getTodasAsObras(){
		return obraRepository.findAll();
	}
	
	public ObraServico getOneById(Integer ID) {
		return obraRepository.getOne(ID);
	}
	
	
	
}
