package payment;
import java.lang.*;

import javax.swing.JOptionPane;
public class MobileBankingPayment{

    private String mobileNumber;
    private String pin;
    private double availablebalance;


    public MobileBankingPayment(){
        System.out.println();
    }


    public MobileBankingPayment(String mobileNumber, String pin)
    {
        this.mobileNumber=mobileNumber;
        this.pin=pin;
    }

    public MobileBankingPayment(String mobileNumber, String pin,double availablebalance)
    {
        this.mobileNumber=mobileNumber;
        this.pin=pin;
        this.availablebalance=availablebalance;
    }

    public void setmobileNumber(String mobileNumber){
        this.mobileNumber=mobileNumber;
    }
    public String getmobileNumber(){
        return mobileNumber;
    }
    public void setpin(String pin){
        this.pin=pin;
    }
    public String getpin(){
        return pin;
    }

    public void setBalance(double balance){
        availablebalance+=balance;
    }

    public double getBalance(){
        return availablebalance;
    }
    
    public boolean deductBalance(double balance){
        boolean flag=false;
        if(balance<=availablebalance){
            availablebalance-=balance;
            flag= true;
        }
        else{
            JOptionPane.showMessageDialog(null, "Insufficient balance!");
        }
        return flag;
    }


    void ShowMobileBankingPaymentInfo(){
    System.out.println("Mobile Number: "+mobileNumber);
    System.out.println("Pin Number: "+pin);
    }

}