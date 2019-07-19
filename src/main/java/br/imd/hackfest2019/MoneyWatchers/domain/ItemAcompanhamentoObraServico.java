package br.imd.hackfest2019.MoneyWatchers.domain;

import java.util.Date;

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
@Table(name = "itemacompanhamentoobraservico")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
public class ItemAcompanhamentoObraServico {

	@Id
	@Column(name = "iditemacompanhamentoobraservico")
	@JsonProperty("id")
	private int IdItemAcompanhamentoObraServico;
	
	@ManyToOne
	@JoinColumn(name = "idobraservico", referencedColumnName = "idobraservico")
	private ObraServico obraServico;
	
	@Column(name = "nometiposituacaoexecucao")
	private String NomeTipoSituacaoExecucao;
	
	@Column(name = "numeromedicaoapi")
	private String NumeroMedicaoAPI;
	
	@Column(name = "valormedicaoapi")
	private String ValorMedicaoAPI;
	
	@Column(name = "datamedicaoapi")
	private String DataMedicaoAPI;
	
	@Column(name = "numeromedicaoreajuste")
	private String NumeroMedicaoReajuste;
	
	@Column(name = "valormedicaoreajuste")
	private String ValorMedicaoReajuste;
	
	@Column(name = "datamedicaoreajuste")
	private Date DataMedicaoReajuste;
	
	@Column(name = "datarecebimentoprovisorio")
	private Date DataRecebimentoProvisorio;
	
	@Column(name = "datarecebimentodefinitivo")
	private Date DataRecebimentoDefinitivo;
	
	public ItemAcompanhamentoObraServico() {
		
	}

	public int getIdItemAcompanhamentoObraServico() {
		return IdItemAcompanhamentoObraServico;
	}

	public void setIdItemAcompanhamentoObraServico(int idItemAcompanhamentoObraServico) {
		IdItemAcompanhamentoObraServico = idItemAcompanhamentoObraServico;
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

	public String getNumeroMedicaoReajuste() {
		return NumeroMedicaoReajuste;
	}

	public void setNumeroMedicaoReajuste(String numeroMedicaoReajuste) {
		NumeroMedicaoReajuste = numeroMedicaoReajuste;
	}

	public String getValorMedicaoReajuste() {
		return ValorMedicaoReajuste;
	}

	public void setValorMedicaoReajusta(String valorMedicaoReajuste) {
		ValorMedicaoReajuste = valorMedicaoReajuste;
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

	public ObraServico getObraServico() {
		return obraServico;
	}

	public void setObraServico(ObraServico obraServico) {
		this.obraServico = obraServico;
	}
	
	
}
