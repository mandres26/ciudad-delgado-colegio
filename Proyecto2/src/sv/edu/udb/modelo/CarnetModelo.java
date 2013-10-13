package sv.edu.udb.modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class CarnetModelo {

	public ArrayList<String> alumno() {
		Coneccion cn =new Coneccion();
		ResultSet rs = null;
		PreparedStatement pt = null;
		ArrayList<String> lista = new ArrayList<String>();
		// año actual.
		Calendar calendario = Calendar.getInstance();
		Integer año = calendario.get(Calendar.YEAR);
		String query = "select count(*),codigo_alumno from alumno where fila=(select MAX(fila) AS max  from alumno)";
		String carnet = " ";
		try {
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			while (rs.next()) {
				if(rs.getInt(1)==0){
					//evitar error null
					lista.add(rs.getString(1));
					lista.add(año+"0000");
				}else{
					lista.add(rs.getString(1));
					lista.add(rs.getString(2));
				}
				
				
				System.out.println("alumnocarnet: " + rs.getInt(1) + " "
						+ rs.getString(2));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return lista;
	}

	public String generar() {
		Coneccion cn =new Coneccion();

		NumberFormat formato = NumberFormat.getInstance();
		formato.setMinimumIntegerDigits(2);

		// año actual.
		Calendar calendario = Calendar.getInstance();
		Integer año = calendario.get(Calendar.YEAR);

		String carnetbase = "";
		String carnet = "";
		try {
			ResultSet rs = null;
			PreparedStatement pt = null;
			String query = "select count(*),codigo_docentes from docentes where fila=(select MAX(fila) AS max  from docentes)";
			pt = cn.getConexion().prepareStatement(query);
			rs = pt.executeQuery();
			ArrayList<String> lista =new ArrayList<String>();
			lista = alumno();
			while (rs.next()) {

				if (rs.getInt(1) == 0 && lista.get(0).equals(0)) {
					System.out.println("carnet inicial");
					carnet = año.toString() + "0001";
					
				}else{
					if(rs.getString(2)==null){//evitar error null
						carnet = año+"0000";
					}else{
						
						carnet = rs.getString(2);
					}
					
					// division
					String añodocente = carnet.substring(0, 4);
					String part1docente = carnet.substring(4, 6);
					String part2docente = carnet.substring(6, 8);
					// convercion
					Integer yeardocente = Integer.parseInt(añodocente);
					Integer n1docente = Integer.parseInt(part1docente);
					Integer n2docente = Integer.parseInt(part2docente);
					
					String carnetAlumno = lista.get(1).toString();
					// division
					String añoAlumno = carnetAlumno.substring(0, 4);
					String part1Alumno = carnetAlumno.substring(4, 6);
					String part2Alumno = carnetAlumno.substring(6, 8);
					// convercion
					Integer yearAlumno = Integer.parseInt(añoAlumno);
					Integer n1Alumno = Integer.parseInt(part1Alumno);
					Integer n2Alumno = Integer.parseInt(part2Alumno);
					
					if(año>yeardocente && año>yearAlumno){//reinicio de codigo por año
						n1docente=0;
						n2docente=0;
						n1Alumno=0;
						n2Alumno=0;
					}
					
					if(añoAlumno.equals(añodocente)){
						
						if (n1docente==n1Alumno) {//cuando son iguales n1
							if(n2docente>n2Alumno){
								System.out.println("== docente");
							
							carnet = año.toString();

							if (n2docente == 99) {
								n1docente += 1;
								n2docente = 1;
								carnet += formato.format(n1docente)
										+ formato.format(n2docente);

							} else {
								n2docente++;
								carnet += formato.format(n1docente)
										+ formato.format(n2docente);
							}
							}else{
								System.out.println("== alumno");
								carnet = año.toString();
								if (n2Alumno == 99) {
									n1Alumno += 1;
									n2Alumno = 1;
									carnet += formato.format(n1Alumno)
											+ formato.format(n2Alumno);

								} else {
									n2Alumno++;
									carnet += formato.format(n1Alumno)
											+ formato.format(n2Alumno);
								}
							}
						}else{
							if(n1docente>n1Alumno){//cuando un n1 es mayor
								System.out.println(">> docente");
								carnet = año.toString();

								if (n2docente == 99) {
									n1docente += 1;
									n2docente = 1;
									carnet += formato.format(n1docente)
											+ formato.format(n2docente);

								} else {
									n2docente++;
									carnet += formato.format(n1docente)
											+ formato.format(n2docente);
								}
							}else{
								System.out.println(">> alumno");
								carnet = año.toString();
								if (n2Alumno == 99) {
									n1Alumno += 1;
									n2Alumno = 1;
									carnet += formato.format(n1Alumno)
											+ formato.format(n2Alumno);

								} else {
									n2Alumno++;
									carnet += formato.format(n1Alumno)
											+ formato.format(n2Alumno);
								}
								
							}
							
						} 
						
					}else{
						if(yeardocente>yearAlumno){//cuando hay años diferentes en la base
							System.out.println("año>> docente");
							
							carnet = año.toString();

							if (n2docente == 99) {
								n1docente += 1;
								n2docente = 1;
								carnet += formato.format(n1docente)
										+ formato.format(n2docente);

							} else {
								n2docente++;
								carnet += formato.format(n1docente)
										+ formato.format(n2docente);
							}
							
						}else{
							System.out.println("año1>> alumno");
							carnet = año.toString();
							if (n2Alumno == 99) {
								n1Alumno += 1;
								n2Alumno = 1;
								carnet += formato.format(n1Alumno)
										+ formato.format(n2Alumno);

							} else {
								n2Alumno++;
								carnet += formato.format(n1Alumno)
										+ formato.format(n2Alumno);
							}
							
						}
						
						
					}
					
					

					
					
				} 
			}

			System.out.println("carnet generado: " + carnet);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return carnet;
	}

}
