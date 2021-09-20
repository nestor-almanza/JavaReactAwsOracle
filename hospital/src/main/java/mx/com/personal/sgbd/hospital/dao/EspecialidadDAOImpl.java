package mx.com.personal.sgbd.hospital.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

import mx.com.personal.sgbd.hospital.model.Especialidad;


@Component
public class EspecialidadDAOImpl extends JdbcDaoSupport implements IEspecialidadDAO{

	@Autowired
	public EspecialidadDAOImpl(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	public void create(Especialidad especialidad) {
		String sql = "INSERT into tc_especialidad (id_especialidad, nombre) values(?,?)";
		getJdbcTemplate().update(sql, new Object[] {especialidad.getIdEspecialidad() , especialidad.getNombre()});
		
	}

	public void update(Especialidad especialidad) {
		String sql = "UPDATE tc_especialidad SET nombre = ? WHERE id_especialidad = ?";
		getJdbcTemplate().update(sql, new Object[] {especialidad.getNombre(), especialidad.getIdEspecialidad()});
		
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

	public void delete(Especialidad especialidad) {
		String sql = "delete from tc_especialidad where id_especialidad = ? ";
		getJdbcTemplate().update(sql, especialidad.getIdEspecialidad());
	}

	public Especialidad findById(Integer id) {
		String sql = "select  id_especialidad, nombre FROM tc_especialidad where id_especialidad = ?";
		Especialidad  objeto = 
				getJdbcTemplate().queryForObject(sql, new Object[]{id}, new BeanPropertyRowMapper<Especialidad>(Especialidad.class));
		return objeto;
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
