package com.fiap.psmicrosservicos.service;


import com.fiap.psmicrosservicos.dto.Curso;

import java.util.List;

public interface CursoService {
	List<Curso> listaCurso();
	Curso salvarCurso(Curso curso);
	Curso editarCurso(Long id);
	void excluirCurso(Long id);
}
