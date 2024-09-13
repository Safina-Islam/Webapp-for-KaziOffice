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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class LawyerPanelController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void lawyerDetailOnClick(MouseEvent event) throws IOException {
         Parent lawyerDetailSceneParent = FXMLLoader.load(getClass().getResource("lawyerDetailScene.fxml"));
        Scene lawyerDetailScene = new Scene(lawyerDetailSceneParent);
       
               
        Stage stage2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage2.setScene(lawyerDetailScene);
        stage2.show();
        
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
