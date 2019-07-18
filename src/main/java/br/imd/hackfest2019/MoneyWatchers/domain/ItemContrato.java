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
	
	public ItemContrato() {
		
	}

	public int getIdItemContrato() {
		return IdItemContrato;
	}

	public void setIdItemContrato(int idItemContrato) {
		IdItemContrato = idItemContrato;
	}

	public int getIdObraServico() {
		return IdObraServico;
	}

	public void setIdObraServico(int idObraServico) {
		IdObraServico = idObraServico;
	}

	public String getNumeroContrato() {
		return NumeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		NumeroContrato = numeroContrato;
	}

	public String getAnoContrato() {
		return AnoContrato;
	}

	public void setAnoContrato(String anoContrato) {
		AnoContrato = anoContrato;
	}

	public String getValorContrato() {
		return ValorContrato;
	}

	public void setValorContrato(String valorContrato) {
		ValorContrato = valorContrato;
	}

	public Date getDataTerminoVigencia() {
		return DataTerminoVigencia;
	}

	public void setDataTerminoVigencia(Date dataTerminoVigencia) {
		DataTerminoVigencia = dataTerminoVigencia;
	}

	public String getNumeroOrdemServico() {
		return NumeroOrdemServico;
	}

	public void setNumeroOrdemServico(String numeroOrdemServico) {
		NumeroOrdemServico = numeroOrdemServico;
	}

	public String getAnoOrdemServico() {
		return AnoOrdemServico;
	}

	public void setAnoOrdemServico(String anoOrdemServico) {
		AnoOrdemServico = anoOrdemServico;
	}

	public String getPrazoExecucao() {
		return PrazoExecucao;
	}

	public void setPrazoExecucao(String prazoExecucao) {
		PrazoExecucao = prazoExecucao;
	}

	public Date getDataInicioExecucao() {
		return DataInicioExecucao;
	}

	public void setDataInicioExecucao(Date dataInicioExecucao) {
		DataInicioExecucao = dataInicioExecucao;
	}
	
	
	
	

}
