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
	
	
	

}
