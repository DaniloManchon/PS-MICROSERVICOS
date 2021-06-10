package com.fiap.psmicrosservicos.controller;

import com.fiap.psmicrosservicos.dto.Categoria;
import com.fiap.psmicrosservicos.dto.Curso;
import com.fiap.psmicrosservicos.service.CategoriaService;
import com.fiap.psmicrosservicos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
public class CursoController {
	
	@Autowired
	CursoService service;
	
	@Autowired
	CategoriaService categoriaService;
	
	@PostMapping ("/novo-curso")
	public ModelAndView homeCurso() {
		ModelAndView view = new ModelAndView("curso");
		List<Categoria> categorias = categoriaService.listaCategorias();
		view.addObject("categorias",categorias);
		view.addObject(new Curso());
		return view;
	}
	
	@PostMapping("/salvar-curso")
	public String salvarCurso(@Valid Curso curso, BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute(curso);
			return "curso";
		}
		service.salvarCurso(curso);
		return "redirect:/";
	}

	@GetMapping("/curso/{id}")
	public ModelAndView editarCurso(@PathVariable Long id) {
		ModelAndView view = new ModelAndView("curso");
		Curso curso = service.editarCurso(id);
		List<Categoria> categorias = categoriaService.listaCategorias();
		view.addObject("categorias",categorias);
		view.addObject("curso", curso);
		return view;		
	}
	
	@GetMapping("/curso/excluir/{id}")
	public String excluirCurso(@PathVariable Long id) {
		service.excluirCurso(id);
		return "redirect:/";	
	}
}
