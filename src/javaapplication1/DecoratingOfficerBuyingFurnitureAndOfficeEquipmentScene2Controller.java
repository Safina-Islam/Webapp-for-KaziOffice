/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Fardin
 */
public class DecoratingOfficerBuyingFurnitureAndOfficeEquipmentScene2Controller implements Initializable {

    @FXML
    private TextArea descriptionTextArea;
    @FXML
    private TextField enterTheQuantityTextField;
    @FXML
    private TextField enterTheProductTextField;
    @FXML
    private TextField enterTheNameOfTheProductTextField;
    @FXML
    private TextField enterTheRoomNumberTextField;
    @FXML
    private TextField enterTheAmountTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void saveAndContinueButtonOnClick(ActionEvent event) {
    }
    
}
