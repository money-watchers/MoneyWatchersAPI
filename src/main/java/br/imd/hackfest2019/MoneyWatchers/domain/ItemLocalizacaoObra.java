package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;


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
	
	public ItemLocalizacaoObra() {
		
	}

	public int getIdItemLocalizacaoObra() {
		return IdItemLocalizacaoObra;
	}

	public void setIdItemLocalizacaoObra(int idItemLocalizacaoObra) {
		IdItemLocalizacaoObra = idItemLocalizacaoObra;
	}

	public int getIdObraServico() {
		return IdObraServico;
	}

	public void setIdObraServico(int idObraServico) {
		IdObraServico = idObraServico;
	}

	public String getObjeto() {
		return objeto;
	}

	public void setObjeto(String objeto) {
		this.objeto = objeto;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getLatitudeUTM() {
		return latitudeUTM;
	}

	public void setLatitudeUTM(String latitudeUTM) {
		this.latitudeUTM = latitudeUTM;
	}

	public String getLongitudeUTM() {
		return longitudeUTM;
	}

	public void setLongitudeUTM(String longitudeUTM) {
		this.longitudeUTM = longitudeUTM;
	}
	
	

	
}
