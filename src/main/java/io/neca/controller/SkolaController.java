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
	private String homePage(Model model) {
		model.addAttribute("ucenici", ucenikService.getAll());
		return "ucenikLista";
	}
	
}
