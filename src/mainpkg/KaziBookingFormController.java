/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class KaziBookingFormController implements Initializable {

    @FXML
    private Label addressTextfield;
    @FXML
    private TextField brideNameTextField;
    @FXML
    private TextField bfatherNameTextfield;
    @FXML
    private TextField bmotherNameTextfield;
    @FXML
    private TextField bAddressTextField;
    @FXML
    private DatePicker bDobDatepicker;
    @FXML
    private TextField gNameTextField;
    @FXML
    private TextField gfatherNameTextField;
    @FXML
    private TextField gMotherNameTextField;
    @FXML
    private DatePicker gDobDatePicker;
    @FXML
    private TextField gAddressTextField1;
    @FXML
    private DatePicker marriageDateDatepicker1;
    @FXML
    private TextField eventLocationTextField;
    @FXML
    private TextField timeTextField;
    @FXML
    private TextField contactnoTextField;
    @FXML
    private TextField denmohorTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void submitlKaziBookingFormButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent HomePageParent = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene HomePage = new Scene(HomePageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(HomePage);
        stage1.show(); 
    }
    
}
