/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawyer;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.Scanner;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class NotesController implements Initializable {

    @FXML
    private MenuItem openNoteMenuItem;
    @FXML
    private MenuItem createNewNoteMenuItem;
    @FXML
    private MenuItem editNoteMenuItem;
    @FXML
    private TextArea editContentTextArea;
    @FXML
    private Label viewNoteContentLable;
     
     private ArrayList<String> fileTypeList;
   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        fileTypeList = new ArrayList<String>();
        fileTypeList.add("*.txt");
        fileTypeList.add("*.doc");
        fileTypeList.add("*.docx");
        fileTypeList.add("*.TXT");
        fileTypeList.add("*.DOC");
        fileTypeList.add("*.DOCX");

       editContentTextArea.setEditable(false);
    }    

    @FXML
    private void openNoteMenuItemOnClick(ActionEvent event) {
        
         FileChooser fc = new FileChooser();
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Text files", fileTypeList));
        File f = fc.showOpenDialog(null);
        if(f != null){
            try {
                Scanner sc = new Scanner(f);
                String str="";
                while(sc.hasNextLine()){
                    str+=sc.nextLine()+"\n";
                }
                viewNoteContentLable.setText(str);
            } catch (FileNotFoundException ex) {
                
            }
        }
    }

    @FXML
    private void createNewNoteMenuItemOnClick(ActionEvent event) throws IOException {
        editContentTextArea.setEditable(true);
        
    }

    @FXML
    private void editNoteMenuItemOnCick(ActionEvent event) {
        
         editContentTextArea.setEditable(true);
            editContentTextArea.setText(viewNoteContentLable.getText());
    }

    @FXML
    private void saveYourNoteButtonOnClick(MouseEvent event) throws IOException {
         
        File f = null;
        FileWriter fw = null;
        FileChooser fc = null;
        fc = new FileChooser();
           f = fc.showSaveDialog(null);
            fw = new FileWriter(f+".txt");
              
            fw.write(
            editContentTextArea.getText()
            
            );
            fw.close();
                               
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
           Parent lawyerDashboardParent = FXMLLoader.load(getClass().getResource("lawyerDashboard.fxml"));
        Scene lawyerDashboard = new Scene(lawyerDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(lawyerDashboard);
        stage1.show(); 
    }
    
}
