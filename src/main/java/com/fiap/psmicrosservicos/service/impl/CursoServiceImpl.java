package com.fiap.psmicrosservicos.service.impl;

import com.fiap.psmicrosservicos.dto.Curso;
import com.fiap.psmicrosservicos.entity.CategoriaEntity;
import com.fiap.psmicrosservicos.entity.CursoEntity;
import com.fiap.psmicrosservicos.repository.CategoriaRepository;
import com.fiap.psmicrosservicos.repository.CursoRepository;
import com.fiap.psmicrosservicos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CursoServiceImpl implements CursoService {
	
	@Autowired
	private CursoRepository repository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	

	public List<Curso> listaCurso() {
		List<CursoEntity> lista = repository.findAll();
		List<Curso> cursos = fromTo(lista);
		return cursos;
	}


	public Curso salvarCurso(Curso curso) {
		CursoEntity entity = fromTo(curso);
		CategoriaEntity categoriaEntity = categoriaRepository.findById(curso.getCategoria().getId()).get();
		entity.setCategoria(categoriaEntity);
		entity = repository.save(entity);
		Curso cursoRetorno = fromTo(entity);
		return cursoRetorno;
	}

	@Override
	public Curso editarCurso(Long id) {
		CursoEntity entity = repository.findById(id).get();
		return fromTo(entity);
	}

	@Override
	public void excluirCurso(Long id) {
		repository.deleteById(id);
		
	}
	
	private List<Curso> fromTo(List<CursoEntity> lista){
		List<Curso> listaDto = new ArrayList<>();
		for (CursoEntity cursoEntity : lista) {
		Curso dto = new Curso();
		dto.setId(cursoEntity.getId());
		dto.setNome(cursoEntity.getNome());
		dto.setDuracao(cursoEntity.getDuracao());
		dto.setDescricao(cursoEntity.getDescricao());
		dto.setPreco(cursoEntity.getPreco());
		listaDto.add(dto);
		     }
		return listaDto;
	}
	
	private CursoEntity fromTo(Curso curso){
		CursoEntity entity =  new CursoEntity();
		entity.setId(curso.getId());
		entity.setNome(curso.getNome());
		entity.setDescricao(curso.getDescricao());
		entity.setPreco(curso.getPreco());
		entity.setDuracao(curso.getDuracao());
		return entity;
	}
	
	private Curso fromTo(CursoEntity entity){
		Curso curso =  new Curso();
		curso.setId(entity.getId());
		curso.setNome(entity.getNome());
		curso.setDescricao(entity.getDescricao());
		curso.setPreco(entity.getPreco());
		curso.setDuracao(entity.getDuracao());
		return curso;
	}



}
