package acoplamiento;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MysqlDataBase mysqo= new MysqlDataBase();
		OracleDataBase oracle= new OracleDataBase();
		Order order = new Order(mysqo);
		
		
		order.guardar();
	}

}
