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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author Fardin
 */
public class DecoratingOfficerDecoratingOfTheVenueAsPerScheduledMarriageTicketScene2Controller implements Initializable {

    @FXML
    private TableView<?> ticketTableView;
    @FXML
    private TableColumn<?, ?> ticketNumberView;
    @FXML
    private TableColumn<?, ?> ticketIssuedDateView;
    @FXML
    private TableColumn<?, ?> statusView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void continueButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void approvedButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void disapprovedButtonOnClick(ActionEvent event) {
    }
    
}
