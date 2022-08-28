package userprofile;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.*;
import javax.swing.*;

import Home.Home;



public class SignInPage implements ActionListener
{
	static Person persons[] = new Person [100000];
	static Person person;
	static int [][][] allButtonList= new int[5][4][50];
	
	JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label2;
    JLabel label3;
    JTextField text1;
	JPasswordField text2;  
    JButton buttonSignIn;
    JButton buttonSignUp;
    JButton forgotPassword;
	ImageIcon image;
	static String [][]drawer= new String[500][7];
	String c="";
	int countInFrom=0;
	

    public SignInPage(Person p, int [][][] allButtonList){

		person=p;
		SignInPage.allButtonList=allButtonList;
		AddNewUser(person);
		try {
			FromFile();
		} catch (Exception e) {
			e.printStackTrace();
		}
		for(int h=0; h<=countInFrom+1;h++){
			Person f=new Person( drawer[h][0], drawer[h][1],drawer[h][2],drawer[h][3],drawer[h][4],drawer[h][5],drawer[h][6]);
			SignInPage.AddNewUser(f);
		}

		System.out.println(c);
		System.out.println(countUser());
		System.out.println(countInFrom);
		for(int h=0; h<=countInFrom;h++){
			persons[h].ShowPersonInfo();
		}



        image = new ImageIcon("images/bangladesh-railway.png");

        JLabel user= new JLabel("Email or Phone Number");
        user.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
		user.setBounds(50,180, 200,20);


        JLabel pass= new JLabel("Password");
        pass.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
		pass.setBounds(50, 240,200,20);

        forgotPassword=new JButton("Password forgotten?");
        forgotPassword.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
        forgotPassword.setBorder(BorderFactory.createEmptyBorder());
        forgotPassword.setFocusable(false);
        forgotPassword.addActionListener(this);
        forgotPassword.setBackground(new Color(98, 174, 239));
        forgotPassword.setBounds(50, 430, 200, 20);


        label=new JLabel(image);
        label.setText("Bangladesh Railway");
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label.setForeground(Color.black);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(0);
		label.setBounds(70, 0, 180, 180);


        label2= new JLabel("        Doesn't have an account?"); 
        label2.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
		label2.setBounds(50, 360, 200, 20);


        buttonSignIn = new JButton("Sign In");
        buttonSignIn.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
		buttonSignIn.setFocusable(false);
        buttonSignIn.addActionListener(this);
		buttonSignIn.setBounds(50, 320, 200, 30);


        buttonSignUp = new JButton("Sign Up");
        buttonSignUp.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
        buttonSignUp.setFocusable(false);
        buttonSignUp.addActionListener(this);
        buttonSignUp.setBounds(50, 380, 200, 30);

        text1=new JTextField();  
        text1.setBounds(50,200, 200,30);  

        text2=new JPasswordField();  
        text2.setBounds(50,260, 200,30);  


		panel = new JPanel();
		panel.setPreferredSize(new Dimension(320, 500));
        panel.setBackground(new Color(98, 174, 239));  
        panel.add(label);
        panel.add(user);
        panel.add(pass);
        panel.add(text1);
        panel.add(text2);
        panel.add(buttonSignIn);
        panel.add(label2);
        panel.add(buttonSignUp);
        panel.add(forgotPassword);
        panel.setLayout(null);

        ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");

		Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();

		frame = new JFrame();
		frame.setTitle("Sign In");
        frame.setLayout(new GridBagLayout());
        frame.add(panel, new GridBagConstraints());
        frame.add(panel);
		frame.setIconImage(image1.getImage());
		frame.setLocation(x/2-400, y/2-420);
        frame.setSize(new Dimension(800, 800));
        frame.getContentPane().setBackground(new Color(155, 198, 227));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
                 
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==buttonSignIn)
		{  
			String user = text1.getText();
			String pass = String.valueOf(text2.getPassword());
			int counter = 0;
			
			for(int j=0; j<persons.length; j++){
				if(persons[j]!=null){
					if( user.equals(persons[j].getMobileNumber())){
						if( pass.equals(persons[j].getPassword())){
							person = persons[j];
							counter = 1;
							break;
						}
					}
				}
			}
				
			if( user=="admin"){
				if( pass=="admin"){
					counter = 2;
				}
			}
				
			
			
			if(counter==1){
				frame.setVisible(false);
				new Home(person, allButtonList);
			}

			else if(counter==2){
				frame.setVisible(false);
				new AdminPage();
			}
			
			else
			{
				JOptionPane.showMessageDialog(null, "Invalid username or password");
			}
        }
		

		
		if(e.getSource()==forgotPassword)
		{
			frame.setVisible(false);
			new ResetPasswordGUI(person, allButtonList);
		}
		
		if(e.getSource()==buttonSignUp)
		{
			frame.setVisible(false);
			new SignUpPage(person, allButtonList);
		}
	}
	
	public static boolean ChangePassword(String mobileN, String nid, String pass)
	{
		boolean check=false;
		
		for(int i = 0; i<persons.length; i++)
		{
			if(persons[i]!=null)
			{
				if( mobileN.equals(persons[i].getMobileNumber())&&nid.equals(persons[i].getNidNumber()))
				{
					persons[i].setPassword(pass);
					check=true;
					break;
				}
			}	
		}
		return check;
	}
	
	public int countUser()
	{
		int count = 0;
		
		for(int i = 0; i<persons.length; i++)
		{
			if(persons[i]!= null)
			{
				count++;
			}
		}
		
return count;
	}
	
	public static Person searchUser(Person a)
	{
		Person test = null;
		
		for (int i=0;i<persons.length;i++)
		{
			if(persons[i]!=null)
			{
				if(a.getMobileNumber().equals(persons[i].getMobileNumber()))
				{
					test = persons[i];
					break;
				}
		   }
		}
		return test;
	}
	public static boolean isUser(Person a)
	{
		boolean flag=false;
		
		for (int i=0;i<persons.length;i++)
		{
			if(persons[i]!=null)
			{
				if(a.getMobileNumber().equals(persons[i].getMobileNumber()))
				{
					flag=true;
					break;
				}
		   }
		}
		return flag;
	}

	public static void AddNewUser(Person a)
	{

		for(int i = 0; i<persons.length; i++)
		{
			if(persons[i] == null)
			{
				persons[i] = a;
				break;
			}
		}
		
	}



	public  void FromFile() throws Exception {
		String filePath= "C:/Users/Shuvo/OneDrive/Documents/Eticketing - Copy/userprofile/Person.csv";
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
		   FileWriter writer= new FileWriter("C:/Users/Shuvo/OneDrive/Documents/Eticketing - Copy/userprofile/Person.csv");
		   writer.write(c);
		   writer.close();
		}catch(IOException io){
		   io.printStackTrace();
		}
	 }
}
