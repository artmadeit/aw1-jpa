package clase3.entidades;

import java.math.BigDecimal;
import java.util.Arrays;

public class EjemploImagenes {

	public static void main(String[] args) {
		ProductoDao productoDao = new ProductoDao();
		
		Producto clonazepam = new Producto();
		clonazepam.nombre = "Clonazepam";
		clonazepam.precio = new BigDecimal(5.0);
		clonazepam.stock = 20;
		clonazepam.imagenes = Arrays.asList(
				"https://neurofarmacos.com/wp-content/uploads/4.jpg", 
				"https://s1.ppllstatics.com/ideal/www/multimedia/202206/06/media/cortadas/clonazepam-kdfE-U170332388998kNI-1248x770@Ideal.jpg"
		);
		productoDao.save(clonazepam);
		System.out.println("Producto registrado");
	}
}
