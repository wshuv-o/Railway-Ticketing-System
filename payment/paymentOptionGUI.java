package payment;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import trainsearch.Train;
import userprofile.Person;

import java.awt.*;
import java.awt.event.*;

public class paymentOptionGUI implements ActionListener{
    Person person;
    Train train;
    String date;
    String seatType;
    String from;
    String to;
    int ns;
    static int indexOfDate;
    static int indexOfSeatType;
    int []ArrayOfSelectedSeats=new int[4];
    static int [][][] allButtonList= new int[5][4][50];

    JTextField holderName,accNumField,expireField,cvvField;

    JButton cardPay= new JButton();
    JButton bkashPay=new JButton();
    JButton rocketPay=new JButton();
    JFrame frame;

    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 35);
    public paymentOptionGUI(Person person, Train train, String date, String seatType, String from, String to, int ns, int[] arrayOfSelectedSeats, int[][][] allButtonList2, int indexOfDate, int indexOfSeatType){
        this.person=person;
        this.train=train;
        this.date=date;
        this.seatType=seatType;
        this.from=from;
        this.to=to;
        this.ns=ns;
        paymentOptionGUI.indexOfDate=indexOfDate;
        paymentOptionGUI.indexOfSeatType=indexOfSeatType;
        this.ArrayOfSelectedSeats=arrayOfSelectedSeats;
        paymentOptionGUI.allButtonList=allButtonList2;


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
        cardPay.setIcon(new ImageIcon("C:/Users/Shuvo/OneDrive/Documents/Eticketing - Copy/images/card4.png"));
        cardPay.addActionListener(this);

        bkashPay.setPreferredSize(new Dimension(450,150));
        bkashPay.setBackground(new Color(255,255,255));
        bkashPay.setFocusable(false);
        // bkashPay.setBorder(BorderFactory.createEtchedBorder());
        bkashPay.setFont(myFont);
        bkashPay.setIcon(new ImageIcon("C:/Users/Shuvo/OneDrive/Documents/Eticketing - Copy/images/rsz_bkash_payment.png"));
        bkashPay.addActionListener(this);
    
        rocketPay.setPreferredSize(new Dimension(450,150));
        rocketPay.setBackground(new Color(255,255,255));
        rocketPay.setFocusable(false);
        // rocketPay.setBorder(BorderFactory.createEtchedBorder());
        rocketPay.setFont(myFont);
        rocketPay.setIcon(new ImageIcon("C:/Users/Shuvo/OneDrive/Documents/Eticketing - Copy/images/rocket_pay_3.png"));
        rocketPay.addActionListener(this);
    
  
        JPanel panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(500,650));
        panel1.setBackground(new Color(0xC1F4C5));
        panel1.setLayout(new GridLayout(4,1,0,5));
        panel1.setMinimumSize(new DimensionUIResource(500, 640));

        panel1.add(label);
        panel1.add(cardPay);
        panel1.add(bkashPay);
        panel1.add(rocketPay);
        
    
        frame = new JFrame();
        frame.setTitle("Card Payment");
        frame.setSize(500,675);
        frame.setMinimumSize(new Dimension(500,650));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ImageIcon image1 =new ImageIcon("images/Bangladesh_railway_logo.png");
    
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


    

    
	@Override
	public void actionPerformed(ActionEvent e) 
    {
       
        if(e.getSource()==bkashPay)
        {
            frame.setVisible(false);
            new BkashPaymentGUI(person, train, date, seatType, from, to, ns, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);
        }

        if(e.getSource()==rocketPay)
        {
            frame.setVisible(false);
            new BkashPaymentGUI(person, train, date, seatType, from, to, ns, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);
        }

        if(e.getSource()==cardPay)
        {
            frame.setVisible(false);
            new CardPaymentGUI(person, train, date, seatType, from, to, ns, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);

        }
   
    
}
}