
public class Cliente {

	private String nombre;
	private String productosDeseados;

	public Cliente(String nombre, String productosDeseados) {
		this.nombre = nombre;
		this.productosDeseados = productosDeseados;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getProductosDeseados() {
		return productosDeseados;
	}

	public void setProductosDeseados(String productosDeseados) {
		this.productosDeseados = productosDeseados;
	}

}
