
public class Tienda {

	// Atributos de clase: definimos loas entidades que va a tener nuestra clase.

	private Producto producto;
	private Cliente cliente;

	public Tienda(Cliente cliente, Producto producto) {
		this.cliente = cliente;
		this.producto = producto;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void abrimosTienda() {
		System.out.println("El cliente: " + cliente.getNombre() + ", quiere " + cliente.getProductosDeseados());
		if (cliente.getProductosDeseados().equals(producto.getNombre())) {
			System.out.println("Se ha comprado: " + producto.getNombre());
		} else if (producto.getNombre().contains(cliente.getProductosDeseados())) {
			System.out
					.println("Lo sentimos, se nos ha agotado el producto. Te podemos ofrecer: " + producto.getNombre());
		} else {
			System.out.println("Lo sentimos, no tenemos el producto.");
		}
	}
}
