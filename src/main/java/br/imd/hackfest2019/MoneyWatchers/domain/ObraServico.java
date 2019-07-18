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
