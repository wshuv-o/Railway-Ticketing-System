import java.awt.*;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.text.FlowView;
import org.w3c.dom.events.MouseEvent;
import javax.swing.*;
import java.lang.*;
import java.text.SimpleDateFormat;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.JCalendar;
import com.toedter.components.JLocaleChooserBeanInfo;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.demo.DateChooserPanel;



public class signUpGUI implements ActionListener{

  JComboBox monthCombo;
  JComboBox dayCombo;
  JComboBox yearCombo,dayCombo1,dayCombo2,dayCombo3;
  JPanel panel2;
  JDateChooser dateChooser;

  static Integer[] year=new Integer[81];
  //static Integer[] month={1,2,3,4,5,6,7,8,9,10,11,12};
  static String[] month={"1","2","3","4","5","6","7","8","9","10","11","12"};
  static String[] day1=new String[31];  
  static String[] day2=new String[30];  
  static String[] day3=new String[28];  

  
    public signUpGUI()
    {

      for(int i=0;i<=30;i++)
      {
        day1[i]=String.valueOf(i+1);
      }
      for(int i=0;i<=29;i++)
      {
        day2[i]=String.valueOf(i+1);
      }
      for(int i=0;i<=27;i++)
      {
        day3[i]=String.valueOf(i+1);
      }

     for(int i=0;i<=80;i++)
     {
       year[i]=(2005-i);
     }

    JLabel namelabel;
    Font myFont = new Font("Agency FB", Font.PLAIN, 23);

    namelabel =new JLabel();
    namelabel.setText("First Name");
    namelabel.setBounds(5,20,100,30);
    namelabel.setFont(new Font("Agency FB", Font.PLAIN, 18));


   JLabel nameLabel2 =new JLabel();
   nameLabel2.setText("Last Name");
   nameLabel2.setBounds(220,20,100,30);
   nameLabel2.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField nameTF1 = new JTextField();
    nameTF1.setLayout(null);
    nameTF1.setBounds(5,50, 200, 30);
    nameTF1.setFont(myFont);
    nameTF1.setOpaque(false);
    nameTF1.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    
    JTextField nameTF2 = new JTextField();
    nameTF2.setLayout(null);
    nameTF2.setBounds(220,50, 130, 30);
    nameTF2.setFont(myFont);
    nameTF2.setOpaque(false);
    nameTF2.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    JLabel mobile=new JLabel();
    mobile.setText("Mobile Number");
    mobile.setBounds(5,90,100,30);
    mobile.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField mobileNumber = new JTextField();
    mobileNumber.setLayout(null);
  //mobileNumber.setBackground(new Color(20,200,20));;;
    mobileNumber.setBounds(5,120, 130, 30);
    mobileNumber.setFont(myFont);
    mobileNumber.setOpaque(false);
    mobileNumber.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


    JLabel nidLabel =new JLabel();
    nidLabel.setText("NID");
    nidLabel.setBounds( 220,90,100,30);
    nidLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField nidField = new JTextField();
    nidField.setLayout(null);
    nidField.setBounds(220,120, 200, 30);
    nidField.setFont(myFont);
    nidField.setOpaque(false);
    nidField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    JLabel email =new JLabel();
    email.setText("E-Mail");
    email.setBounds(5,160,100,30);
    email.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField emailField = new JTextField();
    emailField.setLayout(null);
    emailField.setBounds(5,190, 200, 30);
    emailField.setFont(myFont);
    emailField.setOpaque(false);
    emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
 
    JLabel dobLabel =new JLabel();
    dobLabel.setText("Date Of Birth(YY/M/D)");
    dobLabel.setBounds(220,160,200,30);
    dobLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));

    
    dateChooser=new JDateChooser();
    
    dateChooser.setBackground(new java.awt.Color(255, 255, 255));
    dateChooser.setForeground(new java.awt.Color(255, 255, 255));
    dateChooser.setBounds(220,190, 200, 30);
    dateChooser.setToolTipText("");
    dateChooser.setOpaque(false);
    // dateChooser.addActionListener(this);


    // yearCombo= new JComboBox<>(year);
    // yearCombo.setBounds(220,190, 60, 30);
    // yearCombo.setBackground(Color.white);
    // yearCombo.addActionListener(this);

    // monthCombo = new JComboBox<>(month);
    // monthCombo.setBounds(285,190, 60, 30);
    // monthCombo.setBackground(Color.white);
    // monthCombo.addActionListener(this);


    // dayCombo= new JComboBox<>(day1);
    // dayCombo.setBounds(350,190, 60, 30);
    // dayCombo.setBackground(Color.white);
    // dayCombo.setEditable(true);
    // dayCombo.addActionListener(this); 
    
  
    JLabel passLabel =new JLabel();
    passLabel.setText("Password");
    passLabel.setBounds(5,230,100,30);
    passLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField pass = new JTextField();
    pass.setLayout(null);
    pass.setBounds(5,260, 200, 30);
    pass.setFont(myFont);
    pass.setOpaque(false);
    pass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    JLabel conPassLabel =new JLabel();
    conPassLabel.setText("Confirm Password");
    conPassLabel.setBounds(220,230,100,30);
    conPassLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField conPassField = new JTextField();
   conPassField.setLayout(null);
   conPassField.setBounds(220,260, 200, 30);
   conPassField.setFont(myFont);
   conPassField.setOpaque(false);
   conPassField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


   JButton createAccButton =new JButton();
   createAccButton.setText("Create Account");
   createAccButton.setBounds(150,320,130,30);
   createAccButton.setBackground(new Color(250,250,250));
   createAccButton.setFocusable(false);
   createAccButton.addActionListener(this);
   //setOpaque(false);
   //createAccButton.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, new Color(100,10,10));

   JLabel alreadyJLabel =new JLabel();
    alreadyJLabel.setText("Already have an Account?");
    alreadyJLabel.setBounds(5,360,200,30);
    alreadyJLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));


   JButton createSignInButton =new JButton();
   createSignInButton.setText("Sign In");
   createSignInButton.setBounds(140,360,50,30);
   createSignInButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
   createSignInButton.setBackground(new Color(250,250,250));
   createSignInButton.setFocusable(false);
   createSignInButton.setForeground(Color.white);

   createSignInButton.setOpaque(false);
   createSignInButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(100,10,10)));


    panel2= new JPanel();
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
    // panel2.add(yearCombo);
    // panel2.add(monthCombo);
    // panel2.add(dayCombo);
    panel2.add(dateChooser);
    panel2.add(conPassField);
    panel2.add(conPassLabel);
    panel2.add(createAccButton);
    panel2.add(createSignInButton);
    panel2.add(alreadyJLabel);

    panel2.setMinimumSize(new DimensionUIResource(425, 400));

    

    

   JButton imgButton =new JButton();
   imgButton.setIcon(new ImageIcon(("train13.png")));
   imgButton.setText("Sign In");
   imgButton.setBounds(0,0,1024,700);
   imgButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
   imgButton.setBackground(new Color(250,250,250));

   imgButton.setOpaque(false);
   imgButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(100,10,10)));


 
     JPanel panel1=new JPanel();
     panel1.setPreferredSize(new Dimension(700,600));
     panel1.setBackground(new Color(2, 247, 166 ));
     panel1.setLayout(null);
     panel1.add(imgButton);
 


   
    JFrame frame = new JFrame();
    frame.setTitle("Sign Up ");
    frame.setSize(1920,1080);
    frame.setMinimumSize(new Dimension(1400,500));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");

    frame.setIconImage(image1.getImage());
    frame.add(panel1);
    frame.add(panel2);
    frame.setLayout(new GridBagLayout());

    frame.getContentPane().setBackground(new Color( 0,153,153));
    frame.setVisible(true);
    
}


