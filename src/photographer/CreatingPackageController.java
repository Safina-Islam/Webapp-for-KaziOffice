/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;

import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class CreatingPackageController implements Initializable {

    @FXML
    private TableColumn<PhotoPackage , String> packageNameColumn;
    @FXML
    private TableColumn<PhotoPackage , String> servicedurationColumn;
    @FXML
    private TableColumn<PhotoPackage , String> NoOfPhotographerColumn;
    @FXML
    private TableColumn<PhotoPackage , String> albumnColumn;
    @FXML
    private TableColumn<PhotoPackage , String> chargeColumn;
    @FXML
    private TextField packageNameTextField;
    @FXML
    private TextField serviceDurationTextField;
    @FXML
    private TextField noOfPhotographerTextField;
    @FXML
    private TextField albumTextField;
    @FXML
    private TextField chargeTextField;
    @FXML
    private TableView<PhotoPackage > packageTableView;

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
    private void addNewPackageButtonOnClick(MouseEvent event) {
       File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("PhotoPackage.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new photographer .AppendableObjectOutputStream(fos);  
            }
            else{
                fos = new FileOutputStream(f);
                 oos = new ObjectOutputStream(fos);
            }
            
           
            
               PhotoPackage g = new PhotoPackage(
                                       packageNameTextField.getText(),
                                       serviceDurationTextField.getText(),
                                      Integer.parseInt(noOfPhotographerTextField.getText()),
                                      Integer.parseInt(albumTextField.getText()),
                                      Float.parseFloat(chargeTextField.getText())
                                       
                                    
                   
            );
               
            oos.writeObject(g);
            
         /* Alert alrt = new Alert(Alert.AlertType.WARNING);
        alrt.setTitle("Warning Alert");
        alrt.setContentText(p.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
           
        try{
            oos.writeObject(p);
        }
        catch(IOException e){
         alrt.setTitle("IO Alert");
        alrt.setContentText(e.toString());
        alrt.setHeaderText(null);
        alrt.showAndWait();
        }*/
           

        } catch (IOException ex) {
            Logger.getLogger(PhotographerPaymentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(PhotographerPaymentSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
       packageNameTextField.setText(null);
       serviceDurationTextField.setText(null);
       noOfPhotographerTextField.setText(null);
       albumTextField.setText(null);
       chargeTextField.setText(null);
       
    }
    
    
    @FXML
    private void deletePackageButtonOnClick(MouseEvent event) {
         ObservableList<PhotoPackage> selectedRows, allPackage;
        allPackage = packageTableView.getItems();
        selectedRows = packageTableView.getSelectionModel().getSelectedItems();
        
        for(PhotoPackage pk: selectedRows){
            allPackage.remove(pk);
        }
       
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
    private void viewPackagesButtonOnClick(MouseEvent event) {
         ObjectInputStream ois=null;
         try {
            PhotoPackage p;
            ois = new ObjectInputStream(new FileInputStream("PhotoPackage.bin"));
            p = (PhotoPackage) ois.readObject();
            
            packageTableView.getItems().add(p);
            p = (PhotoPackage) ois.readObject(); packageTableView.getItems().add(p);            
            
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