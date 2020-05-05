package metodo;

import inter.IConexion;
import inpementaciones.ConexionMySQL;
import inpementaciones.ConexionOracle;
import inpementaciones.ConexionPostgreSQL;
import inpementaciones.ConexionSQLServer;
import inpementaciones.ConexionVacia;

public class ConexionFabrica {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}
}
