package com.crud.h2.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Empleado")//en caso que la tabala sea diferente
public class Empleado {

	//Atributos de entidad Empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "trabajo")
	private String trabajo;
	@Column(name = "sueldo")
	private int sueldo;
	
	//Constructores
	
	public Empleado() {
	
	}

	/**
	 * @param id
	 * @param nombre
	 * @param puesto
	 * @param sueldo
	
	 */
	public Empleado(Long id, String nombre, String apellido, String trabajo, int sueldo) {
		//super();
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.sueldo=asignarSalario(trabajo);
		
	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPuesto() {
		return trabajo;
	}

	public void setPuesto(String puesto) {
		this.trabajo = puesto;
	}

	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	
	
	public void assignarSalario() {
		
		
	}
	  public int asignarSalario(String trabajo) {
	        switch(trabajo) {
	        case "Software Developer":
	            sueldo = 2500;
	            break;
	        case "Accountant":
	            sueldo = 2000;
	            break;
	        case "CEO":
	            sueldo = 4000;
	            break;
	        case "Customer Service Agent":
	            sueldo = 1500;
	            break;
	        case "Business developer":
	            sueldo = 2100;
	            break;
	        default:
	            sueldo = 900;
	        }
	        return sueldo;
	    }

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", puesto=" + trabajo + ", sueldo=" + sueldo + "]";
	}


	
	
}
