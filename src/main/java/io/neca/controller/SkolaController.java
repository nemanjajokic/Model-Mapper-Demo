package io.neca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import io.neca.model.Ucenik;
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
	
	@GetMapping("/getUcenikForma")
	public ModelAndView ucenikForm(Ucenik ucenik) {
		ModelAndView mv = new ModelAndView("AddUcenikForm");
		mv.addObject("ucenik", ucenik);		// model atribute to bind form data
		
		return mv;
	}
	
	@PostMapping("/addNewUcenik")
	public String saveUcenik(@ModelAttribute("ucenik") Ucenik ucenik) {
		ucenikService.addUcenik(ucenik);
		return "redirect:/";
	}
	
	// -> saveUcenik
	@GetMapping("update/{broj}")
	public String updateForm(@PathVariable("broj") int broj, Model model) {
		Ucenik ucenik = ucenikService.findUcenikByID(broj);
		model.addAttribute("ucenik", ucenik);	// pre-populated form
		return "AddUcenikForm";
	}
	
	@GetMapping("delete/{broj}")
	public String deleteUcenik(@PathVariable("broj") int broj) {
		ucenikService.deleteUcenik(broj);
		return "redirect:/";
	}
	
//	@GetMapping("/index")
//	public String index(Model model) {
//		model.addAttribute("ucenici", ucenikService.poslednjihPet());
//		return "index";
//	}
	
}
