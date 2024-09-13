
package lawyer;

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
import mainpkg.LawApplicant;


public class PaymentSceneController implements Initializable {

    @FXML
    private TableColumn<LawyerPayment, String> caseNoColumn;
    @FXML
    private TableColumn<LawyerPayment, String> clientNameColumn;
    @FXML
    private TableColumn<LawyerPayment, String> paidAmountColumn;
    @FXML
    private TableColumn<LawyerPayment, String> dueAmountColumn;
    @FXML
    private TableColumn<LawyerPayment, String> dueDateColumn;
    @FXML
    private TableView<LawyerPayment> lawPaymentTableView;

    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       caseNoColumn.setCellValueFactory(new PropertyValueFactory<LawyerPayment,String>("caseNo"));
        clientNameColumn.setCellValueFactory(new PropertyValueFactory<LawyerPayment,String>("clientName"));
        paidAmountColumn.setCellValueFactory(new PropertyValueFactory<LawyerPayment,String>("paidAmount"));
        dueAmountColumn.setCellValueFactory(new PropertyValueFactory<LawyerPayment,String>("dueAmount"));
        dueDateColumn.setCellValueFactory(new PropertyValueFactory<LawyerPayment,String>("dueDate"));
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
    private void ViewBillButtonOnClick(MouseEvent event) {
              ObjectInputStream ois=null;
         try {
            LawyerPayment p;
            ois = new ObjectInputStream(new FileInputStream("LawyerPayment.bin"));
            p = (LawyerPayment) ois.readObject();
            
            lawPaymentTableView.getItems().add(p);
            p = (LawyerPayment) ois.readObject(); lawPaymentTableView.getItems().add(p);            
            
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
