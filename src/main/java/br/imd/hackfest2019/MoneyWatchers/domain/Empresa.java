package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class Empresa {
	
	@Id
	private Integer id;
	
	

}
