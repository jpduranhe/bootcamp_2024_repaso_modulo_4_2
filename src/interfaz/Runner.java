package interfaz;

public class Runner {

	public static void main(String[] args) {
		Tiburon tiburon= new Tiburon("Tiburoncin Ujaja");
		Caballo caballo = new Caballo("Tormenta China");		
		
		comer(tiburon);
		comer(caballo);
		beber(caballo);
	}
	
	
	public static void comer(Comedor comedor) {
		comedor.comer();
	}
	public static void beber(Bebedor bebedor) {
		bebedor.beber();
	}
}
