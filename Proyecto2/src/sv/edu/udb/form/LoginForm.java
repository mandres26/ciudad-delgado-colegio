package sv.edu.udb.form;

import org.apache.struts.validator.ValidatorForm;

public class LoginForm extends ValidatorForm{
 private String usuario;
 private String pass;
 


public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}
 
 
}
