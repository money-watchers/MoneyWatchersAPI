package br.imd.hackfest2019.MoneyWatchers.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class ItemAcompanhamentoObraServico {

	@Id
	private int IdItemAcompanhamentoObraServico;
	
	@NotNull
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
	
	public ItemAcompanhamentoObraServico() {
		
	}

	public int getIdItemAcompanhamentoObraServico() {
		return IdItemAcompanhamentoObraServico;
	}

	public void setIdItemAcompanhamentoObraServico(int idItemAcompanhamentoObraServico) {
		IdItemAcompanhamentoObraServico = idItemAcompanhamentoObraServico;
	}

	public int getIdObraServico() {
		return IdObraServico;
	}

	public void setIdObraServico(int idObraServico) {
		IdObraServico = idObraServico;
	}

	public String getNomeTipoSituacaoExecucao() {
		return NomeTipoSituacaoExecucao;
	}

	public void setNomeTipoSituacaoExecucao(String nomeTipoSituacaoExecucao) {
		NomeTipoSituacaoExecucao = nomeTipoSituacaoExecucao;
	}

	public String getNumeroMedicaoAPI() {
		return NumeroMedicaoAPI;
	}

	public void setNumeroMedicaoAPI(String numeroMedicaoAPI) {
		NumeroMedicaoAPI = numeroMedicaoAPI;
	}

	public String getValorMedicaoAPI() {
		return ValorMedicaoAPI;
	}

	public void setValorMedicaoAPI(String valorMedicaoAPI) {
		ValorMedicaoAPI = valorMedicaoAPI;
	}

	public String getDataMedicaoAPI() {
		return DataMedicaoAPI;
	}

	public void setDataMedicaoAPI(String dataMedicaoAPI) {
		DataMedicaoAPI = dataMedicaoAPI;
	}

	public String getNumeroMedicaoReajusta() {
		return NumeroMedicaoReajusta;
	}

	public void setNumeroMedicaoReajusta(String numeroMedicaoReajusta) {
		NumeroMedicaoReajusta = numeroMedicaoReajusta;
	}

	public String getValorMedicaoReajusta() {
		return ValorMedicaoReajusta;
	}

	public void setValorMedicaoReajusta(String valorMedicaoReajusta) {
		ValorMedicaoReajusta = valorMedicaoReajusta;
	}

	public Date getDataMedicaoReajuste() {
		return DataMedicaoReajuste;
	}

	public void setDataMedicaoReajuste(Date dataMedicaoReajuste) {
		DataMedicaoReajuste = dataMedicaoReajuste;
	}

	public Date getDataRecebimentoProvisorio() {
		return DataRecebimentoProvisorio;
	}

	public void setDataRecebimentoProvisorio(Date dataRecebimentoProvisorio) {
		DataRecebimentoProvisorio = dataRecebimentoProvisorio;
	}

	public Date getDataRecebimentoDefinitivo() {
		return DataRecebimentoDefinitivo;
	}

	public void setDataRecebimentoDefinitivo(Date dataRecebimentoDefinitivo) {
		DataRecebimentoDefinitivo = dataRecebimentoDefinitivo;
	}
	
	
}
