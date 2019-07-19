package br.imd.hackfest2019.MoneyWatchers.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.imd.hackfest2019.MoneyWatchers.domain.ItemContrato;

import br.imd.hackfest2019.MoneyWatchers.domain.ObraServico;

import br.imd.hackfest2019.MoneyWatchers.repository.ObraRepository;

@Service
public class ObrasService {

	@Autowired
	private ObraRepository obraRepository;
	
	/*
	 * @Autowired private ObraDTORepository obraDTORepository;
	 * 
	 * @Autowired private Obra obraDTO;
	 */
	
	public List<ObraServico> getTodasAsObras(){
		return obraRepository.findAll();
	}
	
	public ObraServico getOneById(Integer ID) {
		/*
		 * ObraServico obra = obraRepository.getOne(ID); obraDTO.setObraServico(obra);
		 */
		
		return obraRepository.getOne(ID);
	}

	public List<ObraServico> getByLatLong(String latitude, String longitude) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public List<ObraServico> getObraPorCidade(String cidade){
		return null;
	}
	
	
	
}
