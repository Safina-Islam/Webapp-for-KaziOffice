/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

public class PhotographerApplicant implements Serializable{
    
    String name;
    LocalDate eventDate;
    String eventAddress, phoneNo,email,eventType,startingTime,choosenPackage,specialRequerments;

    public PhotographerApplicant(String name, LocalDate eventDate, String eventAddress, String phoneNo, String email, String eventType, String startingTime, String choosenPackage, String specialRequerments) {
        this.name = name;
        this.eventDate = eventDate;
        this.eventAddress = eventAddress;
        this.phoneNo = phoneNo;
        this.email = email;
        this.eventType = eventType;
        this.startingTime = startingTime;
        this.choosenPackage = choosenPackage;
        this.specialRequerments = specialRequerments;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDate eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventAddress() {
        return eventAddress;
    }

    public void setEventAddress(String eventAddress) {
        this.eventAddress = eventAddress;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public void setStartingTime(String startingTime) {
        this.startingTime = startingTime;
    }

    public String getChoosenPackage() {
        return choosenPackage;
    }

    public void setChoosenPackage(String choosenPackage) {
        this.choosenPackage = choosenPackage;
    }

    public String getSpecialRequerments() {
        return specialRequerments;
    }

    public void setSpecialRequerments(String specialRequerments) {
        this.specialRequerments = specialRequerments;
    }

    @Override
    public String toString() {
        return  "ApplicantName: " + name + ", EventDate: " + eventDate + ", EventAddress: " + eventAddress +
                ", PhoneNo: " + phoneNo + ", Email: " + email + ", EventType: " + eventType + ", StartingTime: "
                + startingTime + ", ChoosenPackage: " + choosenPackage + ", SpecialRequerments: " + specialRequerments+ "\n";
    }
    
    
    
}
