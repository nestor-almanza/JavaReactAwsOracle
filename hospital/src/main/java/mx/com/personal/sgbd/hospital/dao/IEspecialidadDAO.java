package mx.com.personal.sgbd.hospital.dao;

import java.util.List;
import java.util.Optional;

import mx.com.personal.sgbd.hospital.model.Especialidad;



public interface IEspecialidadDAO {
	
	void create(Especialidad especialidad);
	void update(Especialidad especialidad);
	List<Especialidad> listaAll();
	void delete(Especialidad especialidad);
	Especialidad findById(Integer id);

}
