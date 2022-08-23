package userprofile;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ResetPasswordGUI implements ActionListener {
    Person person;
    static int [][][] allButtonList= new int[5][4][50];
    JFrame frame;
    JButton buttonConfirm= new JButton("Confirm Change");
    JButton buttonBack= new JButton("Previous");
    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 20);
    JTextField mobileNumber;
    JTextField nidField;
    JPasswordField newPass ;
    JPasswordField conPassField;
    ResetPasswordGUI(Person p, int[][][] allButtonList){
        person=p;
        ResetPasswordGUI.allButtonList=allButtonList;

        buttonConfirm.setBounds(125,405, 250, 30);
        buttonConfirm.setBackground(new Color(255,255,255));
        buttonConfirm.setFocusable(false);
        buttonConfirm.setBorder(BorderFactory.createEtchedBorder());
        buttonConfirm.setFont(myFont);
        buttonConfirm.addActionListener(this);

        buttonBack.setBounds(125,475, 250, 30);
        buttonBack.setBackground(new Color(255,255,255));
        buttonBack.setFocusable(false);
        buttonBack.setBorder(BorderFactory.createEtchedBorder());
        buttonBack.setFont(myFont);
        buttonBack.addActionListener(this);
        
    
        JLabel passLabel =new JLabel();
        passLabel.setText("New Password");
        passLabel.setBounds(125,245,200,30);
        passLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        newPass = new JPasswordField();
        newPass.setLayout(null);
        newPass.setBounds(125,265, 250, 30);
        newPass.setFont(myFont);
        newPass.setOpaque(false);
        newPass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
        JLabel conPassLabel =new JLabel();
        conPassLabel.setText("Confirm Password");
        conPassLabel.setBounds(125,315,200,30);
        conPassLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        conPassField = new JPasswordField();
       conPassField.setLayout(null);
       conPassField.setBounds(125,335, 250, 30);
       conPassField.setFont(myFont);
       conPassField.setOpaque(false);
       conPassField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel nidLabel =new JLabel();
        nidLabel.setText("NID");
        nidLabel.setBounds( 125,175,100,30);
        nidLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        nidField = new JTextField();
        nidField.setLayout(null);
        nidField.setBounds(125,195, 250, 30);
        nidField.setFont(myFont);
        nidField.setOpaque(false);
        nidField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel mobile=new JLabel();
        mobile.setText("Mobile Number");
        mobile.setBounds(125,105,200,30);
        mobile.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        mobileNumber = new JTextField();
        mobileNumber.setLayout(null);
      //mobileNumber.setBackground(new Color(20,200,20));;;
        mobileNumber.setBounds(125,125, 250, 30);
        mobileNumber.setFont(myFont);
        mobileNumber.setOpaque(false);
        mobileNumber.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
    
        JPanel panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(500,600));
        panel1.setBackground(new Color(218, 247, 166 ));
        panel1.setLayout(null);
        panel1.setMinimumSize(new DimensionUIResource(600, 1200));
        panel1.add(mobile);
        panel1.add(mobileNumber);
        panel1.add(nidLabel);
        panel1.add(nidField);
        panel1.add(passLabel);
        panel1.add(newPass);
        panel1.add(conPassLabel);
        panel1.add(conPassField);
        panel1.add(buttonConfirm);
        panel1.add(buttonBack);
    
        frame = new JFrame();
        frame.setTitle("Sign Up ");
        frame.setSize(600,720);
        frame.setMinimumSize(new Dimension(500,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");
    
        frame.setIconImage(image1.getImage());
        frame.add(panel1);
        frame.setLayout(new GridBagLayout());
    
        frame.getContentPane().setBackground(new Color( 140, 158, 255));
        frame.setVisible(true);
         
    }


    @Override
    public void actionPerformed(ActionEvent e) {
 
        if(e.getSource()==buttonConfirm){
            String mobile=mobileNumber.getText();
            String nid= nidField.getText();
            String password= String.valueOf(newPass.getPassword());
			String conPass = String.valueOf(conPassField.getPassword());
            if(password.equals(conPass)){
                if((mobile.isEmpty()!=true) && (nid.isEmpty()!=true)){
                    if(SignInPage.ChangePassword(mobile, nid, password)){
                        JOptionPane.showMessageDialog(null, "Password Changed successfully");
                    }

                frame.setVisible(false);
                new SignInPage(person, allButtonList);
                }else{
                    JOptionPane.showMessageDialog(null,  "All fills are required");
                }

            }else{JOptionPane.showMessageDialog(null, "Password Confirmation Error");}

        }
        if(e.getSource()==buttonBack){

            frame.setVisible(false);
            new SignInPage(person, allButtonList);

        }
        
    }
}
