package mx.com.personal.sgbd.hospital.service;

import java.util.List;

import org.springframework.stereotype.Component;

import mx.com.personal.sgbd.hospital.model.Especialidad;



@Component
public interface IEspecialidadService {
	void create(Especialidad product);
	void update(Especialidad product);
	List<Especialidad> listaAll();
	Especialidad find(Integer id);
	void delete(Integer id);
	Especialidad findById(Integer id);
	List<Especialidad> listaAllProducts();
	List<Especialidad> listaAllProductsById(int id);
	List<Especialidad> listaAllProductsByIdTest();

}
