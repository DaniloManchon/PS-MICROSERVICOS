package com.fiap.psmicrosservicos.service.impl;

import br.com.fiap.produtos.mvc.dto.Categoria;
import br.com.fiap.produtos.mvc.entity.CategoriaEntity;
import br.com.fiap.produtos.mvc.repository.CategoriaRepository;
import br.com.fiap.produtos.mvc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService{

	@Autowired
	private CategoriaRepository repository;
	
	
	@Override
	public List<Categoria> listaCategorias() {
		List<CategoriaEntity> listaEntity = repository.findAll();
		List<Categoria> categorias = fromToCategoria(listaEntity);
		return categorias;
	}


	private List<Categoria> fromToCategoria(List<CategoriaEntity> listaEntity) {
		List<Categoria> categorias = new ArrayList<Categoria>();
		for(CategoriaEntity entity :listaEntity ) {
			Categoria categoria = new Categoria();
			categoria.setId(entity.getId());
			categoria.setNomeDescricao(entity.getNomeDescricao());
			categorias.add(categoria);
		}
		return categorias;
	}

}
