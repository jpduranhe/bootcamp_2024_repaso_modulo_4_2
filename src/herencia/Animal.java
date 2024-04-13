package herencia;

public abstract class Animal {
	
	protected String nombre;
	protected int peso;
	protected int cantidadPatas;
	
		
	public Animal(String nombre, int peso) {
		this.nombre = nombre;
		this.peso = peso;
	}
	public Animal(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getCantidadPatas() {
		return cantidadPatas;
	}
	public void setCantidadPatas(int cantidadPatas) {
		this.cantidadPatas = cantidadPatas;
	}
	
	@Override
	public String toString() {
		return "Animal [nombre: "+this.nombre+", peso:"+this.peso+",cantidadPatas:"+this.cantidadPatas+" ]";
	}
	
	public String toString(String text) {
		return text+"-->  Animal [nombre: "+this.nombre+", peso:"+this.peso+",cantidadPatas:"+this.cantidadPatas+" ]";
	}
}
