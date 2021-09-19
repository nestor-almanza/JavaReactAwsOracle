package mx.com.personal.sgbd.hospital;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import mx.com.personal.sgbd.hospital.model.Especialidad;
import mx.com.personal.sgbd.hospital.service.EspecialidadServiceImpl;
import mx.com.personal.sgbd.hospital.service.IEspecialidadService;


public class AppHospital {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfigOracle.class);
		
		IEspecialidadService service = (IEspecialidadService) context.getBean(EspecialidadServiceImpl.class);

		 service.listaAll().forEach(x->
		System.out.println( x.getIdEspecialidad() + " , " + x.getNombre()));
		
		
	}

}
