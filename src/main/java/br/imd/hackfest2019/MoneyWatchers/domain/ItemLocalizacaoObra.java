package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ForeignKey;

@Entity
public class ItemLocalizacaoObra {
	
	@Id
	@NotNull
	private int IdItemLocalizacaoObra;
	@NotNull
	private int IdObraServico;
	
	@NotNull
	private String objeto;
	@NotNull
	private String endereco;
	@NotNull
	private String latitudeUTM;
	@NotNull
	private String longitudeUTM;
	
	
	

}
