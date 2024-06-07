package model;

public class Producto {
	//Atributos
	private String name;
	private Integer price;
	
	//Construtor y sobrecarga
	public Producto(String name, Integer price) {
		super();
		this.name = name;
		this.price = price;
	}
	public Producto(){
	}
	//Getters y setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Nombre: " + name + " /// Precio: $" + price;
	}
	
	
	
	
}
