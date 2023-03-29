package org.aavella.proyectoAlmacen;

public class Ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lacteo Lacteo1 = new Lacteo("Leche", 250.00, 100, 15);
		Lacteo Lacteo2 = new Lacteo("Yogurt", 120.00, 50, 8);
		
		Fruta Fruta1 = new Fruta("Manzana", 100.00, 5.25, "Roja");
		Fruta Fruta2 = new Fruta("Banana", 120.00, 6.00, "Amarilla");
		
		Limpieza Limpieza1 = new Limpieza("Lavandina", 200.00, "Cloro y Agua", 10);
		Limpieza Limpieza2 = new Limpieza("Jabon liquido", 400.00, "Jabon y agua", 10);
		
		NoPerecible NoPerecible1 = new NoPerecible("Atún", 120.00, 15, 100);
		NoPerecible NoPerecible2 = new NoPerecible("Legumbres", 200.00, 10, 40);
		
		Producto productos[] = {Lacteo1, Lacteo2, Fruta1, Fruta2, Limpieza1, Limpieza2, NoPerecible1, NoPerecible2};
		
		for (Producto cont:productos) {
			System.out.println(cont.getNombre());
			System.out.println("$" +cont.getPrecio());
			System.out.println(cont.toString());
			System.out.println("============================================");
		}
		

	}

}
