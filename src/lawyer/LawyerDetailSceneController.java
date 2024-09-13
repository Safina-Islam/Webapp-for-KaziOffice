
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


public class LawyerDetailSceneController implements Initializable {

    @FXML
    private TextArea blog1TextArea;
    @FXML
    private TextArea blog2TextArea;
    @FXML
    private TextArea blog3TextArea;
    @FXML
    private TextArea blog4TextArea;
    
  

    public void reciveData(String b){
       
       blog1TextArea.setText(b);
      
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        blog1TextArea.setEditable(false);
        blog2TextArea.setEditable(false);
        blog3TextArea.setEditable(false);
        blog4TextArea.setEditable(false);
    }    

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
         Parent LawyerPanelParent = FXMLLoader.load(getClass().getResource("LawyerPanel.fxml"));
        Scene LawyerPanel = new Scene(LawyerPanelParent);
       
               
        Stage stage2 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        
        
        stage2.setScene(LawyerPanel);
        stage2.show();
    }

    
}
