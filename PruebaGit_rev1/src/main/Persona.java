package main;

public class Persona {
	
	//Atributos
	String nombre, apellidos;
	int edad;
	String dni;
	String direccion;
	
	//Constructor
	public Persona() {};
	
	//Getter
	public String getNombre() {return this.nombre;}
	public String getApellidos() {return this.apellidos;}
	public int getEdad() {return this.edad;}

	
	//Setter
	public void setNombre(String nombre) {this.nombre = nombre;}
	
}
