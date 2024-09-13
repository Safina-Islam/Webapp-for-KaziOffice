/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class FAQSceneController implements Initializable {

    @FXML
    private TextArea fAQTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fAQTextArea.setEditable(false);
    }    

    @FXML
    private void editFaQButtonOnClick(MouseEvent event) {
         fAQTextArea.setEditable(true);
    }

    @FXML
    private void saveFaQButtonOnClick(MouseEvent event) throws IOException {
       
                //write code to dump studArr in Stud.txt
                //use FileWriter
                File f = new File("FAQ.txt");
                FileWriter fw;
               
                
                    fw = new FileWriter(f);
                    //fw = new FileWriter("studText.txt");
                
                    //str += s; 
                    //if toString is overridden to return
                    //return id+","+name+","+cgpa+"\n"
                
                fw.write(
                 fAQTextArea.getText()
                );  //fw.write(s.toString());
                fw.close();
            
                
                //SHOW ex.toString() IN AN ALERT
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
    private void viewFAQButtonOnClick(MouseEvent event) {
      File file = new File("FAQ.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            fAQTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                fAQTextArea.appendText(str+"\n");
                              
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FAQSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }   
      
        }
    
    
}
