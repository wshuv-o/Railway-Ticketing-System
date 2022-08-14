import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import java.awt.*;
import java.awt.event.*;

public class paymentOptionGUI implements ActionListener{
    JTextField holderName,accNumField,expireField,cvvField;

    JButton cardPay= new JButton();
    JButton bkashPay=new JButton();
    JButton rocketPay=new JButton();

    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 35);
    paymentOptionGUI(){


        JLabel label=new JLabel("Select Payment Option");
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setPreferredSize(new Dimension(450,150));
        label.setBackground(new Color( 0xC1F4C5));
        label.setOpaque(true);
        label.setFont(myFont);

        cardPay.setPreferredSize(new Dimension(450,150));
        cardPay.setBackground(new Color(255,255,255));
        cardPay.setFocusable(false);
        // cardPay.setBorder(BorderFactory.createEtchedBorder());
        cardPay.setFont(myFont);
        cardPay.setIcon(new ImageIcon("card4.png"));
        cardPay.addActionListener(this);

        bkashPay.setPreferredSize(new Dimension(450,150));
        bkashPay.setBackground(new Color(255,255,255));
        bkashPay.setFocusable(false);
        // bkashPay.setBorder(BorderFactory.createEtchedBorder());
        bkashPay.setFont(myFont);
        bkashPay.setIcon(new ImageIcon("rsz_bkash_payment.png"));
    
        rocketPay.setPreferredSize(new Dimension(450,150));
        rocketPay.setBackground(new Color(255,255,255));
        rocketPay.setFocusable(false);
        // rocketPay.setBorder(BorderFactory.createEtchedBorder());
        rocketPay.setFont(myFont);
        rocketPay.setIcon(new ImageIcon("rocket_pay_3.png"));
    
  
        JPanel panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(500,650));
        panel1.setBackground(new Color(0xC1F4C5));
        panel1.setLayout(new GridLayout(4,1,0,5));
        panel1.setMinimumSize(new DimensionUIResource(500, 640));

        panel1.add(label);
        panel1.add(cardPay);
        panel1.add(bkashPay);
        panel1.add(rocketPay);
        
    
        JFrame frame = new JFrame();
        frame.setTitle("Card Payment");
        frame.setSize(500,675);
        frame.setMinimumSize(new Dimension(500,650));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");
    
        frame.setIconImage(image1.getImage());
        frame.add(panel1);
        frame.setLayout(new GridBagLayout());

        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-frame.getWidth()/2, y/2-frame.getHeight()/2);
    
    
        frame.getContentPane().setBackground(new Color( 0,153,153));
        frame.setVisible(true);
         
    }

    public static void main(String []args)
    {
        new paymentOptionGUI();
    }

    
	@Override
	public void actionPerformed(ActionEvent e) 
    {
       
        
    //     if(e.getSource()==bkashPay)
    //     {
    //         System.out.println("");
            

    // }
    
}
}


    

