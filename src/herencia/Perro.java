package herencia;

public class Perro extends Animal{

	private String codigoChip;
	
	public Perro(String nombre, int peso,String codigoChip) {
		super(nombre, peso);
		this.codigoChip=codigoChip;
	}

	public String getCodigoChip() {
		return this.nombre+":"+codigoChip;
	}

	public void setCodigoChip(String codigoChip) {
		this.codigoChip = codigoChip;
	}

	@Override
	public String toString() {
		return "Perro [codigoChip=" + codigoChip + ", nombre=" + nombre + ", peso=" + peso + ", cantidadPatas="
				+ cantidadPatas + "]";
	}
	
	
	

}
