package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ObraServico {
	
	@Id
	private int IdObraServico;
	
	@NotNull
	private String NomeJurisdicionado;
	@NotNull
	private String NumeroProcessoDespesa;
	@NotNull
	private String AnoProcessoDespesa;
	@NotNull
	private String NomeTipoRegimeExecucao;
	@NotNull
	private String NomeTipoIntervencao;
	@NotNull
	private String OutroTipoIntervencao;
	@NotNull
	private String OutroTipoObraServico;
	@NotNull
	private String NomeTipoSituacaoObraServico;
	@NotNull
	private String DescricaoObraServico;
	
	

}
