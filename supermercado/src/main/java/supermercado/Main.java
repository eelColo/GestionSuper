package supermercado;


import model.ProductoHigiene;
import model.ProductoLiquido;
import model.ProductoSolido;
import service.ProductService;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService ps = new ProductService();
		
		
		ps.addProduct(new ProductoLiquido("Coca-Cola Zero", 1.5, 20));
		ps.addProduct(new ProductoLiquido("Coca-Cola", 1.5, 18));
		ps.addProduct(new ProductoHigiene("Shampoo Sedal", 500, 19));
		ps.addProduct(new ProductoSolido("Frutillas", 64, "kilo"));
		
		ps.listAll();
		
		ps.maxAndMin();
	}

}
