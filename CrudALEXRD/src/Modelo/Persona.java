/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author AleXRD
 */
public class Persona {
        private String nombre;
	private String apellido;
	private String CI;
	private String direccion;
	private int edad;
	public Persona(){
		this.nombre ="";
		this.apellido = "";
		this.CI = "";
		this.direccion = "";
		this.edad = 0;
	}
	public Persona(String nombre,String apellido,String CI,String direccion,int edad){
		this.nombre =nombre;
		this.apellido =apellido;
		this.CI = CI;
		this.direccion = direccion;
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCI() {
		return CI;
	}
	public void setCI(String cI) {
		CI = cI;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
        @Override
        public String toString() {
            return "{" + "nombre: " + nombre +" apellido: "+ apellido+" CI: "+CI+" direccion: "+
        		direccion+" edad: "+edad+ " }";
        }
}
