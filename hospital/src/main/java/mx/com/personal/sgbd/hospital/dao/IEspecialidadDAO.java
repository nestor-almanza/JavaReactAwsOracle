package mx.com.personal.sgbd.hospital.dao;

import java.util.List;
import java.util.Optional;

import mx.com.personal.sgbd.hospital.model.Especialidad;



public interface IEspecialidadDAO {
	
	void create(Especialidad especialidad);
	void update(Especialidad especialidad);
	List<Especialidad> listaAll();
	Especialidad find(Integer id);
	void delete(Especialidad especialidad);
	Especialidad findById(Integer id);
	List<Especialidad> findProducts();
	List<Especialidad> findProductsByAvailable(int id);
	List<Especialidad> findProductsByAvailableTest();
}
