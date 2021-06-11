package com.fiap.psmicrosservicos.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tb_categoria")
public class CategoriaEntity {
	
	@Id
	@Column(name = "ID_CATEGORIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEG_CATEGORIA")
	@SequenceGenerator(name = "SEG_CATEGORIA",sequenceName = "SEG_CATEGORIA",allocationSize = 1)
	private Long id;
	private String nomeDescricao;
	
	@OneToMany(mappedBy = "categoria")
	private List<CursoEntity> curso;

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

	public List<CursoEntity> getCurso() {
		return curso;
	}

	public void setCurso(List<CursoEntity> curso) {
		this.curso = curso;
	}
}
