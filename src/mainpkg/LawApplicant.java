/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpkg;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author WIN 10
 */
public class LawApplicant  implements Serializable  {
      String name;
     LocalDate dob;
     String address, phoneNo, email,occupation,mariStatus,
             spouseName,spouseOccupation, issue;
     
     
     public LawApplicant(String name, LocalDate dob, String address,
          String phoneNo, String email, String occup, String mariStatus,
          String spName, String spOccupation, String issue ) {  
       
        this.name= name;
        this.dob= dob;
        this.address=address;
        this.phoneNo= phoneNo;
        this.email = email;
        this.occupation = occup;
        this.mariStatus= mariStatus;
        this.spouseName = spName;
        this.spouseOccupation = spOccupation;
        this.issue = issue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getMariStatus() {
        return mariStatus;
    }

    public void setMariStatus(String mariStatus) {
        this.mariStatus = mariStatus;
    }

    public String getSpouseName() {
        return spouseName;
    }

    public void setSpouseName(String spouseName) {
        this.spouseName = spouseName;
    }

    public String getSpouseOccupation() {
        return spouseOccupation;
    }

    public void setSpouseOccupation(String spouseOccupation) {
        this.spouseOccupation = spouseOccupation;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", DOB: " + dob + ", Address:" + address + ", PhoneNo: " + phoneNo + ", Email: " + email + ", Occupation: " + occupation + ", MaritualStatus: " + mariStatus + ", SpouseName: " + spouseName + ", SpouseOccupation: " + spouseOccupation + ", Issue: " + issue + "\n";
    }

   

}
