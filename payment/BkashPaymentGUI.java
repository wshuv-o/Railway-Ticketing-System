package payment;
import userprofile.*;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

import trainsearch.Train;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BkashPaymentGUI implements ActionListener {
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
    JTextField mobileNumber, pinField;

    JFrame frame;
    JButton buttonPay= new JButton("Pay");
    JButton buttonBack= new JButton("Other Payment Method");
    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 15);

    static MobileBankingPayment[] mobileBankList =new MobileBankingPayment[]{
        new MobileBankingPayment("01512345678","56497",200),
        new MobileBankingPayment("01765646564","55646",500),
        new MobileBankingPayment("01646446464","86454",500),
        new MobileBankingPayment("01954515151","54555",500),
        new MobileBankingPayment("01714656464","66464",500),
        new MobileBankingPayment("01346465464","75984",500),
        new MobileBankingPayment("01946464646","54454",500),
        new MobileBankingPayment("01664646455","15116",500),
        new MobileBankingPayment("01665646464","15616",500),
        new MobileBankingPayment("01894949749","84844",500),
        new MobileBankingPayment("01746464646","15545",500),
        new MobileBankingPayment("01614494949","16161",500),
        new MobileBankingPayment("01864464668","66164",500),
        new MobileBankingPayment("01644946464","64646",500)};

    public BkashPaymentGUI(Person p, Train train, String date, String seatType, String from, String to, int ns, int[] arrayOfSelectedSeats, int[][][] allButtonList2, int indexOfDate, int indexOfSeatType){

        this.person=p;
        this.train=train;
        this.date=date;
        this.seatType=seatType;
        this.from=from;
        this.to=to;
        this.ns=ns;
        BkashPaymentGUI.indexOfDate=indexOfDate;
        BkashPaymentGUI.indexOfSeatType=indexOfSeatType;
        ArrayOfSelectedSeats=arrayOfSelectedSeats;
        BkashPaymentGUI.allButtonList=allButtonList2;

        buttonPay.setBounds(125,305, 250, 30);
        buttonPay.setBackground(new Color(255,255,255));
        buttonPay.setFocusable(false);
        buttonPay.setBorder(BorderFactory.createEtchedBorder());
        buttonPay.setFont(myFont);
        buttonPay.addActionListener(this);

        buttonBack.setBounds(125,375, 250, 30);
        buttonBack.setBackground(new Color(255,255,255));
        buttonBack.setFocusable(false);
        buttonBack.setBorder(BorderFactory.createEtchedBorder());
        buttonBack.setFont(myFont);
        buttonBack.addActionListener(this);



        JLabel pinLabel =new JLabel();
        pinLabel.setText("PIN");
        pinLabel.setBounds( 125,175,200,30);
        pinLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

         pinField = new JTextField();
        pinField.setLayout(null);
        pinField.setBounds(125,195, 250, 30);
        pinField.setFont(myFont);
        pinField.setOpaque(false);
        pinField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


        JLabel mobile=new JLabel();
        mobile.setText("Mobile Number");
        mobile.setBounds(125,105,300,30);
        mobile.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

         mobileNumber = new JTextField();
        mobileNumber.setLayout(null);
      //mobileNumber.setBackground(new Color(20,200,20));
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

         frame = new JFrame();
        frame.setTitle("Sign Up ");
        frame.setSize(600,720);
        frame.setMinimumSize(new Dimension(500,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image1 =new ImageIcon("Bangladesh_railway_logo.png");

        frame.setIconImage(image1.getImage());
        frame.add(panel1);
        frame.setLayout(new GridBagLayout());

        Toolkit tk=Toolkit.getDefaultToolkit();
        int x=(int) tk.getScreenSize().getWidth();
        int y=(int) tk.getScreenSize().getHeight();
        frame.setLocation(x/2-frame.getWidth()/2, y/2-frame.getHeight()/2);

        frame.getContentPane().setBackground(new Color( 140, 158, 255));
        frame.setVisible(true);

    }
public static void main(String[] args) {
    //new BkashPaymentGUI(p)
}
    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        String pin=pinField.getText();
        String mNumber=mobileNumber.getText();

       // MobileBankingPayment mobileBank= new MobileBankingPayment(mobileNumber, pin);


        if(e.getSource()==buttonPay)
        {
            for(int j=0; j<mobileBankList.length; j++){
				if(mobileBankList[j]!=null){
					if( mNumber.equals(mobileBankList[j].getmobileNumber())){
						if( pin.equals(mobileBankList[j].getpin())){
                            if(mobileBankList[j].deductBalance(ns*100)){
                            frame.setVisible(false);
                            new TemproraryPage(this.person, this.train, this.date, this.seatType, this.from, this.to, this.ns, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);
                            }
                            break;
						}
					}
                    else{
                        JOptionPane.showMessageDialog(null, "Wrong Credentials!");break;
                    }
				}

                
			}
			
        }

        if(e.getSource()==buttonBack){
            frame.setVisible(false);
            new paymentOptionGUI(this.person, this.train, this.date, this.seatType, this.from, this.to, this.ns, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);
        } 
    }
}
