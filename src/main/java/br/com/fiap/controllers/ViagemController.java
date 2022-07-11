package br.com.fiap.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.model.Viagem;

@Controller()
public class ViagemController {
	
	@GetMapping("/viagem/calcular")
	public ModelAndView calcular() {
		ModelAndView model = new ModelAndView("viagem/calcular");
		
		Viagem viagem = new Viagem();
		
		model.addObject("viagem",viagem);
		
		return model;
	}
	
	@PostMapping("/viagem/calcular")
	public ModelAndView calcular(@ModelAttribute("viagem") Viagem viagem) {
		ModelAndView model = new ModelAndView("viagem/index");
		
		ArrayList<Viagem> relatorio = new ArrayList<Viagem>();		
		
		relatorio.add(viagem);
		
		model.addObject("relatorio", relatorio);
		
		
		return model;
		
	}
	
	@GetMapping("/viagem")
	public ModelAndView index() {
		ModelAndView model = new ModelAndView("viagem/index");
		
		ArrayList<Viagem> relatorio = new ArrayList<Viagem>();		
		
		model.addObject("relatorio", relatorio);
		
		
		return model;
	}
	

}
