package interfaz;

import herencia.Animal;

public class Tiburon   implements Comedor {

	

	public Tiburon(String nombre) {
		//super(nombre);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comer() {
		System.out.println("Comiendo Humanos");
		
	}

}
