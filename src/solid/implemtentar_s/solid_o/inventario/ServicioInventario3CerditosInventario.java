package solid.implemtentar_s.solid_o.inventario;

import solid.implemtentar_s.Pedido;

public class ServicioInventario3CerditosInventario extends ServicioInventario {

	public ServicioInventario3CerditosInventario(Pedido pedido) {
		super(pedido);
	}

	@Override
	public void descontarProducto() {
		System.out.println(" 3 cerditos descontando del inventario :"+pedido.getCantidad()+" producto"+pedido.getProducto().getNombre());
		
	}

}
