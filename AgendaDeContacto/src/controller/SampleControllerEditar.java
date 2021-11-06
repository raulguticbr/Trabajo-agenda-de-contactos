package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Persona;

public class SampleControllerEditar {
	@FXML
	private TextField NombreA�adir;
	@FXML
	private TextField ApellidosA�adir;
	@FXML
	private TextField DireccionA�adir;
	@FXML
	private TextField CiudadA�adir;
	@FXML
	private TextField CodA�adir;
	@FXML
	private TextField DateA�adir;
	@FXML
	private TextField TelefA�adir;
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
		String nombre=NombreA�adir.getText();
		String apellidos=ApellidosA�adir.getText();
		String direccion =DireccionA�adir.getText();
		String ciudad= CiudadA�adir.getText();
		int codigo=Integer.parseInt(CodA�adir.getText());
		String date=DateA�adir.getText();
		int telefono = Integer.parseInt(TelefA�adir.getText());
		
		this.persona=new Persona(nombre,apellidos,direccion,ciudad,date,codigo,telefono);
		
		Stage stage =(Stage) this.salir.getScene().getWindow();
		stage.close();
	}
	public Persona getPersona() {
		return persona;
	}
	

}
