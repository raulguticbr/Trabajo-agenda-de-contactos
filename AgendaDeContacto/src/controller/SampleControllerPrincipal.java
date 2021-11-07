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
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
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
	private Text texto1;
	@FXML
	private Text texto2;
	@FXML
	private Text texto3;
	@FXML
	private Text texto4;
	@FXML
	private Text texto5;
	@FXML
	private Text texto6;
	@FXML
	private Text texto7;
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
	@FXML
	private void mostrar(MouseEvent event) {
		Persona persona=(Persona) tabla.getSelectionModel().getSelectedItem();
		if(persona!=null) {
			try {
				texto1.setText(persona.getNombre());
				texto2.setText(persona.getApellidos());
				texto3.setText(persona.getDireccion());
				texto4.setText(persona.getCiudad());
				texto5.setText(Integer.toString(persona.getCodigo()));
				texto6.setText(persona.getDate());
				texto7.setText(Integer.toString(persona.getTelefono()));
				
			}
			catch(Exception e){
				Alert alert= new  Alert(Alert.AlertType.ERROR);
				alert.setHeaderText(null);
				alert.setTitle("Error");
				alert.setContentText("El formato no es correcto, revisa que no hayas escrito un caracter donde no debas o hayas dejado algun campo vacio.");
				alert.showAndWait();
			}
			
		}
		else {
			Alert alert= new  Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("No se ha seleccionado ninguna persona en la tabla");
			alert.showAndWait();
		}
		
		
		
		
	
	}
	@FXML
	private void editar(ActionEvent event ) throws IOException {
		Persona person =(Persona) tabla.getSelectionModel().getSelectedItem();
		if (person!=null) {
			FXMLLoader loader=new FXMLLoader(getClass().getResource("/view/SampleEditar.fxml"));
			Parent root= loader.load();
			SampleControllerEditar controlador =loader.getController();
			Scene scene =new Scene(root);
			Stage stage =new Stage();
			stage.initModality(Modality.APPLICATION_MODAL);
			stage.setScene(scene);
			stage.showAndWait();
			
			if(controlador.getPersona()!=null) {
				person.setNombre(controlador.getPersona().getNombre());
				person.setApellidos(controlador.getPersona().getApellidos());
				person.setDireccion(controlador.getPersona().getDireccion());
				person.setCiudad(controlador.getPersona().getCiudad());
				person.setDate(controlador.getPersona().getDate());
				person.setCodigo(controlador.getPersona().getCodigo());
				person.setTelefono(controlador.getPersona().getTelefono());
				tabla.refresh();
			}
		}
		else {
			Alert alert= new  Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("No se ha seleccionado ninguna persona en la tabla");
			alert.showAndWait();
		}
		
		
		
	
		
	}
	@FXML
	private void borrar(ActionEvent event) {
		Persona persona = (Persona)tabla.getSelectionModel().getSelectedItem();
		if(persona!=null) {
			tabla.getItems().remove(persona);
			tabla.refresh();
		}
		else {
			Alert alert= new  Alert(Alert.AlertType.ERROR);
			alert.setHeaderText(null);
			alert.setTitle("Error");
			alert.setContentText("No se ha seleccionado ninguna persona en la tabla");
			alert.showAndWait();
		}
	}
	@FXML
	private void salir (ActionEvent event) {
		Stage stage =(Stage) this.texto1.getScene().getWindow();
		stage.close();
	}
	@FXML 
	private void about(ActionEvent event) {
		Alert alert= new  Alert(Alert.AlertType.INFORMATION);
		alert.setHeaderText(null);
		alert.setTitle("About");
		alert.setContentText("No se que poner en esta fucionalidad, solamente comentar que los integrantes de este proyecto somos Juan, Zenón y Raúl");
		alert.showAndWait();
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
