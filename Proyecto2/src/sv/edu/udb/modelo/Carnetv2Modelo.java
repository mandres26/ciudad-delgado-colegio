package sv.edu.udb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.NumberFormat;
import java.util.Calendar;

public class Carnetv2Modelo {

	public String generar() {
		Coneccion cn =new Coneccion();
		NumberFormat formato = NumberFormat.getInstance();
		formato.setMinimumIntegerDigits(2);
		// año actual.
		Calendar calendario = Calendar.getInstance();
		Integer año = calendario.get(Calendar.YEAR);
		String carnetbase = "";
		
		ResultSet rs = null;
		PreparedStatement pt = null;
		String query = "";
		
		
		
		return "";
	}
}
