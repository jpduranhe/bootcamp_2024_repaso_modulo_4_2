package solid.implemtentar_s.solid_o.inventario;

import solid.implemtentar_s.Pedido;

public abstract class ServicioInventario {
	
	
	
	public ServicioInventario(Pedido pedido) {
		super();
		this.pedido = pedido;
	}

	protected Pedido pedido;
	

	public abstract void descontarProducto();
	
	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	
	
}

