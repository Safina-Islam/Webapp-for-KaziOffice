/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

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

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class ClientViewPackageController implements Initializable {

    @FXML
    private TableView<PhotoPackage> clietPackageTableView;
    @FXML
    private TableColumn<PhotoPackage, String> packageNameColumn;
    @FXML
    private TableColumn<PhotoPackage, String> servicedurationColumn;
    @FXML
    private TableColumn<PhotoPackage, String> NoOfPhotographerColumn;
    @FXML
    private TableColumn<PhotoPackage, String> albumnColumn;
    @FXML
    private TableColumn<PhotoPackage, String> chargeColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        packageNameColumn.setCellValueFactory(new PropertyValueFactory<PhotoPackage,String>("packageName"));
        servicedurationColumn.setCellValueFactory(new PropertyValueFactory<PhotoPackage,String>("serviceDuration"));
        NoOfPhotographerColumn.setCellValueFactory(new PropertyValueFactory<PhotoPackage,String>("noOfPhotographer"));
        albumnColumn.setCellValueFactory(new PropertyValueFactory<PhotoPackage,String>("album"));
        chargeColumn.setCellValueFactory(new PropertyValueFactory<PhotoPackage,String>("charge"));
    }    

    @FXML
    private void viewAllPackagesButtonOnClick(MouseEvent event) {
         ObjectInputStream ois=null;
         try {
            PhotoPackage p;
            ois = new ObjectInputStream(new FileInputStream("PhotoPackage.bin"));
            p = (PhotoPackage) ois.readObject();
            
            clietPackageTableView.getItems().add(p);
            p = (PhotoPackage) ois.readObject(); clietPackageTableView.getItems().add(p);            
            
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


    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
         Parent PhotographerServiceParent = FXMLLoader.load(getClass().getResource("PhotographerService.fxml"));
        Scene PhotographerService = new Scene(PhotographerServiceParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(PhotographerService);
        stage1.show(); 
    }
    
}
