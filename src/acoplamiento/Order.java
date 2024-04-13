package acoplamiento;
// bajo Acomplamiento
public class Order {

	private DatabaseOrder database;

	public Order(DatabaseOrder database) {
		super();
		this.database = database;
	}
	
	
	public void  guardar( ) {
		this.database.save();
	}
	//...
}
