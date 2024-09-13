
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;


public class HomePageController implements Initializable {

    @FXML
    private ComboBox<String> registrationCmboBox;
    @FXML
    private ComboBox<String> BookingComboBox;
    @FXML
    private ComboBox<String> certificateComboBox;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BookingComboBox.getItems().addAll("Kazi","Lawyer","Photographer");
        registrationCmboBox.getItems().addAll("Marriage","Divorce");
        certificateComboBox.getItems().addAll("Marriage Certificate","Divorce Certificate");
        
             
    }    


    @FXML
    private void lawyerPanelButtonOnClick(MouseEvent event) throws IOException {
        
        Parent LawyerPanelParent = FXMLLoader.load(getClass().getResource("/lawyer/LawyerPanel.fxml"));
        Scene LawyerPanel = new Scene(LawyerPanelParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage1.setScene(LawyerPanel);
        stage1.show();    
    }

    @FXML
    private void loginButtonOnClick(MouseEvent event)throws IOException {
        Parent LogInSceneParent = FXMLLoader.load(getClass().getResource("logInScene.fxml"));
        Scene LogInScene = new Scene(LogInSceneParent);
       
               
        Stage stage2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage2.setScene(LogInScene);
        stage2.show();
    }

    @FXML
    private void contactButtonOnClick(MouseEvent event)throws IOException {
         Parent ContactSceneParent = FXMLLoader.load(getClass().getResource("ContactScene.fxml"));
        Scene ContactScene = new Scene(ContactSceneParent);
       
               
        Stage stage2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage2.setScene(ContactScene);
        stage2.show();
    }

    @FXML
    private void registrationButtonOnClick(MouseEvent event) throws IOException {
           if( registrationCmboBox.getValue().toString().equals("Marriage") ) {
             
              Parent MarriageregistrationParent = FXMLLoader.load(getClass().getResource("/Applicant/Marriage registration.fxml"));
        Scene Marriageregistration = new Scene(MarriageregistrationParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(Marriageregistration);
        stage3.show();        
    }
          else if (  registrationCmboBox.getValue().toString().equals("Divorce") ) {
             
              Parent divorceresistrationParent = FXMLLoader.load(getClass().getResource("/Applicant/divorce resistration.fxml"));
        Scene divorceresistration = new Scene(divorceresistrationParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(divorceresistration);
        stage3.show();        
    }
    }

    @FXML
    private void bookingButtonOnClick(MouseEvent event)throws IOException {
          if(  BookingComboBox.getValue().toString().equals("Lawyer") ) {
             
              Parent lawyerBookingFormParent = FXMLLoader.load(getClass().getResource("lawyerBookingForm.fxml"));
        Scene lawyerBookingForm = new Scene(lawyerBookingFormParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(lawyerBookingForm);
        stage3.show();        
    }
          else if (  BookingComboBox.getValue().toString().equals("Photographer") ) {
             
              Parent photographerBookingFormParent = FXMLLoader.load(getClass().getResource("photographerBookingForm.fxml"));
        Scene photographerBookingForm = new Scene(photographerBookingFormParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(photographerBookingForm);
        stage3.show();        
    }
          
          else if (  BookingComboBox.getValue().toString().equals("Kazi") ) {
             
              Parent KaziBookingFormParent = FXMLLoader.load(getClass().getResource("KaziBookingForm.fxml"));
        Scene KaziBookingForm = new Scene(KaziBookingFormParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(KaziBookingForm);
        stage3.show();        
    }
    } 

    @FXML
    private void photographerButtonOnClick(MouseEvent event) throws IOException {
         Parent PhotographerServiceParent = FXMLLoader.load(getClass().getResource("/photographer/PhotographerService.fxml"));
        Scene PhotographerService = new Scene(PhotographerServiceParent);
       
               
        Stage stage2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage2.setScene(PhotographerService);
        stage2.show();
    }

    @FXML
    private void certificateComboBoxButtonOnClick(MouseEvent event) throws IOException {
        if(  certificateComboBox.getValue().toString().equals("Marriage Certificate") ) {
             
              Parent MarriageCertificateFXMLParent = FXMLLoader.load(getClass().getResource("/Applicant/Marriage CertificateFXML.fxml"));
        Scene MarriageCertificateFXML = new Scene(MarriageCertificateFXMLParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(MarriageCertificateFXML);
        stage3.show();        
    }
          else if (  certificateComboBox.getValue().toString().equals("Divorce Certificate") ) {
             
              Parent DivorceCertificateParent = FXMLLoader.load(getClass().getResource("/Applicant/DivorceCertificate.fxml"));
        Scene DivorceCertificate = new Scene(DivorceCertificateParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(DivorceCertificate);
        stage3.show();        
    }
        
    }
}
