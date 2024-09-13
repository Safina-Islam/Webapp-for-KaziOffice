/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class FeedBackListController implements Initializable {

    @FXML
    private TableView<?> FeedBackTableView;
    @FXML
    private TableColumn<?, ?> clientNameColumn;
    @FXML
    private TableColumn<?, ?> commentColumn;
    @FXML
    private TableColumn<?, ?> ratingColumn;
    @FXML
    private TextField replyCommentTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void commentReplyButtonOnclick(MouseEvent event) {
    }

    @FXML
    private void BackButtonOnclick(MouseEvent event) throws IOException {
        Parent PhotographerDashboardParent = FXMLLoader.load(getClass().getResource("PhotographerDashboard.fxml"));
        Scene PhotographerDashboard = new Scene(PhotographerDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(PhotographerDashboard);
        stage1.show(); 
    }

    @FXML
    private void sendCommentReplyButtonOnClick(MouseEvent event) {
    }
    
}
