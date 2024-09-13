/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class AdmiDashboardController implements Initializable {

    @FXML
    private ComboBox<String> ApplicantComboBox;
    @FXML
    private TextArea applicantViewTextArea;

   
   
    public void initialize(URL url, ResourceBundle rb) {
         ApplicantComboBox.getItems().addAll("Marriage Applicant","Divorce Applicant",
                                            "Kazi Applicant","Law Applicant","Photographer Applicant");
        
    }    

    @FXML
    private void applicantComboboxButtonOnClick(MouseEvent event ) throws IOException {
        
         if(   ApplicantComboBox.getValue().toString().equals("Law Applicant") ) {
            
           
             applicantViewTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("LawApplicant.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
          LawApplicant a;
            try{
                applicantViewTextArea.setText("");
                while(true){
                    a = (LawApplicant)ois.readObject();
                    applicantViewTextArea.appendText(a.toString());
                }
            }
            catch(Exception e){
               
            }    
            applicantViewTextArea.appendText("All Law Applicants are Here\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }             
      
          
     
    }
          else if (   ApplicantComboBox.getValue().toString().equals("Photographer Applicant") ) {
              
             applicantViewTextArea.setText("");
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("PhotoApplicant.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
          PhotographerApplicant p;
            try{
                applicantViewTextArea.setText("");
                while(true){
                    p = (PhotographerApplicant)ois.readObject();
                    applicantViewTextArea.appendText(p.toString());
                }
            }
            catch(Exception e){
               
            }    
            applicantViewTextArea.appendText("All Photo Applicants are Here\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }               
              
    }
        
    }

    @FXML
    private void bookingConfirmationButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void backToHomeButtonOnClick(ActionEvent event) throws IOException {
        
        Parent HomePageParent = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene HomePage = new Scene(HomePageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(HomePage);
        stage1.show(); 
    }
    
}