public static void main(String[] args)
{
   new signUpGUI();
  
}


@Override
public void actionPerformed(ActionEvent e) {
  {
  
    // String m= monthCombo.getSelectedItem().toString();
    // String date=dayCombo.getSelectedItem().toString() +"-"+m+"-"+yearCombo.getSelectedItem().toString();
    // String date=dateChooser.getSelectedItem().toString();
    // String s=DateChooserPanel.getDateFormatString();
    SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
    String s=sdf.format(dateChooser.getDate());
    System.out.println(s);
  // System.out.println(DateChooserPanel);
  // if(m=="1"||m=="3"||m=="5"||m=="7"||m=="8"||m=="10"||m=="12"){
   
   
    
  // }
  // else if(m=="4"||m=="6"||m=="9"||m=="11"){
  //   // dayCombo.setSelectedItem(day2);
  //   // panel2.add(dayCombo2);
  //   dayCombo.removeItem("31");
  //   // day1[30]=null;
  //   // System.out.println(day1[30]);
  // }
  // else if(m=="2"){
  //   // dayCombo.setSelectedItem(day3);
  //   // panel2.add(dayCombo3);
  //   dayCombo.removeItem("31");
  //   // day1[30]=null;

  //   dayCombo.removeItem("30");
  //   // day1[29]=null;

  //   dayCombo.removeItem("29");
  //   // day1[28]=null;

  // }

}
}
}
