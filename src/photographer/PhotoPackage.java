/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photographer;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author WIN 10
 */
public class PhotoPackage implements Serializable {
    
    String packageName;
    String serviceDuration;
    int noOfPhotographer;
    int album;
    float charge;
    
    public PhotoPackage( String packageName, String serviceDuration, int noOfPhotographer, int album, float charge) {  
       this.packageName = packageName;
       this.serviceDuration = serviceDuration;
       this.noOfPhotographer = noOfPhotographer;
       this.album =album;
       this.charge = charge;
        
    }

    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getServiceDuration() {
        return serviceDuration;
    }

    public void setServiceDuration(String serviceDuration) {
        this.serviceDuration = serviceDuration;
    }

    public int getNoOfPhotographer() {
        return noOfPhotographer;
    }

    public void setNoOfPhotographer(int noOfPhotographer) {
        this.noOfPhotographer = noOfPhotographer;
    }

    public int getAlbum() {
        return album;
    }

    public void setAlbum(int album) {
        this.album = album;
    }

    public float getCharge() {
        return charge;
    }

    public void setCharge(float charge) {
        this.charge = charge;
    }

    @Override
    public String toString() {
        return "PhotoPackage{" + "packageName=" + packageName + ", serviceDuration=" + serviceDuration + ", noOfPhotographer=" + noOfPhotographer + ", album=" + album + ", charge=" + charge + '}';
    }
    
    
}
