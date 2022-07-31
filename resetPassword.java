import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.*;

public class resetPassword {
    JButton buttonConfirm= new JButton("Confirm Change");
    JButton buttonBack= new JButton("Previous");
    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 20);
    resetPassword(){
        buttonConfirm.setBounds(125,405, 250, 30);
        buttonConfirm.setBackground(new Color(255,255,255));
        buttonConfirm.setFocusable(false);
        buttonConfirm.setBorder(BorderFactory.createEtchedBorder());
        buttonConfirm.setFont(myFont);

        buttonBack.setBounds(125,475, 250, 30);
        buttonBack.setBackground(new Color(255,255,255));
        buttonBack.setFocusable(false);
        buttonBack.setBorder(BorderFactory.createEtchedBorder());
        buttonBack.setFont(myFont);

        
    
        JLabel passLabel =new JLabel();
        passLabel.setText("New Password");
        passLabel.setBounds(125,245,200,30);
        passLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField pass = new JTextField();
        pass.setLayout(null);
        pass.setBounds(125,265, 250, 30);
        pass.setFont(myFont);
        pass.setOpaque(false);
        pass.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
        JLabel conPassLabel =new JLabel();
        conPassLabel.setText("Confirm Password");
        conPassLabel.setBounds(125,315,200,30);
        conPassLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField conPassField = new JTextField();
       conPassField.setLayout(null);
       conPassField.setBounds(125,335, 250, 30);
       conPassField.setFont(myFont);
       conPassField.setOpaque(false);
       conPassField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel nidLabel =new JLabel();
        nidLabel.setText("NID");
        nidLabel.setBounds( 125,175,100,30);
        nidLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));
    
        JTextField nidField = new JTextField();
        nidField.setLayout(null);
        nidField.setBounds(125,195, 250, 30);
        nidField.setFont(myFont);
        nidField.setOpaque(false);
        nidField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));
    
    
        JLabel mobile=new JLabel();
        mobile.setText("Mobile Number");
        mobile.setBounds(125,105,200,30);
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
        panel1.add(passLabel);
        panel1.add(pass);
        panel1.add(conPassLabel);
        panel1.add(conPassField);
        panel1.add(buttonConfirm);
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
        new resetPassword();
    }
}
