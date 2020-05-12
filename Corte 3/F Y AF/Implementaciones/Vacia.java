package Implementaciones;

import Interfaz.Conexion;

public class Vacia implements Conexion {

	@Override
	public void conectar() {
		// TODO Auto-generated method stub
		System.out.println("no se especifica proveedor");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("no se especifica proveedor");
	}
	
	

}
