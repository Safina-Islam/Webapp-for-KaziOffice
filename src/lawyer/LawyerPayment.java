/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lawyer;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author WIN 10
 */
public class LawyerPayment implements Serializable  {
     int  caseNo;
     String clientName;
     float paidAmount, dueAmount;
     LocalDate dueDate;
     
     public LawyerPayment (int  caseNo,String clientName,float paidAmount, float dueAmount,LocalDate dueDate ) {  
       
       this.caseNo=  caseNo;
    this.clientName= clientName;
     this.paidAmount=paidAmount;
     this.dueAmount=dueAmount;
     this.dueDate= dueDate;
    }

    public int getCaseNo() {
        return caseNo;
    }

    public void setCaseNo(int caseNo) {
        this.caseNo = caseNo;
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
        return  "CaseNo: " + caseNo + ", ClientName: " + clientName + ", PaidAmount: " + paidAmount + ", DueAmount: " + dueAmount + ", DueDate: " + dueDate + "\n";
    }

    
}
