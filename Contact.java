
package ca.humber;
import java.util.Scanner;
/**
 *
 * @author Anthony Elia - N01515607
 */
public class Contact {
    private String fName;
    private String lName;
    private String eMail;
    private long phoneNum;
    
    public Contact(String fName, String lName, String eMail, long phoneNum){
        this.fName = fName;
        this.lName = lName;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
    }
     
    public void setFName(String updateFName){
        this.fName = updateFName;
    }
    
    public void setLName(String updateLName) {
        this.lName = updateLName;
    }
    
    public void setEMail(String updateEMail) {
        this.eMail = updateEMail;
    }
    
    public void setPhoneNum(int updatePhoneNum){
        this.phoneNum = updatePhoneNum;
    }
    
    public String getFName(){
        return fName;
    }
    
    public String getLName() {
        return lName;
    }
    
    public String getEMail() {
        return eMail;
    }
    
    public long getPhoneNum(){
        return phoneNum;
    }
    
    public void printContact(){
        System.out.print(getLName() +", "+ getFName() +" " + getEMail() +" " + getPhoneNum());
    }
}
