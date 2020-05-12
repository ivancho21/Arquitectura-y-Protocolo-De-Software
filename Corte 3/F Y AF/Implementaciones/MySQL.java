package Implementaciones;

import Interfaz.Conexion;

public class MySQL implements Conexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public MySQL () {
		
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "root";
		this.contraseña = "123";
		
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto a MySQL");
		
	}

	@Override
	public void desconectar() {
		System.out.println("se deconecto DE MySQL");
		
	}


	
	

}
