package io.neca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import io.neca.service.UcenikService;

@Controller
public class SkolaController {

	@Autowired
	UcenikService ucenikService;
	
	@GetMapping("/")
	public String homePage(Model model) {
		model.addAttribute("ucenici", ucenikService.getAll());
		return "ucenikLista";
	}

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("ucenici", ucenikService.najnoviji());
		return "index";
	}
	
//	@GetMapping("/index")
//	public String index(Model model) {
//		model.addAttribute("ucenici", ucenikService.poslednjihPet());
//		return "index";
//	}
	
}
