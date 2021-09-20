package mx.com.personal.sgbd.hospital.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	  @PostMapping(value = "v1/insertar/especialidad" ,consumes = MediaType.APPLICATION_JSON_VALUE) 
	  public void registrar(@RequestBody Especialidad especialidad) { 
		  service.create(especialidad); 
	  }
	 
	
	 @PutMapping(value = "v1/actualizar/especialidad" ,consumes = MediaType.APPLICATION_JSON_VALUE) 
	 public void modificar(@RequestBody Especialidad especialidad) {   
		 service.update(especialidad); 
	 }
	 

	@DeleteMapping(value = "v1/eliminar/especialidad/{id}")
	public Integer eliminar(@PathVariable("id") Integer id) {
		Especialidad opt = service.findById(id);
		if (opt.getIdEspecialidad() == id) {
			Especialidad especialidad = new Especialidad();
			especialidad.setIdEspecialidad(id);
			service.delete(especialidad);
			return 1;
		}
		return 0;
	}
	

}
