package Clases;

import Interfaz.*;
import Implementaciones.*;

public class ConexionR implements FA {

	@Override
	public Conexion getBD(String motor) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Interfaz.ConexionR getR(String area) {
		if (area == null) {
			return new SA();
		}
		if(area.equalsIgnoreCase("COMPRAS")) {
			return new compra();
		}else if (area.equalsIgnoreCase("VENTAS")) {
			return new ventas();
		}
	return null;
	}
	
	



}
