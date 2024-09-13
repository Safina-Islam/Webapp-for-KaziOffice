/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawyer;

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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
;


/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class ScheduleController implements Initializable {

    @FXML
    private DatePicker scheduleDatepicker;
    @FXML
    private TextArea viewScheduleTextArea;
    @FXML
    private TextArea createScheduleTextArea;

    private ArrayList<LawSchedule> lsArr;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void createScheduleButtonOnClick(MouseEvent event) {
        
        File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("LawSchedule.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new lawyer.AppendableObjectOutputStream(fos); 
            }
            else{
                fos = new FileOutputStream(f);
                 oos = new ObjectOutputStream(fos);
            }
            
            
            
               LawSchedule l = new LawSchedule(
                
               
                   scheduleDatepicker.getValue(),
                    createScheduleTextArea.getText()     
            );
               
            oos.writeObject(l);
            
         /*  Alert alrt = new Alert(Alert.AlertType.WARNING);
        alrt.setTitle("Warning Alert");
        alrt.setContentText(l.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
           
        try{
            oos.writeObject(l);
        }
        catch(IOException e){
         alrt.setTitle("IO Alert");
        alrt.setContentText(e.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
        }*/
           

        } catch (IOException ex) {
            Logger.getLogger(ScheduleController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(ScheduleController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
        
    }
    @FXML
     private void viewScheduleButtonOnClick(MouseEvent event) throws IOException  {
                LocalDate testDate =  scheduleDatepicker.getValue();
        File f = null;
        FileInputStream fis = null;      
        ObjectInputStream ois = null;
        
        try {
            f = new File("LawSchedule.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
           LawSchedule s;
            try{
                  testDate =  scheduleDatepicker.getValue();
                while(true){
                    s = (LawSchedule)ois.readObject();
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
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent lawyerDashboardParent = FXMLLoader.load(getClass().getResource("lawyerDashboard.fxml"));
        Scene lawyerDashboard = new Scene(lawyerDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(lawyerDashboard);
        stage1.show(); 
    }

    @FXML
    private void scheduleDatepickerOnClick(MouseEvent event) {
        viewScheduleTextArea.setText(null);
        createScheduleTextArea.setText(null);
    }
    
}
