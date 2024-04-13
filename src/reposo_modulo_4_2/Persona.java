package reposo_modulo_4_2;

import java.util.List;

public class Persona {
	
	/*
	 * public ---> cualquiera puede verlo
	 * private --> no es vible fuera de clase
	 * protected --> ???
	 * */

	//atributos
	private String nombre;
	private String apellidos;
	private int edad;
	private String email;
	private List<Hobby> hobby; //1 a m
	private Comuna comunaPersona;

	

	//constructores
	public Persona() {}//--> constructor por defecto
	public Persona(String nombre,String apellidos,int edad) {
		this.nombre = nombre;
		this.apellidos=apellidos;
		this.edad=edad;
	}
	public Persona(String nombre) {
		this.nombre= nombre;
	}
	public Persona(String nombre,String apellidos) {
		this.nombre= nombre;
		this.apellidos= apellidos;
	}
	public Persona(int edad) {
		this.edad= edad;
	}
	//metodos
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre.trim().toUpperCase();
	}
	
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email.toLowerCase();
	}
	public List<Hobby> getHobby() {
		return hobby;
	}
	public void setHobby(List<Hobby> hobby) {
		this.hobby = hobby;
	}
	public void caminar() {
		System.out.println(this.nombre+" esta Caminando");
	}
	public String hablar() {
		return this.nombre+":bla bla bla";
	}
}
