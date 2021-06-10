package com.fiap.psmicrosservicos.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class CategoriaEntity {
	
	@Id
	@Column(name = "id_categoria")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEG_CATEGORIA")
	@SequenceGenerator(name = "SEG_CATEGORIA",sequenceName = "SEG_CATEGORIA",allocationSize = 1)
	private Long id;
	
	private String nomeDescricao;
	
	@OneToMany(mappedBy = "categoria")
	private List<ProdutoEntity> produtos;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeDescricao() {
		return nomeDescricao;
	}

	public void setNomeDescricao(String nomeDescricao) {
		this.nomeDescricao = nomeDescricao;
	}

	public List<ProdutoEntity> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<ProdutoEntity> produtos) {
		this.produtos = produtos;
	}

}
