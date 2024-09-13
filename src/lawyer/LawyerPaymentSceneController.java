/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawyer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class LawyerPaymentSceneController implements Initializable {

    @FXML
    private TextField DueAmountTextField;
    @FXML
    private TextField casenoTextField;
    @FXML
    private TextField clientNameTextField;
    @FXML
    private TextField paidAmountTextField;
    @FXML
    private DatePicker dueDatePicker;

   private ArrayList<LawyerPayment> lpArr;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
           
              Parent AccountantDashBoardParent = FXMLLoader.load(getClass().getResource("/mainpkg/AccountantDashBoard.fxml"));
        Scene AccountantDashBoard = new Scene(AccountantDashBoardParent);
       
                Stage stage3 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
        stage3.setScene(AccountantDashBoard);
        stage3.show();  
    }

    @FXML
    private void sendButtonOnClick(MouseEvent event) {
         
         File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("LawyerPayment.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new lawyer .AppendableObjectOutputStream(fos);  
            }
            else{
                fos = new FileOutputStream(f);
                 oos = new ObjectOutputStream(fos);
            }
            
           
            
               LawyerPayment p = new LawyerPayment(
               
                       Integer.parseInt(casenoTextField.getText()), 
                       clientNameTextField.getText(),
                       Float.parseFloat(paidAmountTextField.getText()),
                       Float.parseFloat(DueAmountTextField.getText()),
                       dueDatePicker.getValue()
                   
            );
               
            oos.writeObject(p);
            
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
            Logger.getLogger(LawyerPaymentSceneController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(LawyerPaymentSceneController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
       casenoTextField.setText(null);
       clientNameTextField.setText(null);
       paidAmountTextField.setText(null);
       DueAmountTextField.setText(null);
        }  


    

  
      
         
          
         
        
    }
    
