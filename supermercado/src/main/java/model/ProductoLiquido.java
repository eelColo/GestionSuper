package model;

public class ProductoLiquido extends Producto{
	//Atributos
	private Double litros;
	//Constructores y sobrecarga
	public ProductoLiquido(String name, Double litros, Integer price) {
		super(name, price);
		this.litros = litros;
	}
	public ProductoLiquido() {
		
	}
	//Setters y getters
	public Double getLitros() {
		return litros;
	}
	public void setLitros(Double litros) {
		this.litros = litros;
	}
	//toString mod
	@Override
	public String toString() {
		return "Nombre: " + getName() + " /// Litros: " +  litros + " /// Precio: " + getPrice();
	}
	
	
	
}
