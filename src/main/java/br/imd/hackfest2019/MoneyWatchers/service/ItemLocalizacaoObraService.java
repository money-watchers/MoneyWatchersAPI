package br.imd.hackfest2019.MoneyWatchers.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.imd.hackfest2019.MoneyWatchers.DTO.LatLongDTO;
import br.imd.hackfest2019.MoneyWatchers.domain.ItemLocalizacaoObra;
import br.imd.hackfest2019.MoneyWatchers.repository.ItemLocalizacaoObraRepository;

@Service
public class ItemLocalizacaoObraService {

	@Autowired
	private ItemLocalizacaoObraRepository itemLocalizacaoObraRepository;
	
	public List<ItemLocalizacaoObra> getTodos(){
		
		return itemLocalizacaoObraRepository.findAll();
	}
	
	public List<LatLongDTO> getTodosLatLongNeg(){
		List<ItemLocalizacaoObra> listLocalizacoes = itemLocalizacaoObraRepository.getAllNegativeLatLong();
		List<LatLongDTO> listdto = new ArrayList<LatLongDTO>();
		for (ItemLocalizacaoObra ilo : listLocalizacoes) {
				LatLongDTO dto = new LatLongDTO();
				
				dto.setLatitude(ilo.getLatitudeUTM());
				dto.setLongitude(ilo.getLongitudeUTM());
				dto.setDescricao(ilo.getObjeto());
				listdto.add(dto);
		}
		return listdto;
	}
	
	public List<LatLongDTO> getTodosOsPontosLatLong(){
		List<ItemLocalizacaoObra> listLocalizacoes = itemLocalizacaoObraRepository.findAll();
		List<LatLongDTO> listdto = new ArrayList<LatLongDTO>();
		for (ItemLocalizacaoObra ilo : listLocalizacoes) {
				LatLongDTO dto = new LatLongDTO();
				
				dto.setLatitude(ilo.getLatitudeUTM());
				dto.setLongitude(ilo.getLongitudeUTM());
				dto.setDescricao(ilo.getObjeto());
				listdto.add(dto);
		}
		return listdto;
	}
}
