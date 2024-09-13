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
import mainpkg.PhotographerApplicant;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class PhotoClientListController implements Initializable {

    @FXML
    private TableView<PhotographerApplicant> tableView;
    @FXML
    private TableColumn<PhotographerApplicant, String> clientNammeColumn;
    @FXML
    private TableColumn<PhotographerApplicant, String> phoneNoColumn;
    @FXML
    private TableColumn<PhotographerApplicant, String> emailColumn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        clientNammeColumn.setCellValueFactory(new PropertyValueFactory<PhotographerApplicant,String>("name"));
        phoneNoColumn.setCellValueFactory(new PropertyValueFactory<PhotographerApplicant,String>("phoneNo"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<PhotographerApplicant,String>("email"));
    }    

    @FXML
    private void viewClientDetailsButtonOnClick(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("photoClientDetails.fxml"));
        Parent photoClientDetailsParent = loader.load();

        //Parent personViewParent = FXMLLoader.load(getClass().getResource("FXMLScene2.fxml"));
        Scene photoClientDetails = new Scene(photoClientDetailsParent);
        
        //access the controller
        PhotoClientDetailsController controller = loader.getController();
        //controller = new PersonViewSceneController();
        controller.getDetail(tableView.getSelectionModel().getSelectedItem());
                
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(photoClientDetails);
        window.show();
        
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
    private void viewAllClientButtonOnClick(MouseEvent event) {
         ObjectInputStream ois=null;
         try {
            PhotographerApplicant p;
            ois = new ObjectInputStream(new FileInputStream("PhotoApplicant.bin"));
            p = (PhotographerApplicant) ois.readObject();
            
            tableView.getItems().add(p);
            p = (PhotographerApplicant) ois.readObject(); tableView.getItems().add(p);            
            
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
