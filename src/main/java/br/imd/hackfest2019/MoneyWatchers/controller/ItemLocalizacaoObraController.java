package br.imd.hackfest2019.MoneyWatchers.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.imd.hackfest2019.MoneyWatchers.DTO.LatLongDTO;
import br.imd.hackfest2019.MoneyWatchers.domain.ItemLocalizacaoObra;
import br.imd.hackfest2019.MoneyWatchers.service.ItemLocalizacaoObraService;

@RestController
@RequestMapping("/api/v1/localizacaoObra")
public class ItemLocalizacaoObraController {

	@Autowired
	private ItemLocalizacaoObraService itemLocalizacaoObraService;
	
	@GetMapping("/pontosObras")
	public List<LatLongDTO> latLong(){
		return itemLocalizacaoObraService.getTodosOsPontosLatLong();
	}
}
