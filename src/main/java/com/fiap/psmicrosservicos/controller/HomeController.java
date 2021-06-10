package com.fiap.psmicrosservicos.controller;


import com.fiap.psmicrosservicos.dto.Produto;
import com.fiap.psmicrosservicos.service.impl.ProdutoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class HomeController {
	
	@Autowired
	private ProdutoServiceImpl service;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView view = new ModelAndView("home-produtos");
		List<Produto> produtos = service.listaProdutos();
		view.addObject("produtos", produtos);
		return view;		
	}

}
