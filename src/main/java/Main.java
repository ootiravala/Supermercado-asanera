
public class Main {

	public static void main(String[] args) {

		Producto productoPizza = new Producto(5.50, "Pizza");
		Producto productoPera = new Producto(2.0, "Pera");

		productoPera.setNombre("Pera de Agua");

		Cliente cliente = new Cliente("Pepe", "Pera");
		Tienda tienda = new Tienda(cliente, productoPera);

		tienda.abrimosTienda();
	}

}
