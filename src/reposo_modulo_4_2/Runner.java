package reposo_modulo_4_2;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona isaura= new Persona();
		
		Persona valeria= new Persona("Valeria","Ortiz de la Tabla",20);
		
		Persona thomas= new Persona("Thomas");
		
		isaura.setNombre("        Isaura         ");
		isaura.setApellidos("Carrasco");
		isaura.setEdad(20);
		isaura.setEmail("ISAURA@MAIL.COM");
		
		
		isaura.caminar();
		valeria.caminar();
		thomas.caminar();
		
		System.out.println(isaura.getEmail());
		System.out.println(valeria.getNombre());
		System.out.println(thomas.getNombre());
	}

}
