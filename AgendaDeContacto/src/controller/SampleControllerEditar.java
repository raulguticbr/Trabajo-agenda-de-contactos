package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Persona;

public class SampleControllerEditar {
	@FXML
	private TextField NombreAñadir;
	@FXML
	private TextField ApellidosAñadir;
	@FXML
	private TextField DireccionAñadir;
	@FXML
	private TextField CiudadAñadir;
	@FXML
	private TextField CodAñadir;
	@FXML
	private TextField DateAñadir;
	@FXML
	private TextField TelefAñadir;
	@FXML
	private Button salir;
	
	private Persona persona;
	
	@FXML
	private void salir (ActionEvent event) {
		Stage stage =(Stage) this.salir.getScene().getWindow();
		stage.close();
	}

	@FXML
	private void guardar (ActionEvent event) {
		String nombre=NombreAñadir.getText();
		String apellidos=ApellidosAñadir.getText();
		String direccion =DireccionAñadir.getText();
		String ciudad= CiudadAñadir.getText();
		int codigo=Integer.parseInt(CodAñadir.getText());
		String date=DateAñadir.getText();
		int telefono = Integer.parseInt(TelefAñadir.getText());
		
		this.persona=new Persona(nombre,apellidos,direccion,ciudad,date,codigo,telefono);
		
		Stage stage =(Stage) this.salir.getScene().getWindow();
		stage.close();
	}
	public Persona getPersona() {
		return persona;
	}
	

}
