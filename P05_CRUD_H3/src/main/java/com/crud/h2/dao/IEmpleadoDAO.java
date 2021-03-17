package com.crud.h2.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.h2.dto.Empleado;


public interface IEmpleadoDAO extends JpaRepository<Empleado, Long>{
	
	//Listar Empleados or campo nombre
	public List<Empleado> findByNombre(String nombre);
	
}
