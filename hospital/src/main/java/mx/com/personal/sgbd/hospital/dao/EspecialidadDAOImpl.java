package mx.com.personal.sgbd.hospital.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import mx.com.personal.sgbd.hospital.model.Especialidad;


@Component
public class EspecialidadDAOImpl extends JdbcDaoSupport implements IEspecialidadDAO{

	@Autowired
	public EspecialidadDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public void create(Especialidad product) {
		// TODO Auto-generated method stub
		
	}

	public void update(Especialidad product) {
		// TODO Auto-generated method stub
		
	}

	public List<Especialidad> listaAll() {
		String sql = "SELECT id_especialidad, nombre FROM tc_especialidad ORDER BY id_especialidad";
		List<Especialidad> lista = getJdbcTemplate().query(sql, new BeanPropertyRowMapper<Especialidad>(Especialidad.class));
		return lista;
	}

	public Especialidad find(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	public Especialidad findProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Especialidad> findProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Especialidad> findProductsByAvailable(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Especialidad> findProductsByAvailableTest() {
		// TODO Auto-generated method stub
		return null;
	}

}
