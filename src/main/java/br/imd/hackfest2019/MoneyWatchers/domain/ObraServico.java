package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="obraservico")
public class ObraServico {
	
	@Id
	@Column(name="idobraservico")
	private Integer IdObraServico;
	
	@Column(name="nomejurisdicionado")
	private String NomeJurisdicionado;
	
	@Column(name="numeroprocessodespesa")
	private String NumeroProcessoDespesa;

	@Column(name="anoprocessodespesa")
	private String AnoProcessoDespesa;

	@Column(name="nometiporegimeexecucao")
	private String NomeTipoRegimeExecucao;

	@Column(name="nometipointervencao")
	private String NomeTipoIntervencao;

	@Column(name="outrotipointervencao")
	private String OutroTipoIntervencao;

	@Column(name="outrotipoobraservico")
	private String OutroTipoObraServico;

	@Column(name="nometiposituacaoobraservico")
	private String NomeTipoSituacaoObraServico;

	@Column(name="descricaoobraservico")
	private String DescricaoObraServico;
	
	public ObraServico() {
		
	}
	
	
	public int getIdObraServico() {
		return IdObraServico;
	}
	public void setIdObraServico(int idObraServico) {
		IdObraServico = idObraServico;
	}
	public String getNomeJurisdicionado() {
		return NomeJurisdicionado;
	}
	public void setNomeJurisdicionado(String nomeJurisdicionado) {
		NomeJurisdicionado = nomeJurisdicionado;
	}
	public String getNumeroProcessoDespesa() {
		return NumeroProcessoDespesa;
	}
	public void setNumeroProcessoDespesa(String numeroProcessoDespesa) {
		NumeroProcessoDespesa = numeroProcessoDespesa;
	}
	public String getAnoProcessoDespesa() {
		return AnoProcessoDespesa;
	}
	public void setAnoProcessoDespesa(String anoProcessoDespesa) {
		AnoProcessoDespesa = anoProcessoDespesa;
	}
	public String getNomeTipoRegimeExecucao() {
		return NomeTipoRegimeExecucao;
	}
	public void setNomeTipoRegimeExecucao(String nomeTipoRegimeExecucao) {
		NomeTipoRegimeExecucao = nomeTipoRegimeExecucao;
	}
	public String getNomeTipoIntervencao() {
		return NomeTipoIntervencao;
	}
	public void setNomeTipoIntervencao(String nomeTipoIntervencao) {
		NomeTipoIntervencao = nomeTipoIntervencao;
	}
	public String getOutroTipoIntervencao() {
		return OutroTipoIntervencao;
	}
	public void setOutroTipoIntervencao(String outroTipoIntervencao) {
		OutroTipoIntervencao = outroTipoIntervencao;
	}
	public String getOutroTipoObraServico() {
		return OutroTipoObraServico;
	}
	public void setOutroTipoObraServico(String outroTipoObraServico) {
		OutroTipoObraServico = outroTipoObraServico;
	}
	public String getNomeTipoSituacaoObraServico() {
		return NomeTipoSituacaoObraServico;
	}
	public void setNomeTipoSituacaoObraServico(String nomeTipoSituacaoObraServico) {
		NomeTipoSituacaoObraServico = nomeTipoSituacaoObraServico;
	}
	public String getDescricaoObraServico() {
		return DescricaoObraServico;
	}
	public void setDescricaoObraServico(String descricaoObraServico) {
		DescricaoObraServico = descricaoObraServico;
	}
	
	

}
