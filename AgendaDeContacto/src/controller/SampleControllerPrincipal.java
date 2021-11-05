package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.Persona;

public class SampleControllerPrincipal implements Initializable {
	@FXML
	private TableView tabla;
	@FXML
	private TableColumn columna1;
	@FXML
	private TableColumn columna2;
	@FXML
	private void agregar(ActionEvent event) throws IOException {
		FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/SampleAgregar.fxml"));
		Parent root= loader.load();
		SampleControllerAgregar controlador =loader.getController();
		Scene scene =new Scene(root);
		Stage stage =new Stage();
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setScene(scene);
		stage.showAndWait();
		Persona p= controlador.getPersona();
		tabla.getItems().add(p);
		
	}
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		columna1.setCellValueFactory(new PropertyValueFactory<>("nombre"));
		columna2.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
		
		
		tabla.getItems().add(new Persona("manolo","juarez","la peña","malaga","en marzo",4343,4343));
		
		
	}

	public TableView getTabla() {
		return tabla;
	}

	public void setTabla(TableView tabla) {
		this.tabla = tabla;
	}
	
}
