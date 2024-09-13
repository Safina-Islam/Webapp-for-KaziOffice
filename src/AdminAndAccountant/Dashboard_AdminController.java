

 package AdminAndAccountant;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import mainpkg.LawApplicant;

/**
 * FXML Controller class
 *
 * @author Asif
 */
public class Dashboard_AdminController implements Initializable {

    @FXML
    private Label label;
    @FXML
    private ComboBox<String> ApplicantComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
         ApplicantComboBox.getItems().addAll("Marriage Applicant","Divorce Applicant","Kazi Applicant","Law Applicant","Photographer Applicant");
    }    

    @FXML
    private void onClickLogout(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Login_Screen.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void onClickCrecteREport(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Report.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void onClickMessenger(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Messenger.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void onClickTax(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Tax.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void onClickRefund(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Refund.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void onClickPayment(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("Payment.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void onClickBooking(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("BookingList.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    private void onEdirProfile(ActionEvent event) throws IOException {
        Parent mainSceneParent = FXMLLoader.load(getClass().getResource("EditProfile.fxml"));
        Scene scene1 = new Scene(mainSceneParent);
        Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        
        window.setScene(scene1);
        window.show();
    }

    @FXML
    private void applicantComboboxButtonOnClick(MouseEvent event) throws IOException {
        
        
        if(   ApplicantComboBox.getValue().toString().equals("Law Applicant") ) {
        
            Parent LawApplicantViewParent = FXMLLoader.load(getClass().getResource("/mainpkg/LawApplicantView.fxml"));
        Scene LawApplicantView = new Scene(LawApplicantViewParent);
       
        Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(LawApplicantView);
        stage3.show();  
            
   
      
    }
          else if (   ApplicantComboBox.getValue().toString().equals("Photographer Applicant") ) {
             
              Parent PhotogApplicantViewParent = FXMLLoader.load(getClass().getResource("/mainpkg/PhotogApplicantView.fxml"));
        Scene PhotogApplicantView = new Scene(PhotogApplicantViewParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(PhotogApplicantView);
        stage3.show();        
    }
    }
    
}
