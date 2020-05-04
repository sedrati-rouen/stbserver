package fr.univ.rouen.stbserver.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GETController {
	@GetMapping("/resume")
	public String getListSTBinXML() {
		return"Envoi de la liste des STB";
		}
	
	@GetMapping("/id")
	public String getSTBinXML(
			@RequestParam(value = "name") String texte) {
		return ("Détail de la STB demandée : " + texte);
		}
	
	@GetMapping("/test")
	public String getTestList(
			@RequestParam(value = "nb") int id, @RequestParam(value = "texte") String titre) {
		return ("Test: <br>" + "id = " + id + "<br>" + "titre = " + titre);
		}
	
}
