package payment;
import java.lang.*;
public class CardPayment{

    private String CardHolderName;
    private String CardNumber;
    private String CardCVV;
    private String CardValidThrough;
    private double availablebalance;


    public CardPayment(){
        System.out.println();
    }


    public CardPayment(String CardHolderName, String CardNumber, String CardCVV, String CardValidThrough,double availablebalance )
    {
        this.CardHolderName=CardHolderName;
        this.CardNumber=CardNumber;
        this.CardCVV=CardCVV;
        this.CardValidThrough=CardValidThrough;
        this.availablebalance=availablebalance;

    }

    public CardPayment(String CardHolderName, String CardNumber, String CardCVV, String CardValidThrough)
    {
        this.CardHolderName=CardHolderName;
        this.CardNumber=CardNumber;
        this.CardCVV=CardCVV;
        this.CardValidThrough=CardValidThrough;

    }

    public void setCardHolderName(String CardHolderName){
        this.CardHolderName=CardHolderName;
    }
    public String getCardHolderName(){
        return CardHolderName;
    }
    public void setCardNumber(String CardNumber){
        this.CardNumber=CardNumber;
    }
    public String getCardNumber(){
        return CardNumber;
    }
    public void setCardCVV(String CardCVV){
        this.CardCVV=CardCVV;
    }
    public String getCardCVV(){
        return CardCVV;
    }
    public void setCardValidThrough(String CardValidThrough){
        this.CardValidThrough=CardValidThrough;
    }
    public String getCardValidThrough(){
        return CardValidThrough;
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
            System.out.println("taka nei");
        }
        return flag;
    }



    void ShowCardPaymentInfo(){
    System.out.println("Card Holder Name: "+CardHolderName);
    System.out.println("Card Number : "+CardNumber);
    System.out.println("CVV : "+CardCVV);
    System.out.println("ValidThrough : "+CardValidThrough);     
    }


   public static void main(String[] args){

       CardPayment S1=new CardPayment("JALAL", "0102567898234576", "905", "2026", 45667);
       CardPayment S2=new CardPayment("Shuvo",  "0102567898234576", "578", "2027", 786 );
            System.out.println();
       S1.ShowCardPaymentInfo();
            System.out.println();
       S2.ShowCardPaymentInfo();
           System.out.println();

   }



}
 