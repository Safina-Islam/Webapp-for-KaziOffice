/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawyer;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import mainpkg.LawApplicant;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class ClientListController implements Initializable {

    @FXML
    private TableColumn<LawApplicant, String> clientNameColumn;
    @FXML
    private TableColumn<LawApplicant, String> phoneNoColumn;
    @FXML
    private TableColumn<LawApplicant, String> emailColumn;
    @FXML
    private TableView<LawApplicant> lawCllienttableView;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clientNameColumn.setCellValueFactory(new PropertyValueFactory<LawApplicant,String>("name"));
        phoneNoColumn.setCellValueFactory(new PropertyValueFactory<LawApplicant,String>("phoneNo"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<LawApplicant,String>("email"));
    }    

    @FXML
    private void viewClientDetailsButtonOnClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("ClientDetail.fxml"));
        Parent ClientDetailParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene ClientDetail = new Scene(ClientDetailParent);
        
        //access the controller
        ClientDetailController controller = loader.getController();
        //controller = new PersonViewSceneController();
        controller.clientDetail(lawCllienttableView.getSelectionModel().getSelectedItem());
                
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(ClientDetail);
        window.show();
        
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
    private void viewClientListButtonOnClick(MouseEvent event) {
        ObjectInputStream ois=null;
         try {
            LawApplicant l;
            ois = new ObjectInputStream(new FileInputStream("LawApplicant.bin"));
            l = (LawApplicant) ois.readObject();
            
            lawCllienttableView.getItems().add(l);
            l = (LawApplicant) ois.readObject(); lawCllienttableView.getItems().add(l);            
            
        } catch (Exception ex) {
            try {
                if(ois!=null)
                    ois.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
            ex.printStackTrace();
    }
    }
    
}
