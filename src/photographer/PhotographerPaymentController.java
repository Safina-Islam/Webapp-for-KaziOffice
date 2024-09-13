
package photographer;

import java.io.File;
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

import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import lawyer.LawyerPayment;

/**
 * FXML Controller class
 *
 * @author WIN 10
 */
public class PhotographerPaymentController implements Initializable {

    @FXML
    private TableView<PhotographerPayment> photogPaymentTableView;
    @FXML
    private TableColumn<PhotographerPayment, String> serialNoColumn;
    @FXML
    private TableColumn<PhotographerPayment, String> clientNameColumn;
    @FXML
    private TableColumn<PhotographerPayment, String> packageColumn;
    @FXML
    private TableColumn<PhotographerPayment, String> paidAmountColumn;
    @FXML
    private TableColumn<PhotographerPayment, String> DueAmountColumn;
    @FXML
    private TableColumn<PhotographerPayment, String> dueDateColumn;

    

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        serialNoColumn.setCellValueFactory(new PropertyValueFactory<PhotographerPayment,String>("serialNo"));
        clientNameColumn.setCellValueFactory(new PropertyValueFactory<PhotographerPayment,String>("clientName"));
        packageColumn.setCellValueFactory(new PropertyValueFactory<PhotographerPayment,String>("packege"));
        paidAmountColumn.setCellValueFactory(new PropertyValueFactory<PhotographerPayment,String>("paidAmount"));
        DueAmountColumn.setCellValueFactory(new PropertyValueFactory<PhotographerPayment,String>("dueAmount"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<PhotographerPayment,String>("dueDate"));
       
    }    

    @FXML
    private void viewBillButtonOnClick(MouseEvent event) {
          ObjectInputStream ois=null;
         try {
            PhotographerPayment p;
            ois = new ObjectInputStream(new FileInputStream("PhotographerPayment.bin"));
            p = (PhotographerPayment) ois.readObject();
            
            photogPaymentTableView.getItems().add(p);
            p = (PhotographerPayment) ois.readObject(); photogPaymentTableView.getItems().add(p);            
            
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
    private void BackButtonOnClick(MouseEvent event) throws IOException {
        Parent PhotographerDashboardParent = FXMLLoader.load(getClass().getResource("PhotographerDashboard.fxml"));
        Scene PhotographerDashboard = new Scene(PhotographerDashboardParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(PhotographerDashboard);
        stage1.show(); 
    }
    
}
