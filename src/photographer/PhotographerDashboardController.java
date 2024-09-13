
package photographer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import java.util.ArrayList;
import static java.util.Arrays.stream;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class PhotographerDashboardController implements Initializable {

    @FXML
    private ImageView insert1ImageView;
    @FXML
    private ImageView insert2ImageView;
     private ArrayList<String> fileTypeList;
     private ArrayList<ImageView> imArr;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fileTypeList = new ArrayList<String>();
        fileTypeList.add("*.*");
    }    


    @FXML
    private void paymentButtonOnClick(MouseEvent event) throws IOException {
        Parent photographerPaymentParent = FXMLLoader.load(getClass().getResource("photographerPayment.fxml"));
        Scene photographerPayment = new Scene(photographerPaymentParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(photographerPayment);
        stage1.show(); 
    }

    @FXML
    private void scheuleButtonOnClick(MouseEvent event) throws IOException {
         Parent PhotographerScheduleParent = FXMLLoader.load(getClass().getResource("PhotographerSchedule.fxml"));
        Scene PhotographerSchedule = new Scene(PhotographerScheduleParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(PhotographerSchedule);
        stage1.show(); 
    }

    @FXML
    private void fAQButtonOnClick(MouseEvent event) throws IOException {
         Parent FAQSceneParent = FXMLLoader.load(getClass().getResource("FAQScene.fxml"));
        Scene FAQScene = new Scene(FAQSceneParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(FAQScene);
        stage1.show(); 
    }

    @FXML
    private void feedBackButtonOnClick(MouseEvent event) throws IOException {
         Parent FeedBackListParent = FXMLLoader.load(getClass().getResource("FeedBackList.fxml"));
        Scene FeedBackList = new Scene(FeedBackListParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(FeedBackList);
        stage1.show(); 
    }

    @FXML
    private void clientButtonOnClick(MouseEvent event) throws IOException {
         Parent photoClientListParent = FXMLLoader.load(getClass().getResource("photoClientList.fxml"));
        Scene photoClientList = new Scene(photoClientListParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(photoClientList);
        stage1.show(); 
    }

    @FXML
    private void addNewPhotoButtonOnClick(MouseEvent event) {
           File f = null;
        FileOutputStream fos = null;      
        ObjectOutputStream oos = null;
        
        try {
            f = new File("Photo.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
                oos = new photographer.AppendableObjectOutputStream(fos);                
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);               
            }
          ImageView i = new ImageView(
                   insert1ImageView.getImage()
            );
            oos.writeObject(i);

        } catch (IOException ex) {
            Logger.getLogger(PhotographerDashboardController.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                Logger.getLogger(PhotographerDashboardController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                
    }

    @FXML
    private void deletePhotoButtonOnClick(MouseEvent event) {
    }

    @FXML
    private void backButtonOnClick(MouseEvent event) throws IOException {
        Parent HomePageParent = FXMLLoader.load(getClass().getResource("/mainpkg/HomePage.fxml"));
        Scene HomePage = new Scene(HomePageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(HomePage);
        stage1.show(); 
    }

    @FXML
    private void photoPackageButtonOnClick(MouseEvent event) throws IOException {
        Parent CreatingPackageParent = FXMLLoader.load(getClass().getResource("CreatingPackage.fxml"));
        Scene CreatingPackage = new Scene(CreatingPackageParent);
       
               
        Stage stage1 = (Stage)((Node)event.getSource()).getScene().getWindow(); 
       
        stage1.setScene(CreatingPackage);
        stage1.show(); 
    }

    @FXML
    private void selectPhotoButtonOnClick(MouseEvent event) throws FileNotFoundException {
        FileChooser fc = new FileChooser();
        
        fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("All files", fileTypeList));
        
        File f = fc.showOpenDialog(null);
        if(f != null){
           
                InputStream stream = new FileInputStream(f);
                  Image image = new Image(stream);
                
                insert1ImageView.setImage(image);}
            
        }
    }
    

