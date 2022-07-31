import java.lang.*;
public class MobileBankingPayment{
	
    private String mobileNumber;
    private String pin;
    

    public MobileBankingPayment(){
        System.out.println();
    }
    
     
    public MobileBankingPayment(String mobileNumber, String pin)
    {
        this.mobileNumber=mobileNumber;
        this.pin=pin;
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

     


     
    void ShowMobileBankingPaymentInfo(){
    System.out.println("Mobile Number: "+mobileNumber);
    System.out.println("Pin Number: "+pin);
    }

         
   public static void main(String[] args){
        
       MobileBankingPayment S1=new MobileBankingPayment("01571314883", "0987");
       S1.ShowMobileBankingPaymentInfo();
   }

}