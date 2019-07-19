package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "itemaditamento")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class ItemAditamento {
	
	@Id
	@Column(name = "iditemaditamento")
	@JsonProperty("id")
	private int IdItemAditamento;
	
	@ManyToOne
	@JoinColumn(name = "idobraservico", referencedColumnName = "idobraservico")
	private ObraServico ObraServico;

	//private int IdObraServico;
	
	
	@Column(name = "numerotermo")
	private String NumeroTermo;
	
	@Column(name = "anotermo")
	private String AnoTermo;
	
	@Column(name = "nometipoaditamento")
	private String NomeTipoAditamento;
	
	@Column(name = "descricao")
	private String Descricao;
	
	public ItemAditamento() {
		
	}

	public int getIdItemAditamento() {
		return IdItemAditamento;
	}

	public void setIdItemAditamento(int idItemAditamento) {
		IdItemAditamento = idItemAditamento;
	}

	public String getNumeroTermo() {
		return NumeroTermo;
	}

	public void setNumeroTermo(String numeroTermo) {
		NumeroTermo = numeroTermo;
	}

	public String getAnoTermo() {
		return AnoTermo;
	}

	public void setAnoTermo(String anoTermo) {
		AnoTermo = anoTermo;
	}

	public String getNomeTipoAditamento() {
		return NomeTipoAditamento;
	}

	public void setNomeTipoAditamento(String nomeTipoAditamento) {
		NomeTipoAditamento = nomeTipoAditamento;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public ObraServico getObraServico() {
		return ObraServico;
	}

	public void setObraServico(ObraServico obraServico) {
		this.ObraServico = obraServico;
	}
	
	
	

}
