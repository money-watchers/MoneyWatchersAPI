package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ItemAditamento {
	
	@Id
	private int IdItemAditamento;
	
	@NotNull
	private int IdObraServico;
	
	
	@NotNull
	private String NumeroTermo;
	
	@NotNull
	private String AnoTermo;
	
	@NotNull
	private String NomeTipoAditamento;
	
	@NotNull
	private String Descricao;
	
	public ItemAditamento() {
		
	}

	public int getIdItemAditamento() {
		return IdItemAditamento;
	}

	public void setIdItemAditamento(int idItemAditamento) {
		IdItemAditamento = idItemAditamento;
	}

	public int getIdObraServico() {
		return IdObraServico;
	}

	public void setIdObraServico(int idObraServico) {
		IdObraServico = idObraServico;
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
	
	
	

}
