/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Applicant;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class FrontPageFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void onClickLawyer(ActionEvent event) throws IOException {
        Parent MyLawyerParent = FXMLLoader.load(getClass().getResource("MyLawyer.fxml"));
        Scene MyLawyer = new Scene(MyLawyerParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(MyLawyer);
        stage1.show();  
    }

    @FXML
    private void onClickPhoto(ActionEvent event) throws IOException {
        Parent MyPhotographerParent = FXMLLoader.load(getClass().getResource("MyPhotographer.fxml"));
        Scene MyPhotographer = new Scene(MyPhotographerParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(MyPhotographer);
        stage1.show();   
    }

    @FXML
    private void onClickFees(ActionEvent event) {
    }

    @FXML
    private void onClickBack(ActionEvent event) {
    }
    
}
