package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@Entity
@Table(name = "itemlocalizacaoobra")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class ItemLocalizacaoObra {
	
	@Id
	@Column(name = "iditemlocalizacaoobra")
	@JsonProperty("id")
	private Integer IdItemLocalizacaoObra;
	
	@ManyToOne
	@JoinColumn(name = "idobraservico", referencedColumnName = "idobraservico")
	private ObraServico ObraServico;
	
	@Column(name = "objeto")
	private String objeto;
	
	@Column(name = "endereco")
	private String endereco;
	
	@Column(name = "latitudeutm")
	private String latitudeUTM;

	@Column(name = "longitudeutm")
	private String longitudeUTM;
	
	public ItemLocalizacaoObra() {
		
	}

	public int getIdItemLocalizacaoObra() {
		return IdItemLocalizacaoObra;
	}

	public void setIdItemLocalizacaoObra(int idItemLocalizacaoObra) {
		IdItemLocalizacaoObra = idItemLocalizacaoObra;
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

	public ObraServico getObraServico() {
		return ObraServico;
	}

	public void setObraServico(ObraServico obraServico) {
		this.ObraServico = obraServico;
	}
	
	

	
}
