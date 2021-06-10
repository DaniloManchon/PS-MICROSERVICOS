package com.fiap.psmicrosservicos.service;


import com.fiap.psmicrosservicos.dto.Produto;

import java.util.List;

public interface ProdutoService {
	List<Produto>listaProdutos();
	Produto salvarProduto(Produto produto);
	Produto editarProduto(Long id);
	void excluirProduto(Long id);
}
