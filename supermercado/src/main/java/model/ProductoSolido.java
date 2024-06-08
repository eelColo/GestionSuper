package model;

public class ProductoSolido extends Producto{
	//atributos
	private String unidadDeVenta;
	//Constructores y sobrecarga

	public ProductoSolido(String name, Integer price, String unidadDeVenta) {
		super(name, price);
		this.unidadDeVenta = unidadDeVenta;
	}
	public ProductoSolido() {
		
	}
	//getters y setters
	public String getUnidadDeVenta() {
		return unidadDeVenta;
	}
	public void setUnidadDeVenta(String unidadDeVenta) {
		this.unidadDeVenta = unidadDeVenta;
	}
	//toString mod
	@Override
	public String toString() {
		return "Nombre: " + getName() + " /// Precio: " + getPrice() + " /// Unidad de venta: " + unidadDeVenta;
	}
	
}
