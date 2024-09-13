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
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import mainpkg.LawApplicant;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class ClientDetailController implements Initializable {

    @FXML
    private TextArea problemTextArea;
    @FXML
    private Label nameLable;
    @FXML
    private Label dobLable;
    @FXML
    private Label addressLabel;
    @FXML
    private Label phoneNoLabel;
    @FXML
    private Label emailLabel;
    @FXML
    private Label occupationLabel;
    @FXML
    private Label marritualStatusLabel;
    @FXML
    private Label spouseNameLabel;
    @FXML
    private Label spouseOccupationLabel;
    
     private LawApplicant selectedLawApplicant;

    public void clientDetail(LawApplicant p){
        selectedLawApplicant = p;
         }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void personalInfoButtonOnClick(MouseEvent event) {
        nameLable.setText("Name: "+selectedLawApplicant.getName());
         dobLable.setText("BirthDate: "+selectedLawApplicant.getDob().toString());
         addressLabel.setText("Address: "+selectedLawApplicant.getAddress());
        phoneNoLabel.setText("PhoneNo: "+selectedLawApplicant.getPhoneNo());
        emailLabel.setText("Email: "+selectedLawApplicant.getEmail());
        occupationLabel.setText("Occupation: "+selectedLawApplicant.getOccupation());
        marritualStatusLabel.setText("M.Status: "+selectedLawApplicant.getMariStatus());
        spouseNameLabel.setText("SpouseName: "+selectedLawApplicant.getSpouseName());
        spouseOccupationLabel.setText("S.Occupation: "+selectedLawApplicant.getSpouseOccupation());
    }

    @FXML
    private void problemOrComplainButtonOnClick(MouseEvent event) {
        problemTextArea.setText("Issues: \n"+selectedLawApplicant.getIssue());
    }

    @FXML
    private void submittedDocumentButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void caseStatusButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent ClientListParent = FXMLLoader.load(getClass().getResource("ClientList.fxml"));
        Scene ClientList = new Scene(ClientListParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(ClientList);
        stage1.show(); 
    }
    
}
