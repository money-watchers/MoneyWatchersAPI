package br.imd.hackfest2019.MoneyWatchers.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ItemContrato {
	
	@Id
	private int IdItemContrato;
	
	@NotNull
	private int IdObraServico;
	
	@NotNull
	private String NumeroContrato;
	
	@NotNull
	private String AnoContrato;
	
	@NotNull
	private String ValorContrato;
	
	@NotNull
	private Date DataTerminoVigencia;
	
	@NotNull
	private String NumeroOrdemServico;
	
	@NotNull
	private String AnoOrdemServico;
	
	@NotNull
	private String PrazoExecucao;
	
	@NotNull
	private Date DataInicioExecucao;
	
	
	
	

}
