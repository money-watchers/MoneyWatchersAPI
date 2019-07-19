package br.imd.hackfest2019.MoneyWatchers.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.imd.hackfest2019.MoneyWatchers.repository.ItemContratoRepository;

@Service
public class ItemContratoService {

	@Autowired
	private ItemContratoRepository itemContratoRepository;
}
