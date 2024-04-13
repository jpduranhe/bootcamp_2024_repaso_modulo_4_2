package herencia;

public class Gato extends Animal{

	private int  vidasRestantes;
	public Gato(String nombre, int peso) {
		super(nombre,peso);
		vidasRestantes=7;
		// TODO Auto-generated constructor stub
	}
	
	public int getVidasRestantes() {
		return this.vidasRestantes;
	}

	@Override
	public String toString() {
		return "Gato [vidasRestantes=" + vidasRestantes + ", nombre=" + nombre + ", peso=" + peso + ", cantidadPatas="
				+ cantidadPatas + "]";
	}
	
	

}
