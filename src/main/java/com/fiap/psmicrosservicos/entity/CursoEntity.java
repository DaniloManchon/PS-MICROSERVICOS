package com.fiap.psmicrosservicos.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_curso")
public class CursoEntity {
	
	@Id
	@Column(name = "ID_CURSO" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEG_CURSO")
	@SequenceGenerator(name = "SEG_CURSO", sequenceName = "SEG_CURSO",allocationSize = 1)
	private Long id;
	private String nome;
	private String duracao;
	private String descricao;
	private Double preco;
	
	@ManyToOne
	@JoinColumn(name = "ID_CATEGORIA" , nullable = false )
	private CategoriaEntity categoria; 
	
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
	public CategoriaEntity getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaEntity categoria) {
		this.categoria = categoria;
	}		
}
