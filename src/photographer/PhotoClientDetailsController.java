
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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import mainpkg.PhotographerApplicant;


public class PhotoClientDetailsController implements Initializable {

    @FXML
    private Label phoclientNameLabel;

    private PhotographerApplicant selectedPhotographerApplicant;
    @FXML
    private Label phoneNoLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label eventDateLabel;
    @FXML
    private Label eventTypeLable;
    @FXML
    private Label eventAddressLabel;
    @FXML
    private Label startingTimeLable;
    @FXML
    private Label packageLabel;
    @FXML
    private TextArea requermentsTextArea;
    
   
    public void getDetail(PhotographerApplicant p){
        selectedPhotographerApplicant = p;
         phoclientNameLabel.setText(selectedPhotographerApplicant.getName());
        phoneNoLabel.setText(selectedPhotographerApplicant.getPhoneNo());
        emailLabel.setText(selectedPhotographerApplicant.getEmail());
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    


    @FXML
    private void eventDetailButtonOnClick(MouseEvent event) {
         eventDateLabel.setText("Event Date: "+selectedPhotographerApplicant.getEventDate().toString());
        eventAddressLabel.setText("Event Address: "+selectedPhotographerApplicant.getEventAddress());
        eventTypeLable.setText("Event Type: "+selectedPhotographerApplicant.getEventType());
         startingTimeLable.setText("Stating Time: "+selectedPhotographerApplicant.getStartingTime());
    }

    @FXML
    private void packageAndRequermentButtonOnClick(MouseEvent event) {
        packageLabel.setText("Package: "+selectedPhotographerApplicant.getChoosenPackage());
        requermentsTextArea.setText("Requerments: \n"+selectedPhotographerApplicant.getSpecialRequerments());
    }

    @FXML
    private void potoButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent photoClientListParent = FXMLLoader.load(getClass().getResource("photoClientList.fxml"));
        Scene photoClientList = new Scene(photoClientListParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(photoClientList);
        stage1.show(); 
    }
    
}
