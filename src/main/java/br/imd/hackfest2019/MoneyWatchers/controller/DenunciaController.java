package br.imd.hackfest2019.MoneyWatchers.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.imd.hackfest2019.MoneyWatchers.domain.Denuncia;
import br.imd.hackfest2019.MoneyWatchers.service.DenunciaService;

@RestController
@RequestMapping("/api/v1/denuncia")
public class DenunciaController {
	
	@Autowired
	private DenunciaService service;
	
	@GetMapping("/denuncias")
	public List<Denuncia> getDenuncias(){
		
		return service.getAll();
	}
	
	@PostMapping("/denuncia")
	public String saveDenuncia(@RequestBody Denuncia denuncia) {
		
		return service.salvarDenuncia(denuncia); 
		
	}
	
	

}
