package payment;
import trainsearch.*;
import javax.swing.*;
import userprofile.*;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CardPaymentGUI implements ActionListener {
    Person person;
    Train train;
    String date;
    String seatType;
    String from;
    String to;
    int ns;
    static int indexOfDate;
    static int indexOfSeatType;
    JFrame frame;
    int []ArrayOfSelectedSeats=new int[4];
    static int [][][] allButtonList= new int[5][4][50];
    JTextField cvvField, mobileNumber, nidField, expireField, accNumField, accHolderNameField;



    JButton buttonPay= new JButton("Pay");
    JButton buttonBack=new JButton("Other Payment Method");
    Font myFont = new Font("BankGothic Md BT", Font.PLAIN, 15);

    CardPayment[] cardlist =new CardPayment[]{new CardPayment("Shakib Hasan Jim",	"0044554678969512"	,"456","2026/07", 1000),
    new CardPayment("Wahid Shuva",	"1478258936981236"	,"058",	"2026/04",1000),
    new CardPayment("Somoya Malik",	"0258741032149541",	"753",	"2022/03",	1000),
    new CardPayment("Sabbir Rumman",	"6541235478943257",	"056",	"2023/05",	1000), 
    new CardPayment("Sheikh Mahedi",	"6579145965781248",	"789",	"2024/06",	1000),
    new CardPayment("Sumaiya Malik",	"5444555454484844",	"456",	"2026/05",	1000),
    new CardPayment("Humaiya Kabir",	"5644484848488444",	"564",	"2024/09",	1000),
    new CardPayment("Imtiaj Alam Sajin",	"5555544478942125",	"954",	"2024/04",	1000),
    new CardPayment("Rafsana Haque",	"4544454485963245",	"555",	"2025/05",	1000),
    new CardPayment("Sarwar Shakib",	"8888877421245648",	"974",	"2025/04",	1000),
    new CardPayment("Sazinia Alam",	"4444446464694568",	"444",	"2026/06",	1000),
    new CardPayment("Nidan Alam",	"3525632463642454",	"557",	"2024/04",	1000),
    new CardPayment("Eman Hasnat",	"3752587545875287",	"324",	"2026/03",	1000),
    new CardPayment("1",	"1",	"1",	"1",	1000)};

    public CardPaymentGUI(Person p, Train tr, String d, String sType, String f, String t, int n, int[] arrayOfSelectedSeats, int[][][] allButtonList2, int indexOfDate, int indexOfSeatType){
        person=p;
        train=tr;
        date=d;
        seatType=sType;
        from=f;
        to=t;
        ns=n;
        CardPaymentGUI.indexOfDate=indexOfDate;
        CardPaymentGUI.indexOfSeatType=indexOfSeatType;
        ArrayOfSelectedSeats=arrayOfSelectedSeats;
        CardPaymentGUI.allButtonList=allButtonList2;


        buttonPay.setBounds(125,405, 250, 30);
        buttonPay.setBackground(new Color(255,255,255));
        buttonPay.setFocusable(false);
        buttonPay.setBorder(BorderFactory.createEtchedBorder());
        buttonPay.setFont(myFont);
        buttonPay.addActionListener(this);

        buttonBack.setBounds(125,475, 250, 30);
        buttonBack.setBackground(new Color(255,255,255));
        buttonBack.setFocusable(false);
        buttonBack.setBorder(BorderFactory.createEtchedBorder());
        buttonBack.setFont(myFont);
        buttonBack.addActionListener(this);




        JLabel cvvLabel =new JLabel();
        cvvLabel.setText("CVV");
        cvvLabel.setBounds(125,245,200,30);
        cvvLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

         cvvField = new JTextField();
        cvvField.setLayout(null);
        cvvField.setBounds(125,265, 250, 30);
        cvvField.setFont(myFont);
        cvvField.setOpaque(false);
        cvvField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));

        JLabel expireLabel =new JLabel();
        expireLabel.setText("Expire Date");
        expireLabel.setBounds(125,315,200,30);
        expireLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

         expireField = new JTextField();
       expireField.setLayout(null);
       expireField.setBounds(125,335, 250, 30);
       expireField.setFont(myFont);
       expireField.setOpaque(false);
       expireField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


        JLabel nidLabel =new JLabel();
        nidLabel.setText("Account Number");
        nidLabel.setBounds( 125,175,200,30);
        nidLabel.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

        accNumField = new JTextField();
        accNumField.setLayout(null);
        accNumField.setBounds(125,195, 250, 30);
        accNumField.setFont(myFont);
        accNumField.setOpaque(false);
        accNumField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));


        JLabel mobile=new JLabel();
        mobile.setText("Account Holder Name");
        mobile.setBounds(125,105,300,30);
        mobile.setFont(new Font("BankGothic Md BT", Font.PLAIN, 18));

        accHolderNameField = new JTextField();
        accHolderNameField.setLayout(null);
      accHolderNameField.setBounds(125,125, 250, 30);
      accHolderNameField.setFont(myFont);
      accHolderNameField.setOpaque(false);
      accHolderNameField.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0, new Color(10,10,10)));



        JPanel panel1= new JPanel();
        panel1.setPreferredSize(new Dimension(500,600));
        panel1.setBackground(new Color(218, 247, 166 ));
        panel1.setLayout(null);
        panel1.setMinimumSize(new DimensionUIResource(600, 1200));
        panel1.add(mobile);
        panel1.add(accHolderNameField);
        panel1.add(nidLabel);
        panel1.add(accNumField);
        panel1.add(cvvLabel);
        panel1.add(cvvField);
        panel1.add(expireLabel);
        panel1.add(expireField);
        panel1.add(buttonPay);
        panel1.add(buttonBack);

        frame = new JFrame();
        frame.setTitle("Sign Up ");
        frame.setSize(600,720);
        frame.setMinimumSize(new Dimension(500,600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ImageIcon image1 =new ImageIcon("images/Bangladesh_railway_logo.png");

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
    @Override
    public void actionPerformed(ActionEvent e) {

        String holderName=accHolderNameField.getText();
        String accNum=accNumField.getText();
        String cvv=cvvField.getText();
        String expireDate=expireField.getText();
        int f=2;

        if(e.getSource()==buttonPay){
            for(int i=0; i<cardlist.length; i++){
				if(cardlist[i]!=null){
                                if( holderName.equals(cardlist[i].getCardHolderName())){
                                            if( accNum.equals(cardlist[i].getCardNumber())){
                                                    if(cvv.equals(cardlist[i].getCardCVV())){
                                                            if( expireDate.equals(cardlist[i].getCardValidThrough()))
                                                                {
                                                                    if(cardlist[i].deductBalance(ns*100)){
                                                                    frame.setVisible(false);
                                                                    new TemproraryPage(person, train, date, seatType, from, to, ns, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);
                                                                    }else{
                                                                        JOptionPane.showMessageDialog(null, "Insufficient Balance!");
                                                                        
                                                                    }
                                                                    break;
                                                                }else{f=1;}
                                                    }else{f=1;}
                                            }else{f=1;}
                                }else{f=1; }
			    }else{}
            }
            
            if(f==1){JOptionPane.showMessageDialog(null, "Card not found!");}
        }

        if(e.getSource()==buttonBack){
            frame.setVisible(false);
            new paymentOptionGUI(person, train, date, seatType, from, to, ns, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);
        }
    }
}