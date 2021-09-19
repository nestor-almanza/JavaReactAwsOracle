package mx.com.personal.sgbd.hospital.dao;

import java.util.List;

import mx.com.personal.sgbd.hospital.model.Especialidad;



public interface IEspecialidadDAO {
	
	void create(Especialidad product);
	void update(Especialidad product);
	List<Especialidad> listaAll();
	Especialidad find(Integer id);
	void delete(Integer id);
	Especialidad findProductById(int id);
	List<Especialidad> findProducts();
	List<Especialidad> findProductsByAvailable(int id);
	List<Especialidad> findProductsByAvailableTest();
}
