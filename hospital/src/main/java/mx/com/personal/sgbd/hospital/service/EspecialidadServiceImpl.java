package mx.com.personal.sgbd.hospital.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.personal.sgbd.hospital.dao.IEspecialidadDAO;
import mx.com.personal.sgbd.hospital.model.Especialidad;


@Component
public class EspecialidadServiceImpl implements IEspecialidadService {
	
	@Autowired
	private IEspecialidadDAO  daoEspecialidad;

	public void create(Especialidad especialidad) {
		daoEspecialidad.create(especialidad);
		
	}

	public void update(Especialidad especialidad) {
		daoEspecialidad.update(especialidad);
	}

	public List<Especialidad> listaAll() {
		return daoEspecialidad.listaAll();
	}

	public Especialidad find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Especialidad especialidad) {
		daoEspecialidad.delete(especialidad);
		
	}

	public Especialidad findById(Integer id) {
		return daoEspecialidad.findById(id);
	}

	public List<Especialidad> listaAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Especialidad> listaAllProductsById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Especialidad> listaAllProductsByIdTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
