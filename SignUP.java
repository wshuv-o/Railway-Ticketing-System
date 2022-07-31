import java.lang.*;
public class SignUP{
	
    private String FullName;
    private String DateOfBirth;
    private String MobileNumber;
    private String Email;
    private String Password;
    private String ConfirmPassword;
    private String NidNumber;
    
    
    public SignUP(){
        System.out.println();
    }
     
    public SignUP(String FullName, String DateOfBirth, String MobileNumber, String Email, String Password, String ConfirmPassword, String NidNumber)
    {
        this.FullName=FullName;
        this.DateOfBirth=DateOfBirth;
        this.MobileNumber=MobileNumber;
        this.Email=Email;
        this.Password=Password;
        this.ConfirmPassword=ConfirmPassword;
        this.NidNumber=NidNumber;

    }

    public void setFullName(String FullName){
        this.FullName=FullName;
    }
    public String getFullName(){
        return FullName;
    }
    public void setDateOfBirth(String DateOfBirth){
        this.DateOfBirth=DateOfBirth;
    }
    public String getDateOfBirth(){
        return DateOfBirth;
    }
    public void setMobileNumber(String MobileNumber){
        this.MobileNumber=MobileNumber;
    }
    public String getMobileNumber(){
        return MobileNumber;
    }
    public void setEmail(String Email){
        this.Email=Email;;
    }
    public String getEmail(){
        return Email;
    }
    public void setPassword(String  Password){
        this.Password=Password;
    }
    public String getPassword(){
        return Password;
    }
    public void setConfirmPassword(String ConfirmPassword){
        this.ConfirmPassword=ConfirmPassword;
    }
    public String getConfirmPassword(){
        return ConfirmPassword;
    }
    public void setNidNumber(String NidNumber){
        this.NidNumber=NidNumber;
    }
    public String getNidNumber(){
        return NidNumber;
    }


     
    void ShowSignUpInfo(){
    System.out.println("Full Name : "+FullName);
    System.out.println("Date Of Birth : "+DateOfBirth);
    System.out.println("Mobile Number : "+MobileNumber);
    System.out.println("Email : "+Email);
    System.out.println("Password : "+Password);
    System.out.println("Confirm Password : "+ConfirmPassword);
    System.out.println("Nid Number : "+NidNumber);
     
    }

         
   public static void main(String[] args){
        
       SignUP S1=new SignUP("JALAL", "11/06/2001", "01875627698", "Jalal685@gmail.com", "He12345@", "He12345@", "1314151661" );
       SignUP S2=new SignUP("Shuvo", "24/01/2002", "01775627698", "shuvo775@gmail.com", "Ae12345@", "Ae12345@", "1814158661" );
            System.out.println();
       S1.ShowSignUpInfo();
            System.out.println();
       S2.ShowSignUpInfo();
           System.out.println();
       
   }

}