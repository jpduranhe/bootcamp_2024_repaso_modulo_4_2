package interfaz;

import herencia.Animal;

public class Caballo implements Comedor,Bebedor {

	public Caballo(String nombre) {
		//super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		System.out.println("Comiendo Alfalfa");
		
	}

	@Override
	public void beber() {
		System.out.println("Bebiendo Agua");
		
	}
	
	
	
	
	
}
