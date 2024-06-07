package model;

public class ProductoLiquido extends Producto{
	//Atributos
	private Integer litros;
	//Constructores y sobrecarga
	public ProductoLiquido(String name, Integer price, Integer litros) {
		super(name, price);
		this.litros = litros;
	}
	public ProductoLiquido() {
		
	}
	//Setters y getters
	public Integer getLitros() {
		return litros;
	}
	public void setLitros(Integer litros) {
		this.litros = litros;
	}
	//toString mod
	@Override
	public String toString() {
		return "Nombre: " + getName() + " /// Litros: " +  litros + " /// Precio: " + getPrice();
	}
	
	
	
}
