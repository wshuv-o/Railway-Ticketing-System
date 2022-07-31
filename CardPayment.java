import java.lang.*;
public class CardPayment{
	
    private String Card_Holder_Name;
    private String Card_Number;
    private int Card_CVC;
    private String Card_ValidThrough;
    

    public CardPayment(){
        System.out.println();
    }
    
     
    public CardPayment(String Card_Holder_Name, String Card_Number, int Card_CVC, String Card_ValidThrough)
    {
        this.Card_Holder_Name=Card_Holder_Name;
        this.Card_Number=Card_Number;
        this.Card_CVC=Card_CVC;
        this.Card_ValidThrough=Card_ValidThrough;

    }

    public void setCard_Holder_Name(String Card_Holder_Name){
        this.Card_Holder_Name=Card_Holder_Name;
    }
    public String getCard_Holder_Name(){
        return Card_Holder_Name;
    }
    public void setCard_Number(String Card_Number){
        this.Card_Number=Card_Number;
    }
    public String getCard_Number(){
        return Card_Number;
    }
    public void setCard_CVC(int Card_CVC){
        this.Card_CVC=Card_CVC;
    }
    public int getCard_CVC(){
        return Card_CVC;
    }
    public void setCard_ValidThrough(String Card_ValidThrough){
        this.Card_ValidThrough=Card_ValidThrough;
    }
    public String getCard_ValidThrough(){
        return Card_ValidThrough;
    }
     


     
    void ShowCardPaymentInfo(){
    System.out.println("Card Holder Name: "+Card_Holder_Name);
    System.out.println("Card Number : "+Card_Number);
    System.out.println("CVC : "+Card_CVC);
    System.out.println("ValidThrough : "+Card_ValidThrough);     
    }

         
   public static void main(String[] args){
        
       CardPayment S1=new CardPayment("JALAL", "0102567898234576", 905, "2026");
       CardPayment S2=new CardPayment("Shuvo",  "0102567898234576", 578, "2027" );
            System.out.println();
       S1.ShowCardPaymentInfo();
            System.out.println();
       S2.ShowCardPaymentInfo();
           System.out.println();
       
   }

}