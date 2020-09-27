
public class Producto {

	// Los atributos de una clase siempre son privados, nunca públicos.
	private double precio;
	private String nombre;

	public Producto(double precio, String nombre) {
		this.precio = precio;
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

}
