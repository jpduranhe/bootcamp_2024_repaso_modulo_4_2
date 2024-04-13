package solid.implemtentar_s.bad;

import solid.implemtentar_s.Producto;

public class Pedido {
	
	private Producto producto;
	private int cantidad;
	private double totalPedido;
	
	public Pedido(Producto producto, int cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
		 calcularPrecioPedido();
	}

	void calcularPrecioPedido() {
		this.totalPedido= this.producto.getPrecio()*this.cantidad;
	}
	
	void descontarProductoInventario() {}
	void guardarPedido() {}
	void imprimirComprobante(){};
}
