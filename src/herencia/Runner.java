package herencia;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal= new Gato("ConBotas",3);
		//animal.setNombre("Cachupin Animal");
		//animal.setPeso(3);
		animal.setCantidadPatas(4);
		
		Perro perro= new Perro("Cachupin Perro",3,"Abc123");
		//perro.setNombre("Cachupin Perro");
		//perro.setPeso(3);
		perro.setCantidadPatas(4);
		//System.out.println(animal.getNombre());
		//System.out.println(perro.getNombre());
		
		//System.out.println(perro.getCodigoChip());
		//System.out.println(perro.getCantidadPatas());
		Gato sinBotas= new Gato("sinBotas",3);
		
		
		imprimirAnimal(animal);
		imprimirAnimal(sinBotas);
		imprimirAnimal(perro);
	}
	
	public static void imprimirAnimal(Animal animal) {
		System.out.println(animal.toString());
	}

}
