package br.imd.hackfest2019.MoneyWatchers.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Denuncia {

	@Id
	@GeneratedValue
	private Integer idDenuncia;
	
	
	private String nome;
	
	private String telfeone;
	
	private String email;
	
	@NotNull
	private String descricao;
	
	private String foto;
	
	public Denuncia() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelfeone() {
		return telfeone;
	}
	public void setTelfeone(String telfeone) {
		this.telfeone = telfeone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}	
	

}
