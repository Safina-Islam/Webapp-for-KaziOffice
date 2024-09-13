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
public class LawSchedule implements Serializable {
   public LocalDate taskDate;
    String activity;
    
    
    public LawSchedule(LocalDate td, String act) {  
       this.taskDate= td;
        this.activity= act;
    }


    

    public LocalDate getTaskDate() {
        return taskDate;
    }

    public void setTaskDate(LocalDate taskDate) {
        this.taskDate = taskDate;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    @Override
    public String toString() {
        return " ACTIVITY : " + activity+"\n" ;
    }
    

    
    
    
    
}
