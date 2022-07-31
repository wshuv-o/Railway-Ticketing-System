import java.awt.*;

import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.text.FlowView;
import javax.swing.*;

public class signUp {
    public static void main(String [] args)
    {
    
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
  //nameTF1.setBackground(new Color(20,200,20));;;
    nameTF1.setBounds(5,50, 200, 30);
    nameTF1.setFont(myFont);
    
    JTextField nameTF2 = new JTextField();
    nameTF2.setLayout(null);
  //nameTF2.setBackground(new Color(20,200,20));;;
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

    JLabel email =new JLabel();
    email.setText("E-Mail");
    email.setBounds(5,160,100,30);
    email.setFont(new Font("Agency FB", Font.PLAIN, 18));
    

    JTextField nidField = new JTextField();
    nidField.setLayout(null);
    nidField.setBounds(220,120, 200, 30);
    nidField.setFont(myFont);
    nidField.setOpaque(false);
    nidField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


    JTextField emailField = new JTextField();
    emailField.setLayout(null);
    emailField.setBounds(5,190, 200, 30);
    emailField.setFont(myFont);
    emailField.setOpaque(false);
    emailField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    JLabel passLabel =new JLabel();
    passLabel.setText("Password");
    passLabel.setBounds(5,220,100,30);
    passLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField pass = new JTextField();
    pass.setLayout(null);
    pass.setBounds(5,250, 200, 30);
    pass.setFont(myFont);
    pass.setOpaque(false);
    pass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

    JLabel conPassLabel =new JLabel();
    conPassLabel.setText("Confirm Password");
    conPassLabel.setBounds(220,220,100,30);
    conPassLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));

    JTextField conPassField = new JTextField();
   conPassField.setLayout(null);
   conPassField.setBounds(220,250, 200, 30);
   conPassField.setFont(myFont);
   conPassField.setOpaque(false);
   conPassField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


   JButton createAccButton =new JButton();
   createAccButton.setText("Create Account");
   createAccButton.setBounds(5,320,130,30);
   createAccButton.setBackground(new Color(250,250,250));
   //setOpaque(false);
   //createAccButton.setBorder(BorderFactory.createMatteBorder(0, 0, 4, 0, new Color(100,10,10));

   JLabel alreadyJLabel =new JLabel();
    alreadyJLabel.setText("Already have an Account?");
    alreadyJLabel.setBounds(5,360,200,30);
    alreadyJLabel.setFont(new Font("Agency FB", Font.PLAIN, 18));


   JButton createSignInButton =new JButton();
   createSignInButton.setText("Sign In");
   createSignInButton.setBounds(120,360,90,30);
   createSignInButton.setAlignmentX(JButton.LEFT_ALIGNMENT);
   createSignInButton.setBackground(new Color(250,250,250));

   createSignInButton.setOpaque(false);
   createSignInButton.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 0, new Color(100,10,10)));

    
    JPanel panel1=new JPanel();
    panel1.setPreferredSize(new Dimension(400,600));
    panel1.setBackground(new Color(2, 247, 166 ));
    panel1.setLayout(null);


    JPanel panel2= new JPanel();
    panel2.setPreferredSize(new Dimension(500,600));
    panel2.setBackground(new Color(218, 247, 166 ));
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
    panel2.add(conPassField);
    panel2.add(conPassLabel);
    panel2.add(createAccButton);
    panel2.add(createSignInButton);
    panel2.add(alreadyJLabel);

    panel2.setMinimumSize(new DimensionUIResource(400, 400));



   
    JFrame frame = new JFrame();
    frame.setTitle("Sign Up ");
    frame.setSize(600,720);
    frame.setMinimumSize(new Dimension(400,500));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");

    frame.setIconImage(image1.getImage());
    frame.add(panel1);
    frame.add(panel2);
    frame.setLayout(new GridBagLayout());

    frame.getContentPane().setBackground(new Color( 140, 158, 255));
    frame.setVisible(true);
    
}
}


