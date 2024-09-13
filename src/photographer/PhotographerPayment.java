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
public class PhotographerPayment implements Serializable{
    int  serialNo;
     String clientName;
     float paidAmount; 
     String packege;
     float dueAmount;
     LocalDate dueDate;
     
     public PhotographerPayment (int  serialNo,String clientName,float paidAmount,String packege, float dueAmount,LocalDate dueDate ) {  
       
       this.serialNo=  serialNo;
    this.clientName= clientName;
     this.paidAmount=paidAmount;
     this.packege= packege;
     this.dueAmount=dueAmount;
     this.dueDate= dueDate;
    }

    public int getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(int serialNo) {
        this.serialNo = serialNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public float getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(float paidAmount) {
        this.paidAmount = paidAmount;
    }

    public String getPackege() {
        return packege;
    }

    public void setPackege(String packege) {
        this.packege = packege;
    }

    public float getDueAmount() {
        return dueAmount;
    }

    public void setDueAmount(float dueAmount) {
        this.dueAmount = dueAmount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return  "SerialNo: " + serialNo + ", ClientName: " + clientName + ", PaidAmount: " + paidAmount + ", Package: " + packege + ", DueAmount: " + dueAmount + ", DueDate: " + dueDate + "\n";
    }
     
    
}
