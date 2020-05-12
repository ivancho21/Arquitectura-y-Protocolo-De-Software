package Clases;

import Interfaz.Conexion;

public class App {

	public static void main(String[] args) {
		Conexionf fabrica = new Conexionf();
		
		Conexion c1 = fabrica.getConexion("MySQL");
		c1.conectar();
		c1.desconectar();
		
		Conexion c2 = fabrica.getConexion("Oracle");
		c2.conectar();
		c2.desconectar();
		
		Conexion c3 =fabrica.getConexion("Vacia");
		c3.conectar();
		c3.desconectar();
		
	}

}
