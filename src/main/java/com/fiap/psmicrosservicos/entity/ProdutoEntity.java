package com.fiap.psmicrosservicos.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_produto")
public class ProdutoEntity {
	
	@Id
	@Column(name = "ID_PRODUTO" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEG_PRODUTO")
	@SequenceGenerator(name = "SEG_PRODUTO", sequenceName = "SEG_PRODUTO",allocationSize = 1)
	private Long id;
		
	private String nome;
	
	private String sku;
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
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
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
