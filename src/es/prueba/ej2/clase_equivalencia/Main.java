package es.prueba.ej2.clase_equivalencia;

public class Main {

	public static void main(String[] args) {
		SistemaCompra sc = new SistemaCompra();
		
		
		String c1 = sc.realizarCompra("00011", 3, "direccion", "Tarjeta");
	
		System.out.println(c1);
		
		
		String c2 = sc.realizarCompra("00010", 3, "direccion", "Tarjeta");
		System.out.println(c2);
	}

}
