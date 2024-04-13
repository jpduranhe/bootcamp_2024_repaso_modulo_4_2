package solid.implemtentar_s.solid_o.persistencia;

import solid.implemtentar_s.Pedido;

public class ServicioPersistenciaMysql implements ServicioPersistencia {

	@Override
	public void guardarPedido(Pedido pedido) {
		System.out.println("pedido guardado en mysql");		
	}

}
