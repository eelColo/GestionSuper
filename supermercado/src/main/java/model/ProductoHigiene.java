package model;

public class ProductoHigiene extends Producto{
	//Atributos
	private Integer contenido;
	//Constructor y sobrecarga

	public ProductoHigiene(String name, Integer contenido, Integer price) {
		super(name, price);
		this.contenido = contenido;
	}
	public ProductoHigiene() {
		
	}
	
	//Getters y Setters
	
	public Integer getContenido() {
		return contenido;
	}
	public void setContenido(Integer contenido) {
		this.contenido = contenido;
	}
	
	//toString mod
	@Override
	public String toString() {
		return "Nombre: " + getName() + " /// Contenido: " + contenido + "ml /// Precio: " + getPrice();
	}
	
}
