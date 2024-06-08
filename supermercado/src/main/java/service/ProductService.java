package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.Producto;

public class ProductService {
	List<Producto> productos = new ArrayList<>();
	public void addProduct(Producto nProduct) {
		productos.add(nProduct);
		
	}
	
	//ForEach para listar cada producto
	public void listAll(){
		for(Producto p : productos) {
			System.out.println(p);
		}
		System.out.println("=============================");
	}
	//retorna el mas caro y mas barato
	public void maxAndMin() {
		System.out.println("Producto más caro: " + Collections.max(productos).getName());
		System.out.println("Producto más barato: " + Collections.min(productos).getName());
	}
}
