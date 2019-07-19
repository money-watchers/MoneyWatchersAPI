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
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "id")
@Table(name = "itemcontrato")
public class ItemContrato {
	
	@Id
	@Column(name = "iditemcontrato")
	@JsonProperty("id")
	private Integer IdItemContrato;
	
	@ManyToOne /* (mappedBy = "itemContrato") */ 
	@JoinColumn(name = "idobraservico", referencedColumnName = "idobraservico")
	private ObraServico ObraServico;
	
	/*
	 * @Column(name = "idobraservico_") private int IdObraServico;
	 */

	@Column(name = "numerocontrato")
	private String NumeroContrato;
	
	@Column(name = "anocontrato")
	private String AnoContrato;

	@Column(name = "valorcontrato")
	private String ValorContrato;
	
	@Column(name = "dataterminovigencia")
	private Date DataTerminoVigencia;

	@Column(name = "numeroordemservico")
	private String NumeroOrdemServico;

	@Column(name = "anoordemservico")
	private String AnoOrdemServico;
	
	@Column(name = "prazoexecucao")
	private String PrazoExecucao;

	@Column(name = "datainicioexecucao")
	private Date DataInicioExecucao;
	
	public ItemContrato() {
		
	}

	public int getIdItemContrato() {
		return IdItemContrato;
	}

	public void setIdItemContrato(int idItemContrato) {
		IdItemContrato = idItemContrato;
	}

	/*
	 * public int getIdObraServico() { return IdObraServico; }
	 * 
	 * public void setIdObraServico(int idObraServico) { IdObraServico =
	 * idObraServico; }
	 */

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

	public ObraServico getObraServico() {
		return ObraServico;
	}

	public void setObraServico(ObraServico obraServico) {
		ObraServico = obraServico;
	}
	
	
	
	

}
