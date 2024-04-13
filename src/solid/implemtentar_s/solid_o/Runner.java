package solid.implemtentar_s.solid_o;

import solid.implemtentar_s.Pedido;
import solid.implemtentar_s.Producto;
import solid.implemtentar_s.solid_o.persistencia.ServicioPersistencia;
import solid.implemtentar_s.solid_o.inventario.*;
import solid.implemtentar_s.solid_o.persistencia.*;

public class Runner {
	public static ServicioPersistencia servicioPersistencia;
	public static ServicioInventario servicioInventario;
	public static void main(String[] args) {
		
		
		//servicioPersistencia= new ServicioPersistenciaMysql();
		//servicioPersistencia= new ServicioPersistenciaOracle();
		servicioPersistencia= new ServicioPersistenciaMssql();
		
		Producto producto= new Producto();
		producto.setNombre("TV LG");
		producto.setPrecio(350000);
		Pedido pedido= new Pedido(producto,3);
		
		
		//servicioInventario= new ServicioInventarioSap(pedido);
		servicioInventario= new ServicioInventario3CerditosInventario(pedido);
		
		guardar(pedido);
		inventario(pedido);
	}
	
	
	public static void guardar(Pedido pedido) {
		servicioPersistencia.guardarPedido(pedido);
	}
	public static void inventario(Pedido pedido) {
		servicioInventario.descontarProducto();
	}
}
