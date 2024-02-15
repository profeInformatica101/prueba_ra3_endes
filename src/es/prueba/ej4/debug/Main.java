package es.prueba.ej4.debug;

public class Main {
	public static void main(String[] args) {
		SistemaAutenticacion sa = new SistemaAutenticacion();
	    System.out.println(sa.autenticarUsuario("usuario1", "contraseña1") ? "Tienes acceso" : "Error");

	}
}
