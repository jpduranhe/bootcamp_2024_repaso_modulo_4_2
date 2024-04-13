package solid.implemtentar_s;

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
		totalPedido= producto.getPrecio()*cantidad;
	}
	public double getTotalPrecioPedido() {
		return totalPedido;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getTotalPedido() {
		return totalPedido;
	}

	public void setTotalPedido(double totalPedido) {
		this.totalPedido = totalPedido;
	}
	
	
}
