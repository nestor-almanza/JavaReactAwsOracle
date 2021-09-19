package mx.com.personal.sgbd.hospital.controller;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.personal.sgbd.hospital.model.Especialidad;
import mx.com.personal.sgbd.hospital.service.IEspecialidadService;

@RestController
public class EspecialidadController {
	
	@Autowired
	private IEspecialidadService service;
	
	@GetMapping("/v1/getEspecialidades")
	public List<Especialidad> getEspecialidades(){
		List<Especialidad> especialidades;
		System.out.println("controller inicia");
	    especialidades = service.listaAll();
		System.out.println("controller termina");
		return especialidades;
	}
	
	@GetMapping("/hello")
    public Collection<String> sayHello() {
        return IntStream.range(0, 10)
          .mapToObj(i -> "Hello number " + i)
          .collect(Collectors.toList());
    }
	
	@GetMapping("/saluda")
    public String saludar() {
        return "Hola alexis";
    }
	

}
