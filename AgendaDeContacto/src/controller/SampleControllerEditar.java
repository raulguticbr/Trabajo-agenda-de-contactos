package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
		try {
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
		catch(Exception e) {
			Alert alert= new  Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("El formato no es correcto, revisa que no hayas escrito un caracter donde no debas o hayas dejado algun campo vacio.");
			alert.showAndWait();
		}
		}
		
		
	public Persona getPersona() {
		return persona;
	}
	

}
