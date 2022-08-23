package userprofile;
import java.lang.*;
public class Person{
	
    private  String FirstName;
    private  String LastName;
    private  String DateOfBirth;
    private  String MobileNumber;
    private  String Email;
    private  String Password;
    private  String NidNumber;
    
     
    public Person(String FirstName,String LastName, String NidNumber,String DateOfBirth, String MobileNumber, String Email, String Password)
    {
        this.FirstName=FirstName;
        this.LastName=LastName;
        this.DateOfBirth=DateOfBirth;
        this.MobileNumber=MobileNumber;
        this.Email=Email;
        this.Password=Password;
        this.NidNumber=NidNumber;

    }
    public Person(String MobileNumber, String Password, String FirstName, String NidNumber){

        this.MobileNumber=MobileNumber; 
        this.Password=Password;
        this.FirstName=FirstName;
        this.NidNumber=NidNumber; 

    }

    public Person() {
    }
    public void setFirstName(String FirstName){
        this.FirstName=FirstName;
    }
    public String getFirstName(){
        return FirstName;
    }    
	public void setLastName(String LastName){
        this.LastName=LastName;
    }
    public String getLastName(){
        return LastName;
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

    public void setNidNumber(String NidNumber){
        this.NidNumber=NidNumber;
    }
    public String getNidNumber(){
        return NidNumber;
    }


     
    public void ShowPersonInfo(){
    System.out.println("Full Name : "+FirstName+" "+ LastName);
    System.out.println("Date Of Birth : "+DateOfBirth);
    System.out.println("Date Of Birth : "+DateOfBirth);
    System.out.println("Mobile Number : "+MobileNumber);
    System.out.println("Email : "+Email);
    System.out.println("Password : "+Password);
    System.out.println("Nid Number : "+NidNumber);
     
    }

         
//    public static void main(String[] args){
        
//        Person S1=new Person("JALAL", "Uddin ","11/06/2001", "01875627698", "Jalal685@gmail.com", "He12345@", "He12345@", "1314151661" );
//        Person S2=new Person("Shuvo", "Wahid", "24/01/2002", "01775627698", "shuvo775@gmail.com", "Ae12345@", "Ae12345@", "1814158661" );
//             System.out.println();
//        S1.ShowPersonInfo();
//             System.out.println();
//        S2.ShowPersonInfo();
//            System.out.println();
       
//    }
public static void main(String[] args) {
    new Person();
}
}
