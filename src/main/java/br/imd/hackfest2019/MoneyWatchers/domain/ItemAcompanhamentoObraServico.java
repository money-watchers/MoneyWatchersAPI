package br.imd.hackfest2019.MoneyWatchers.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ItemAcompanhamentoObraServico {

	@Id
	private int IdItemAcompanhamentoObraServico;
	
	private int IdObraServico;
	
	@NotNull
	private String NomeTipoSituacaoExecucao;
	
	@NotNull
	private String NumeroMedicaoAPI;
	
	@NotNull
	private String ValorMedicaoAPI;
	
	@NotNull
	private String DataMedicaoAPI;
	
	@NotNull
	private String NumeroMedicaoReajusta;
	
	@NotNull
	private String ValorMedicaoReajusta;
	
	@NotNull
	private Date DataMedicaoReajuste;
	
	@NotNull
	private Date DataRecebimentoProvisorio;
	
	@NotNull
	private Date DataRecebimentoDefinitivo;
	
	
}
