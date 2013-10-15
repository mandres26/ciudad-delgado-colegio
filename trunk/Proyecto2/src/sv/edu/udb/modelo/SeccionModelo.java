package sv.edu.udb.modelo;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sv.edu.udb.form.SeccionForm;
public class SeccionModelo {

Coneccion cn =new Coneccion();
	
	public Integer insertar(SeccionForm sf){
		Integer valor = 0;
        PreparedStatement pt = null;
        String query = "insert into seccion values(?,?,?)";
        
        try {
			pt = cn.getConexion().prepareStatement(query);
			pt.setString(1, null);
			pt.setString(2, sf.getSeccion());
			pt.setString(3, sf.getCupo());
			
			valor = pt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return valor;
	}
}
