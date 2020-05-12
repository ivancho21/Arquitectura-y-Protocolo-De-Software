package Implementaciones;

import Interfaz.Conexion;

public class Oracle implements Conexion {
	
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public Oracle () {
		
		this.host = "localhost";
		this.puerto = "1521";
		this.usuario = "admin";
		this.contraseña = "123";
		
	}

	@Override
	public void conectar() {
		System.out.println("se conecto Oracle");
		
	}

	@Override
	public void desconectar() {
		// TODO Auto-generated method stub
		System.out.println("se desconecto de Oracle");
		
	}


		
	}


