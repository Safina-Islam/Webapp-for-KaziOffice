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
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class LogInSceneController implements Initializable {

    @FXML
    private TextField idTextField;
    @FXML
    private TextField passwordTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void signinButtonOnclick(MouseEvent event) throws IOException {
        
        String idStr;
        idStr = idTextField.getText();
        String pwStr =passwordTextField.getText();
       
        if( idStr.equals("lw1") && pwStr.equals("301") ){
            
        Parent lawyerDashboardParent = FXMLLoader.load(getClass().getResource("/lawyer/lawyerDashboard.fxml"));
        Scene lawyerDashboard = new Scene(lawyerDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(lawyerDashboard);
        stage1.show();    
       
        }
        
        else if ( idStr.equals("pg2") && pwStr.equals("402") ){
            Parent PhotographerDashboardParent = FXMLLoader.load(getClass().getResource("/photographer/PhotographerDashboard.fxml"));
        Scene PhotographerDashboard = new Scene(PhotographerDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(PhotographerDashboard);
        stage1.show();         
        }
         else if ( idStr.equals("ad3") && pwStr.equals("503") ){
            Parent AdmiDashboardParent = FXMLLoader.load(getClass().getResource("/mainpkg/AdmiDashboard.fxml"));
        Scene AdmiDashboard = new Scene(AdmiDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(AdmiDashboard);
        stage1.show();         
        }
         else if ( idStr.equals("ac4") && pwStr.equals("604") ){
            Parent AccountantDashBoardParent = FXMLLoader.load(getClass().getResource("/mainpkg/AccountantDashBoard.fxml"));
        Scene AccountantDashBoard = new Scene(AccountantDashBoardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(AccountantDashBoard);
        stage1.show();   }
         
         else if ( idStr.equals("ap1") && pwStr.equals("101") ){
            Parent FrontPageFXMLParent = FXMLLoader.load(getClass().getResource("/Applicant/FrontPageFXML.fxml"));
        Scene FrontPageFXML = new Scene(FrontPageFXMLParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(FrontPageFXML);
        stage1.show();   }
             
        
         
         
        else{
            Alert a2 = new Alert(Alert.AlertType.ERROR);
            a2.setTitle("Login Status");
            a2.setContentText("Oops! Login Failed...");
            a2.setHeaderText(null);
            a2.showAndWait();           
        }           
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
