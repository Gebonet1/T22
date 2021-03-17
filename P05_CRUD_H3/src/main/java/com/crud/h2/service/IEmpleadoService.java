package com.crud.h2.service;

import java.util.List;

/**
 * @author Jose
 *
 */
import com.crud.h2.dto.Empleado;

public interface IEmpleadoService {

	//Metodos del CRUD
	public List<Empleado> listarEmpleados(); //Listar All 
	
	public Empleado guardarEmpleado(Empleado Empleado);	//Guarda un Empleado CREATE
	
	public Empleado EmpleadoXID(Long id); //Leer datos de un Empleado READ
	
	public List<Empleado> listarEmpleadoNomnbre(String nombre);//Listar Empleados por campo nombre
	
	public Empleado actualizarEmpleado(Empleado Empleado); //Actualiza datos del Empleado UPDATE
	
	public void eliminarEmpleado(Long id);// Elimina el Empleado DELETE
	
	
}
