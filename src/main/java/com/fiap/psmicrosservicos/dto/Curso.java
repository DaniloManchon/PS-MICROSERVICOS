package com.fiap.psmicrosservicos.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class Curso implements Serializable {

	private static final long serialVersionUID = 1L;	
	private Long id;
	@NotBlank
	private String nome;
	@NotBlank
	private String duracao;
	private String descricao;
	@NotNull
	private Double preco;
	
	Categoria categoria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDuracao() {
		return duracao;
	}
	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Categoria getCategoria() {
		return categoria;
	}

}
