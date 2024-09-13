/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class AccountantDashBoardController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ComboBox<String> paymentCombobox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        paymentCombobox.getItems().addAll("Kazi","Lawyer","Photographer");
    }    

    @FXML
    private void onClickMessenger(ActionEvent event) {
    }

    @FXML
    private void onEdirProfile(ActionEvent event) {
    }

    @FXML
    private void onClickCrecteREport(ActionEvent event) {
    }

    @FXML
    private void onClickBooking(ActionEvent event) {
    }

    @FXML
    private void backButtonOnClick(ActionEvent event) throws IOException {
          Parent HomePageParent = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene HomePage = new Scene(HomePageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(HomePage);
        stage1.show(); 
    }

    @FXML
    private void onClickTax(ActionEvent event) {
    }

    @FXML
    private void onClickRefund(ActionEvent event) {
    }

    @FXML
    private void paymentComboboxOnClick(MouseEvent event) throws IOException {
         if(  paymentCombobox.getValue().toString().equals("Lawyer") ) {
             
              Parent LawyerPaymentSceneParent = FXMLLoader.load(getClass().getResource("/lawyer/LawyerPaymentScene.fxml"));
        Scene LawyerPaymentScene = new Scene(LawyerPaymentSceneParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(LawyerPaymentScene);
        stage3.show();    
    }
         else if(paymentCombobox.getValue().toString().equals("Photographer") ){
          Parent PhotographerPaymentSceneParent = FXMLLoader.load(getClass().getResource("/photographer/PhotographerPaymentScene.fxml"));
        Scene PhotographerPaymentScene = new Scene(PhotographerPaymentSceneParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(PhotographerPaymentScene);
        stage3.show(); 
         
         }
    }
}