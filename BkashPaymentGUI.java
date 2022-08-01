import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.*;

public class BkashPaymentGUI {

    JButton buttonPay= new JButton("Pay");
    JButton buttonBack= new JButton("Other Payment Method");
    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 15);
    BkashPaymentGUI(){
        buttonPay.setBounds(125,305, 250, 30);
        buttonPay.setBackground(new Color(255,255,255));
        buttonPay.setFocusable(false);
        buttonPay.setBorder(BorderFactory.createEtchedBorder());
        buttonPay.setFont(myFont);

        buttonBack.setBounds(125,375, 250, 30);
        buttonBack.setBackground(new Color(255,255,255));
        buttonBack.setFocusable(false);
        buttonBack.setBorder(BorderFactory.createEtchedBorder());
        buttonBack.setFont(myFont);

        
        JLabel pinLabel =new JLabel();
        pinLabel.setText("PIN");
        pinLabel.setBounds( 125,175,200,30);
        pinLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField pinField = new JTextField();
        pinField.setLayout(null);
        pinField.setBounds(125,195, 250, 30);
        pinField.setFont(myFont);
        pinField.setOpaque(false);
        pinField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel mobile=new JLabel();
        mobile.setText("Mobile Number");
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
        panel1.add(pinLabel);
        panel1.add(pinField);
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
        new BkashPaymentGUI();
    }
}


    


