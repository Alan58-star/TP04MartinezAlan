package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AplicacionController {
	
	@GetMapping("/home")
	public String InicarAplicacion() {
		return "index";
	}
	@GetMapping("/fixture")
	public String Fixture(){
		return "Fixture";
	}
	@GetMapping("/Equipos")
	public String Equipos() {
		return "Equipos";
	}
	@GetMapping("/home2")
	public String InicarAplicacion2() {
		return "index2";
	}
	@GetMapping("/veterinaria")
	public String Veterinaria() {
		return "Veterinaria";
	}
	@GetMapping("/voluntariado")
	public String Voluntariado() {
		return "Voluntariado";
	}
	@GetMapping("/adopciones")
	public String Adopciones() {
		return "Adopciones";
	}
}
