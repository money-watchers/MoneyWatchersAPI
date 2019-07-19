package br.imd.hackfest2019.MoneyWatchers.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.annotations.Proxy;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name = "obraservico")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
@Proxy(lazy = false)
public class ObraServico {

	@Id
	@Column(name = "idobraservico")
	@JsonProperty("id")
	private Integer IdObraServico;

	@Column(name = "nomejurisdicionado")
	private String NomeJurisdicionado;

	@Column(name = "numeroprocessodespesa")
	private String NumeroProcessoDespesa;

	@Column(name = "anoprocessodespesa")
	private String AnoProcessoDespesa;

	@Column(name = "nometiporegimeexecucao")
	private String NomeTipoRegimeExecucao;

	@Column(name = "nometipointervencao")
	private String NomeTipoIntervencao;

	@Column(name = "outrotipointervencao")
	private String OutroTipoIntervencao;

	@Column(name = "outrotipoobraservico")
	private String OutroTipoObraServico;

	@Column(name = "nometiposituacaoobraservico")
	private String NomeTipoSituacaoObraServico;

	@Column(name = "descricaoobraservico", columnDefinition="TEXT")
	private String DescricaoObraServico;

	@OneToMany(/* cascade = CascadeType.ALL , , */mappedBy = "ObraServico", fetch = FetchType.EAGER)
	private List<ItemContrato> itemContrato;

	@OneToMany(/* cascade = CascadeType.ALL , */ mappedBy = "ObraServico", fetch = FetchType.EAGER)
	@Fetch(FetchMode.SUBSELECT) 
	private List<ItemLocalizacaoObra> itemLocalizacaoObra;

	@OneToMany(/* cascade = CascadeType.ALL, */ fetch = FetchType.EAGER, mappedBy = "ObraServico")
	@Fetch(FetchMode.SUBSELECT)
	private List<ItemAditamento> itemAditamento;

	@OneToMany(/* cascade = CascadeType.ALL */fetch = FetchType.EAGER, mappedBy = "obraServico")
	@Fetch(FetchMode.SUBSELECT)
	private List<ItemAcompanhamentoObraServico> itemAcompanhamentoObraServico;
	
	@Column(name = "cnpj")
	private String cnpj;

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

	public List<ItemLocalizacaoObra> getItemLocalizacaoObra() {
		return itemLocalizacaoObra;
	}

	public void setItemLocalizacaoObra(List<ItemLocalizacaoObra> itemLocalizacaoObra) {
		this.itemLocalizacaoObra = itemLocalizacaoObra;
	}

	public List<ItemAditamento> getItemAditamento() {
		return itemAditamento;
	}

	public void setItemAditamento(List<ItemAditamento> itemAditamento) {
		this.itemAditamento = itemAditamento;
	}

	public List<ItemAcompanhamentoObraServico> getItemAcompanhamentoObraServico() {
		return itemAcompanhamentoObraServico;
	}

	public void setItemAcompanhamentoObraServico(List<ItemAcompanhamentoObraServico> itemAcompanhamentoObraServico) {
		this.itemAcompanhamentoObraServico = itemAcompanhamentoObraServico;
	}

	public List<ItemContrato> getItemContrato() {
		return itemContrato;
	}

	public void setItemContrato(List<ItemContrato> itemContrato) {
		this.itemContrato = itemContrato;
	}

	public void setIdObraServico(Integer idObraServico) {
		IdObraServico = idObraServico;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

}
