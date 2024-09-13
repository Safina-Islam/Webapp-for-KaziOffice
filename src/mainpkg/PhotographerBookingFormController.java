/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class PhotographerBookingFormController implements Initializable {

    @FXML
    private Label addressTextfield;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField eventAddressTextField;
    @FXML
    private TextField phoneNoTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private DatePicker dOEDatepicker;
    @FXML
    private ComboBox<String> eventTypeComboBox;
    @FXML
    private TextField eventStartTimeTextField;
    @FXML
    private TextArea specialRequermentTextArea;
    @FXML
    private ComboBox<String> packageChooseComboBox;
    
    private ArrayList<PhotographerApplicant> paArr;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        eventTypeComboBox.getItems().addAll("Haldi","Wedding", "Reciption");
        packageChooseComboBox.getItems().addAll("Basic","Standard", "Premium");
        
        
    }    

    @FXML
    private void submitPhotographerBookingFormButtonOnClick(MouseEvent event) {
         
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("PhotoApplicant.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new AppendableObjectOutputStream(fos);  
            }
            else{
                fos = new FileOutputStream(f);
                 oos = new ObjectOutputStream(fos);
            }
            
           
            
               PhotographerApplicant a = new PhotographerApplicant(
               
                       
                        nameTextField.getText(),
                        dOEDatepicker.getValue(),
                        eventAddressTextField.getText(),
                        phoneNoTextField.getText(),
                        emailTextField.getText(),
                        eventTypeComboBox.getValue().toString(),
                        eventStartTimeTextField.getText(),
                        packageChooseComboBox.getValue().toString(),
                        specialRequermentTextArea.getText()
                      
                   
            );
               
            oos.writeObject(a);
            
          /*Alert alrt = new Alert(Alert.AlertType.WARNING);
        alrt.setTitle("Warning Alert");
        alrt.setContentText(a.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
           
        try{
            oos.writeObject(a);
        }
        catch(IOException e){
         alrt.setTitle("IO Alert");
        alrt.setContentText(e.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
        }*/
           

        } catch (IOException ex) {
            Logger.getLogger(PhotographerBookingFormController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(PhotographerBookingFormController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
        
          Alert a = new Alert(Alert.AlertType.INFORMATION);
        a.setTitle("Information Alert");
        a.setHeaderText(null);
        a.setContentText("Information has been submitted successfully");
        a.showAndWait();    
         
        
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
