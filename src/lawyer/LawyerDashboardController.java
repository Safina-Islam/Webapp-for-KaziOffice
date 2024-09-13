/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawyer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class LawyerDashboardController implements Initializable {

    @FXML
    private Label lawyerNameLabel;
    @FXML
    private Label phoneNoLabel;
    @FXML
    private Label officeHourLabel;
    @FXML
    private Label emailLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clientButtonOnClick(MouseEvent event) throws IOException {
          Parent ClientListParent = FXMLLoader.load(getClass().getResource("ClientList.fxml"));
        Scene ClientList = new Scene(ClientListParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(ClientList);
        stage1.show();    
       
    }

    @FXML
    private void documentButtonOnClick(MouseEvent event) throws IOException {
         Parent AllDocumentParent = FXMLLoader.load(getClass().getResource("AllDocument.fxml"));
        Scene AllDocument = new Scene(AllDocumentParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(AllDocument);
        stage1.show(); 
    }

    @FXML
    private void notesButtonOnClick(MouseEvent event) throws IOException {
       Parent NotesParent = FXMLLoader.load(getClass().getResource("Notes.fxml"));
        Scene Notes = new Scene(NotesParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(Notes);
        stage1.show();   
    }

    @FXML
    private void paymentButtonOnClick(MouseEvent event) throws IOException {
         Parent PaymentSceneParent = FXMLLoader.load(getClass().getResource("PaymentScene.fxml"));
        Scene PaymentScene = new Scene(PaymentSceneParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(PaymentScene);
        stage1.show(); 
    }

    @FXML
  
    private void scheuleButtonOnClick(MouseEvent event) throws IOException {
         Parent ScheduleParent = FXMLLoader.load(getClass().getResource("Schedule.fxml"));
        Scene Schedule = new Scene(ScheduleParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(Schedule);
        stage1.show(); 
        
    }

    @FXML
    private void questionBoxButtonOnClick(MouseEvent event) throws IOException {
        Parent QuestionBoxSceneParent = FXMLLoader.load(getClass().getResource("QuestionBoxScene.fxml"));
        Scene QuestionBoxScene = new Scene(QuestionBoxSceneParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(QuestionBoxScene);
        stage1.show(); 
    }

    @FXML
    private void myBlogButtonOnClick(MouseEvent event) throws IOException {
        Parent myBlogSceneParent = FXMLLoader.load(getClass().getResource("myBlogScene.fxml"));
        Scene myBlogScene = new Scene(myBlogSceneParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(myBlogScene);
        stage1.show(); 
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
          Parent HomePageParent = FXMLLoader.load(getClass().getResource("/mainpkg/HomePage.fxml"));
        Scene HomePage = new Scene(HomePageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(HomePage);
        stage1.show(); 
    }

    
}
