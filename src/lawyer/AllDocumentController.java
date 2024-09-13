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
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class AllDocumentController implements Initializable {

    @FXML
    private ListView<?> caseNoListView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void openCaseFolderButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void creatNewCFolderButtonOnClick(MouseEvent event) {
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
