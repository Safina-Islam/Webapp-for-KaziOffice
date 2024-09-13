/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.time.LocalDate;
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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lawyer.LawSchedule;



/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class PhotographerScheduleController implements Initializable {

    @FXML
    private DatePicker scheduleDatepicker;
    @FXML
    private TextArea viewScheduleTextArea;
    @FXML
    private TextField serialNoTextField;
    @FXML
    private TextField clientNameTextField;
    @FXML
    private TextField eventTypeTextField;
    @FXML
    private TextField eventLocatonTextField;
    @FXML
    private TextField startingTimeTextField;
    
    private ArrayList<PhotographerSchedule> psArr;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewScheduleButtonOnClick(MouseEvent event) {
          LocalDate testDate =  scheduleDatepicker.getValue();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("PhotographerSchedule.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
           PhotographerSchedule s;
            try{
                  testDate =  scheduleDatepicker.getValue();
                while(true){
                    s = (PhotographerSchedule)ois.readObject();
                     if(s.getTaskDate().compareTo(testDate)==0){
                     viewScheduleTextArea.appendText(s.toString());
                     
                }
                    
            }
            }
            catch(Exception e){
               
            }    
            viewScheduleTextArea.appendText("There is  all your schedule\n");            
        } catch (IOException ex) { } 
        finally {
            try {
                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }             
    }

    @FXML
    private void createScheduleButtonOnClick(MouseEvent event) {
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("PhotographerSchedule.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new photographer.AppendableObjectOutputStream(fos); 
            }
            else{
                fos = new FileOutputStream(f);
                 oos = new ObjectOutputStream(fos);
            }
            
            
            
               PhotographerSchedule p = new PhotographerSchedule(
                
               
                   scheduleDatepicker.getValue(),
                     Integer.parseInt(serialNoTextField.getText()),
                       clientNameTextField.getText(),
                       eventTypeTextField.getText(),
                       eventLocatonTextField.getText(),
                       startingTimeTextField.getText()
                       
                       
            );
               
            oos.writeObject(p);
            
           /*Alert alrt = new Alert(Alert.AlertType.WARNING);
        alrt.setTitle("Warning Alert");
        alrt.setContentText(p.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
           
        try{
            oos.writeObject(p);
        }
        catch(IOException e){
         alrt.setTitle("IO Alert");
        alrt.setContentText(e.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
        }*/
           

        } catch (IOException ex) {
            Logger.getLogger(PhotographerScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(PhotographerScheduleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent PhotographerDashboardParent = FXMLLoader.load(getClass().getResource("PhotographerDashboard.fxml"));
        Scene PhotographerDashboard = new Scene(PhotographerDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(PhotographerDashboard);
        stage1.show(); 
    }

    @FXML
    private void scheduleDatePickerButtonOnClick(MouseEvent event) {
        viewScheduleTextArea.setText(null);
        serialNoTextField.setText(null);
        clientNameTextField.setText(null);
        eventTypeTextField.setText(null);
        eventLocatonTextField.setText(null);
        startingTimeTextField.setText(null);
    }
    
}
