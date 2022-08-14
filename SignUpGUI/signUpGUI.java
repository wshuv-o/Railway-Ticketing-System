
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

import com.toedter.calendar.JDateChooser;

public class SignUpPage implements ActionListener{
	Person person;
	JTextField nameTF1 ;
    JTextField nameTF2;
    JTextField mobileNumber;
    JTextField nidField;
    JTextField emailField;
    JTextField dobField;
    JPasswordField pass;
    JPasswordField conPassField;
    JButton createAccButton;
    JButton SignInButton;
    JFrame frame;
    JLabel namelabel,nameLabel2;
    JDateChooser dateChooser;

    static String [][]drawer= new String[500][7];
	String c="";
	int countInFrom=0;
	
	public SignUpPage(Person p){
		person=p;

        Font myFont = new Font("Avenir Next LT Pro", Font.PLAIN, 16);
        ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");
    
        namelabel =new JLabel();
        namelabel.setText("First Name");
        namelabel.setBounds(5,20,100,30);
        namelabel.setFont(myFont);
        namelabel.setForeground(Color.white);
    
    
        nameLabel2 =new JLabel();
        nameLabel2.setText("Last Name");
        nameLabel2.setBounds(220,20,100,30);
        nameLabel2.setFont(myFont);
        nameLabel2.setForeground(Color.white);
    
         nameTF1 = new JTextField();
        nameTF1.setLayout(null);
        nameTF1.setBounds(5,50, 200, 30);
        nameTF1.setFont(myFont);
        nameTF1.setOpaque(false);
        nameTF1.setForeground(new Color(0xCFFFDC));
        nameTF1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,new Color(10,10,10)));
    
        
         nameTF2 = new JTextField();
        nameTF2.setLayout(null);
        nameTF2.setBounds(220,50, 200, 30);
        nameTF2.setFont(myFont);
        nameTF2.setForeground(new Color(0xCFFFDC));
        nameTF2.setOpaque(false);
        nameTF2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
        JLabel mobile=new JLabel();
        mobile.setText("Mobile Number");
        mobile.setBounds(5,90,100,30);
        mobile.setFont(myFont);
        mobile.setForeground(Color.white);
    
    
         mobileNumber = new JTextField();
        mobileNumber.setLayout(null);
        mobileNumber.setBounds(5,120, 200, 30);
        mobileNumber.setFont(myFont);
        mobileNumber.setForeground(new Color(0xCFFFDC));
        mobileNumber.setOpaque(false);
        mobileNumber.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel nidLabel =new JLabel();
        nidLabel.setText("NID");
        nidLabel.setBounds( 220,90,100,30);
        nidLabel.setFont(myFont);
        nidLabel.setForeground(Color.white);
    
    
         nidField = new JTextField();
        nidField.setLayout(null);
        nidField.setBounds(220,120, 200, 30);
        nidField.setFont(myFont);
        nidField.setForeground(new Color(0xCFFFDC));
        nidField.setOpaque(false);
        nidField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
        JLabel email =new JLabel();
        email.setText("E-Mail");
        email.setBounds(5,160,100,30);
        email.setFont(myFont);
        email.setForeground(Color.white);
    
    
         emailField = new JTextField();
        emailField.setLayout(null);
        emailField.setBounds(5,190, 200, 30);
        emailField.setFont(myFont);
        emailField.setForeground(new Color(0xCFFFDC));
        emailField.setOpaque(false);
        emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
     
        JLabel dobLabel =new JLabel();
        dobLabel.setText("Date Of Birth(YY/M/D)");
        dobLabel.setBounds(220,160,200,30);
        dobLabel.setFont(myFont);
        dobLabel.setForeground(Color.white);
    
    
        
        dateChooser=new JDateChooser();
        dateChooser.setBounds(220,190, 200, 30);
        dateChooser.setToolTipText("");
        dateChooser.setBackground(Color.BLUE);
        dateChooser.setBackground(Color.CYAN);
        dateChooser.setOpaque(true);
    
      
        JLabel passLabel =new JLabel();
        passLabel.setText("Password");
        passLabel.setBounds(5,230,100,30);
        passLabel.setFont(myFont);
        passLabel.setForeground(Color.white);
    
    
         pass = new JPasswordField();
        pass.setLayout(null);
        pass.setBounds(5,260, 200, 30);
        pass.setFont(myFont);
        pass.setForeground(new Color(0xCFFFDC));
        pass.setOpaque(false);
        pass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
        JLabel conPassLabel =new JLabel();
        conPassLabel.setText("Confirm Password");
        conPassLabel.setBounds(220,230,200,30);
        conPassLabel.setFont(myFont);
        conPassLabel.setForeground(Color.white);
    
         conPassField = new JPasswordField();
       conPassField.setLayout(null);
       conPassField.setBounds(220,260, 200, 30);
       conPassField.setFont(myFont);
       conPassField.setForeground(new Color(0xCFFFDC));
       conPassField.setOpaque(false);
       conPassField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
       createAccButton =new JButton();
       createAccButton.setText("Create Account");
       createAccButton.setBounds(150,320,130,30);
       createAccButton.setBackground(new Color(0x292929));
       createAccButton.setFocusable(false);
       createAccButton.setForeground(new Color(0xFFFFFF));
       createAccButton.addActionListener(this);

    
       JLabel alreadyJLabel =new JLabel();
        alreadyJLabel.setText("Already have an Account?");
        alreadyJLabel.setBounds(5,360,200,30);
        alreadyJLabel.setFont(myFont);
        alreadyJLabel.setForeground(Color.white);


        SignInButton =new JButton();
        SignInButton.setText("Sign In");
        SignInButton.setBounds(175,365,40,20);
        SignInButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
        SignInButton.setBackground(new Color(250,250,250));
        SignInButton.setFocusable(false);
        SignInButton.setForeground(new Color(0x9ED2C6));
        SignInButton.setOpaque(false);
        SignInButton.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(10,10,10)));
        SignInButton.addActionListener(this);
    
    
        JPanel panel2= new JPanel();
        panel2.setPreferredSize(new Dimension(450,600));
        panel2.setBackground(new Color(0,102,102));
        panel2.setLayout(null);
        panel2.add(nameTF1);
        panel2.add(nameTF2);
        panel2.add(namelabel);
        panel2.add(pass);
        panel2.add(passLabel);
        panel2.add(nameLabel2);
        panel2.add(mobile);
        panel2.add(mobileNumber);
        panel2.add(nidField);
        panel2.add(nidLabel);
        panel2.add(email);
        panel2.add(emailField);
        panel2.add(dobLabel);
        panel2.add(dateChooser);
        panel2.add(conPassField);
        panel2.add(conPassLabel);
        panel2.add(createAccButton);
        panel2.add(SignInButton);
        panel2.add(alreadyJLabel);
    
    
      JButton imgButton =new JButton();
      imgButton.setIcon(new ImageIcon(("train13.png")));
      imgButton.setText("");
      imgButton.setBounds(0,0,700,600);
      imgButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
      imgButton.setBackground(new Color(250,250,250));
      imgButton.setOpaque(false);
      imgButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(100,10,10)));
    
     
      JPanel panel1=new JPanel();
      panel1.setPreferredSize(new Dimension(700,600));
      panel1.setBackground(new Color(2, 247, 166 ));
      panel1.setLayout(null);
      panel1.add(imgButton);
     
      
      Toolkit tk=Toolkit.getDefaultToolkit();
      int x=(int) tk.getScreenSize().getWidth();
      int y=(int) tk.getScreenSize().getHeight();
    
      frame = new JFrame();
      frame.setTitle("Sign Up");
      frame.setSize(1170,640);
      frame.setMinimumSize(new Dimension(1170,650));
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setIconImage(image1.getImage());
      frame.add(panel1);
      frame.add(panel2);
      frame.setLayout(new GridBagLayout());
      frame.setLocation(x/2-585, y/2-320);
      frame.getContentPane().setBackground(new Color( 0x292929));
      frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
        String dob=null;
        try{
        SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
        dob=sdf.format(dateChooser.getDate());
        System.out.println(dob);
        }catch(NullPointerException nullPointerException){
            JOptionPane.showMessageDialog(null,"Please select your birthday!");
        }
            if(e.getSource()==SignInButton){
                frame.setVisible(false);
                new SignInPage(person);
            }
    
            if(e.getSource()==createAccButton){
                String fname = nameTF1.getText();
                String lname = nameTF2.getText();
                String mNumber = mobileNumber.getText();
                String nid = nidField.getText();
                String email = emailField.getText();
                String password= String.valueOf(pass.getPassword());
                String conPass = String.valueOf(conPassField.getPassword());
    

                
                Person tempPerson=null;
                if(password.equals(conPass)){
                    if((fname.isEmpty()!=true) && (lname.isEmpty()!=true) && (mNumber.isEmpty()!=true)&&(nid.isEmpty()!=true)&&(email.isEmpty()!=true)&&(dob!=null)&&(password.isEmpty()!=true)){
                        tempPerson = new Person(fname, lname , nid, dob, mNumber, email, password);
                        if(SignInPage.searchUser(tempPerson)!=null){
                            JOptionPane.showMessageDialog(null,"User already exist!");
                        }
                        else{
                            SignInPage.AddNewUser(tempPerson);
                            JOptionPane.showMessageDialog(null, "Congratulations!, Account created successfully.");
                            frame.setVisible(false);
                            new SignInPage(tempPerson);
                            AddToFile(tempPerson);
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"Please fill all the fields");
                    }
                }
                else{				
                JOptionPane.showMessageDialog(null, "Password Confirmation error");
                }   
            
            }
        
    }

	

    public static void main(String [] args)
    {
        Person p = new Person("01773259873","1","shuvo", "1");
        new SignUpPage(p);
    }
    

    public void AddToFile(Person a){
        String filePath= "C:/Users/Shuvo/OneDrive/Desktop/draft/Person.csv";
		BufferedReader reader=null;
		String line="";
		
		try{
		   reader = new BufferedReader(new FileReader(filePath));
		   int j=0;
		   while((line= reader.readLine())!=null){
			  String []row= line.split(",");
			  for(int i=0; i<7;i++){
				 drawer[j][i]=row[i];
				 if(i==6)
				 c= c+row[i]+"";
				 else
				 c= c+row[i]+",";
			  }
			  c=c+"\n";
			  j++;
			  countInFrom++;
		   }
		   
		}

		catch(Exception e){
		   e.printStackTrace();
  
		}
  
		finally{
		   try{
			  reader.close();
		   } 
		  
		  catch (IOException e) {
			  e.printStackTrace();
		   }
		}
		try{
		   FileWriter writer= new FileWriter("C:/Users/Shuvo/OneDrive/Desktop/draft/Person.csv");
		   writer.write(c);
		   writer.append(a.getFirstName()+","+a.getLastName()+","+a.getNidNumber()+","+a.getDateOfBirth()+","+a.getMobileNumber()+","+a.getEmail()+","+a.getPassword());
		   writer.close();
		}catch(IOException io){
		   io.printStackTrace();
		}
    }
}
