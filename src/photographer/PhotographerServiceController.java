/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import java.io.File;
import java.io.FileNotFoundException;
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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class PhotographerServiceController implements Initializable {

    @FXML
    private TextArea outputTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void ourWorksButtonOnClick(MouseEvent event) throws IOException {
        Parent OurWorkViewParent = FXMLLoader.load(getClass().getResource("OurWorkView.fxml"));
        Scene OurWorkView = new Scene(OurWorkViewParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(OurWorkView);
        stage1.show(); 
    }


    @FXML
    private void feedBackButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void fAQButtonOnClick(MouseEvent event) {
        File file = new File("FAQ.txt");
        Scanner sc; String str=null;
        try {
            sc = new Scanner(file);
            outputTextArea.setText(null);
            while(sc.hasNextLine()){
                str=sc.nextLine();
                outputTextArea.appendText(str+"\n");
                              
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FAQSceneController.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
          Parent HomePageParent = FXMLLoader.load(getClass().getResource("/mainpkg/HomePage.fxml"));
        Scene HomePage = new Scene(HomePageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(HomePage);
        stage1.show(); 
    }

    @FXML
    private void clientPackageButtonOnClick(MouseEvent event) throws IOException {
         Parent ClientViewPackageParent = FXMLLoader.load(getClass().getResource("ClientViewPackage.fxml"));
        Scene ClientViewPackage = new Scene(ClientViewPackageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(ClientViewPackage);
        stage1.show(); 
    }
    
}
