/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class OurWorkViewController implements Initializable {

    @FXML
    private ImageView ourWorkImageView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void viewAllOurWorkButtonOnClick(MouseEvent event) {
             
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent PhotographerServiceParent = FXMLLoader.load(getClass().getResource("PhotographerService.fxml"));
        Scene PhotographerService = new Scene(PhotographerServiceParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(PhotographerService);
        stage1.show(); 
    }
    
}
