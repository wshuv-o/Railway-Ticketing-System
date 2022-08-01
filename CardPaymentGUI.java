import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.*;

public class CardPaymentGUI {

    JButton buttonPay= new JButton("Pay");
    JButton buttonBack=new JButton("Other Payment Method");
    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 15);
    CardPaymentGUI(){
        buttonPay.setBounds(125,405, 250, 30);
        buttonPay.setBackground(new Color(255,255,255));
        buttonPay.setFocusable(false);
        buttonPay.setBorder(BorderFactory.createEtchedBorder());
        buttonPay.setFont(myFont);

        buttonBack.setBounds(125,475, 250, 30);
        buttonBack.setBackground(new Color(255,255,255));
        buttonBack.setFocusable(false);
        buttonBack.setBorder(BorderFactory.createEtchedBorder());
        buttonBack.setFont(myFont);

        
    
        JLabel cvvLabel =new JLabel();
        cvvLabel.setText("CVV");
        cvvLabel.setBounds(125,245,200,30);
        cvvLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField cvvField = new JTextField();
        cvvField.setLayout(null);
        cvvField.setBounds(125,265, 250, 30);
        cvvField.setFont(myFont);
        cvvField.setOpaque(false);
        cvvField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
        JLabel expireLabel =new JLabel();
        expireLabel.setText("Expire Date");
        expireLabel.setBounds(125,315,200,30);
        expireLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField expireField = new JTextField();
       expireField.setLayout(null);
       expireField.setBounds(125,335, 250, 30);
       expireField.setFont(myFont);
       expireField.setOpaque(false);
       expireField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel nidLabel =new JLabel();
        nidLabel.setText("Account Number");
        nidLabel.setBounds( 125,175,200,30);
        nidLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField nidField = new JTextField();
        nidField.setLayout(null);
        nidField.setBounds(125,195, 250, 30);
        nidField.setFont(myFont);
        nidField.setOpaque(false);
        nidField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel mobile=new JLabel();
        mobile.setText("Account Holder Name");
        mobile.setBounds(125,105,300,30);
        mobile.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField mobileNumber = new JTextField();
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
        panel1.add(cvvLabel);
        panel1.add(cvvField);
        panel1.add(expireLabel);
        panel1.add(expireField);
        panel1.add(buttonPay);
        panel1.add(buttonBack);
    
        JFrame frame = new JFrame();
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

    public static void main(String []args)
    {
        new CardPaymentGUI();
    }
}

    

