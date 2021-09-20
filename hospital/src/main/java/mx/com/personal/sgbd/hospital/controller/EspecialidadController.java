package mx.com.personal.sgbd.hospital.controller;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.personal.sgbd.hospital.model.Especialidad;
import mx.com.personal.sgbd.hospital.service.IEspecialidadService;



@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class EspecialidadController {
	
	@Autowired
	private IEspecialidadService service;
	
	@GetMapping("/v1/getEspecialidades")
	public List<Especialidad> getEspecialidades(){
		List<Especialidad> especialidades;
	    especialidades = service.listaAll();
		return especialidades;
	}
	
	
	

}
