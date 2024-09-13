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
public class PhotographerSchedule implements Serializable {
   private LocalDate taskDate;
   private int seialNo;
   private String clientName;
   private String eventType;
   private String eventLocation;
   private String time;
    
   public PhotographerSchedule (LocalDate td, int serialno, String clientName, String eventType, String eventLoc,
                                 String time) {  
       this.taskDate= td;
       this.seialNo = serialno;
       this.clientName = clientName;
       this.eventType = eventType;
       this.eventLocation = eventLoc ;
       this.time = time;
    }

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate) {
        this.taskDate = taskDate;
    }

    public int getSeialNo() {
        return seialNo;
    }

    public void setSeialNo(int seialNo) {
        this.seialNo = seialNo;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return  "TaskDate: " + taskDate + ", SeialNo: " + seialNo + ", ClientName: " + clientName + ",\n EventType: " + eventType + ", EventLocation: " + eventLocation + ", Time: " + time+ "\n";
    }
   
}
