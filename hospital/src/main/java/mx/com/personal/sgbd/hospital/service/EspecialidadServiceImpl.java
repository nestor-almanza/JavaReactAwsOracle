package mx.com.personal.sgbd.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import mx.com.personal.sgbd.hospital.dao.IEspecialidadDAO;
import mx.com.personal.sgbd.hospital.model.Especialidad;


@Component
public class EspecialidadServiceImpl implements IEspecialidadService {
	
	@Autowired
	private IEspecialidadDAO  daoEspecialidad;

	public void create(Especialidad product) {
		// TODO Auto-generated method stub
		
	}

	public void update(Especialidad product) {
		// TODO Auto-generated method stub
		
	}

	public List<Especialidad> listaAll() {
		return daoEspecialidad.listaAll();
	}

	public Especialidad find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Especialidad findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
