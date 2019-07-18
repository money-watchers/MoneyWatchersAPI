package br.imd.hackfest2019.MoneyWatchers.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.imd.hackfest2019.MoneyWatchers.domain.ObraServico;
import br.imd.hackfest2019.MoneyWatchers.service.ObrasService;

@RestController
@RequestMapping("/api/v1/obras")
public class ObrasController {
	
	@Autowired
	private ObrasService obrasService;
	
	@GetMapping("/{id}")
	public ObraServico obraPorID(@PathVariable int id) {
		return null;
	}

}
