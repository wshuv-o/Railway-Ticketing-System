package seattype;
import trainsearch.*;
import java.awt.*;
import java.awt.Dimension;
import userprofile.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;

import payment.CardPaymentGUI;
import payment.paymentOptionGUI;

import javax.swing.*;

public class SeatPlan implements ActionListener {

  Person person;
  Train train;
  String date, seatType, from, to;
  static JButton buttons[]; 
  JFrame frame;
  JButton ConfirmSelection, payButton, backButton;
  JPanel upperPanel, upperNextPanel, whitePanel, blackPanel, cyanPanel, hiddencyanPanel, lowerPanel,  upperNextNextPanel;
  static JPanel basePanel, midPanel, rightPanel, leftPanel;
  static ImageIcon icon = new ImageIcon("chair.png");
  JLabel fromTo,Date, trainName, ticketType, selSeat, totalPrice;

  Font font= new Font("Times new Roman", Font.BOLD, 20);

public SeatPlan(Person p, Train tr, String d, String sType, String f, String t){
  person=p;
  train=tr;
  date=d;
  seatType=sType;
  from=f;
  to=t;

  ImageIcon image1 =new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/booked.png");
  ImageIcon image2 =new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/available.png");
  ImageIcon image3 =new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/Project/selected.png");



   JLabel selectedlLabel= new JLabel("Selected ");
   selectedlLabel.setIcon(image3);
   selectedlLabel.setBackground(Color.green);
   selectedlLabel.setBounds(355, 25, 150, 50);
   selectedlLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));

   JLabel reservedlLabel= new JLabel("Reserved");
   reservedlLabel.setIcon(image1);
   reservedlLabel.setBackground(Color.green);
   reservedlLabel.setBounds(485, 25, 150, 50);
   reservedlLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));

   JLabel availableLabel= new JLabel("Available");
   availableLabel.setIcon(image2);
   availableLabel.setBackground(Color.green);
   availableLabel.setBounds(625, 25, 150, 50);
   availableLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));



  fromTo= new JLabel(from+" - "+to);
  fromTo.setHorizontalAlignment(JLabel.CENTER);
  fromTo.setVerticalAlignment(JLabel.CENTER);
  fromTo.setFont(new Font("Times new Roman", Font.BOLD, 30));
  fromTo.setBounds(100, 20, 400, 50);

  Date= new JLabel("Date : "+date);
  Date.setFont(font);
  Date.setForeground(Color.black);
  Date.setBounds(100, 20, 400, 50);
  Date.setBackground(new Color(0xB8F1B0));
  Date.setOpaque(true);

  trainName= new JLabel("Train Name : "+train.getTrainName()+" "+train.getTrainId());
  trainName.setFont(font);
  trainName.setForeground(Color.black);
  trainName.setBounds(100, 90, 400, 50);
  trainName.setBackground(new Color(0xB8F1B0));
  trainName.setOpaque(true);

  ticketType= new JLabel("Ticket Type : "+seatType);
  ticketType.setFont(font);
  ticketType.setForeground(Color.black);
  ticketType.setBounds(100, 160, 400, 50);
  ticketType.setBackground(new Color(0xB8F1B0));
  ticketType.setOpaque(true);

  selSeat= new JLabel("Selected Seat : " );
  selSeat.setFont(font);
  selSeat.setForeground(Color.black);
  selSeat.setBounds(100, 230, 400, 50);
  selSeat.setBackground(new Color(0xB8F1B0));
  selSeat.setOpaque(true);

  totalPrice= new JLabel("Total Price: ");
  totalPrice.setFont(font);
  totalPrice.setForeground(Color.black);
  totalPrice.setBounds(100, 300, 400, 50);
  totalPrice.setBackground(new Color(0xB8F1B0));
  totalPrice.setOpaque(true);

  payButton = new JButton("Proceed to Pay");
  payButton.setBounds(100,370, 400, 75);
  payButton.setFont(font);
  payButton.setForeground(Color.black);
  payButton.setFocusable(false);
  payButton.setBackground(new Color(0xB8F1B0));
  payButton.setBorder(BorderFactory.createEmptyBorder());
  payButton.addActionListener(this);
  //payButton.addActionListener(this);
  
  frame = new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setSize(800, 800);
  frame.setMinimumSize(new Dimension(600,600));
  frame.setLayout(new BorderLayout());

  backButton = new JButton();
  backButton.setIcon(new ImageIcon("images/Back.png"));
  backButton.setBounds(0,0, 200, 100);
  backButton.setFocusable(false);
  backButton.setBackground(new Color(98, 174, 239));
  backButton.setBorder(BorderFactory.createEmptyBorder());
  backButton.addActionListener(this);

  

   upperPanel = new JPanel();
  upperPanel.setBackground(new Color(98, 174, 239));
  upperPanel.setBounds(0,0, 1960, 100);
  upperPanel.setLayout(null);
  upperPanel.add(backButton);

   upperNextPanel = new JPanel();
  upperNextPanel.setBackground(Color.white);
  upperNextPanel.setBounds(0,100, 1960, 100);
  upperNextPanel.setLayout(null);
  upperNextPanel.add(availableLabel);
  upperNextPanel.add(selectedlLabel);
  upperNextPanel.add(reservedlLabel);

      
   basePanel = new JPanel();
  basePanel.setBackground(Color.white);
  basePanel.setPreferredSize(new Dimension(400, 800));
  basePanel.setLayout(null);

   midPanel= new JPanel();
  midPanel.setBackground(Color.white);
  midPanel.setBounds(0, 0, 400, 200);
  midPanel.setLayout(null);
  

   leftPanel = new JPanel();
  leftPanel.setBackground(Color.white);
  leftPanel.setBounds(0, 200, 140, 600);
  leftPanel.setLayout(new GridLayout(10,2, 10, 10));

  

   rightPanel = new JPanel();
  rightPanel.setBackground(Color.white);
  rightPanel.setBounds(230, 200, 140, 600);
  rightPanel.setLayout(new GridLayout(10,2, 10, 10));

  basePanel.add(midPanel);
  basePanel.add(rightPanel);
  basePanel.add(leftPanel);


  ConfirmSelection = new JButton("Confirm Selection");
  ConfirmSelection.setBounds(358,0, 398, 70);
  ConfirmSelection.setFocusable(false);
  ConfirmSelection.setBackground(new Color(98, 174, 239));
  ConfirmSelection.setBorder(BorderFactory.createEmptyBorder());
  //ConfirmSelection.addActionListener(this);




   upperNextNextPanel = new JPanel();
  upperNextNextPanel.setBackground(Color.white);
  upperNextNextPanel.setBounds(0,820, 1960, 100);
  upperNextNextPanel.setLayout(null);
  upperNextNextPanel.add(ConfirmSelection);


   whitePanel = new JPanel();
  whitePanel.setBackground(Color.white);
  whitePanel.setPreferredSize(new Dimension(800, 800));
  whitePanel.setLayout(new FlowLayout());


  hiddencyanPanel = new JPanel();
  hiddencyanPanel.setBackground(Color.white);
  hiddencyanPanel.setPreferredSize(new Dimension(600,190));
  hiddencyanPanel.setLayout(new FlowLayout());


  blackPanel = new JPanel();
  blackPanel.setBackground(new Color(0x9FE2BF));
  blackPanel.setPreferredSize(new Dimension(600,500));
  blackPanel.setLayout(null);
  blackPanel.add(Date);
  blackPanel.add(trainName);
  blackPanel.add(ticketType);
  blackPanel.add(selSeat);
  blackPanel.add(totalPrice);
  blackPanel.add(payButton);


  cyanPanel = new JPanel();
  cyanPanel.setBackground(new Color(0x2E8B57));
  cyanPanel.setPreferredSize(new Dimension(600,100));
  cyanPanel.setLayout(null);
  cyanPanel.add(fromTo);

  whitePanel.add(hiddencyanPanel);
  whitePanel.add(cyanPanel);
  whitePanel.add(blackPanel);


  frame.add(upperPanel);
  frame.add(upperNextPanel);
  frame.add(upperNextNextPanel);
  

   lowerPanel =new JPanel();
  lowerPanel.setBackground(Color.white);
  lowerPanel.setBounds(0,100, 1960, 700);
  lowerPanel.setLayout(new FlowLayout());


  lowerPanel.add(basePanel);
  lowerPanel.add(whitePanel);
  frame.add(lowerPanel);
  frame.setVisible(true);


 }

private static void Seat(){
  buttons=new JButton[50];
  for(int i = 0; i < 50; i++) { 
    buttons[i] = new JButton(); 
  } 

  int i = 0;
  while( i < 50) { 
    if(i%2==0||i%2==2){
      buttons[i].setIcon(icon);
      buttons[i].setFocusable(false);
      leftPanel.add(buttons[i], new GridLayout());
      i+=1;
    }
    else{
      buttons[i].setIcon(icon);
      buttons[i].setFocusable(false);
      leftPanel.add(buttons[i], new GridLayout());
      i+=3;
    }
  }
  

  int j=2;
  while(j<50){
      if(j%2==0){
        buttons[j].setIcon(icon);
        buttons[j].setFocusable(false);
        rightPanel.add(buttons[j], new GridLayout());
        j+=1;
      }
      else{
        buttons[j].setIcon(icon);
        buttons[j].setFocusable(false);
        rightPanel.add(buttons[j], new GridLayout());
        j+=3;
      }
  }
}

@Override
public void actionPerformed(ActionEvent e) {
  int count=0, l=0, ns=0;
  String [] numberOfSelectedSeat= new String[4];
  String selectedSeat="";
  if(e.getSource()==payButton){
    if(ConfirmSelection.isEnabled()==false){
      frame.setVisible(false);
      new paymentOptionGUI(person, train, date, seatType, from, to, ns, null, null, ns, ns);
    }else{
      JOptionPane.showMessageDialog(null, "Please confirm selection");
    }
  }
  if(e.getSource()==backButton){
    frame.setVisible(false);
    new Searchtrain(person, null);
  }
  if(e.getSource()==ConfirmSelection){
    for(int i=0; i<20; i++){
        buttons[i].setEnabled(false);
        ConfirmSelection.setEnabled(false);
        ns=count;
    }
    for(int i=0;i<ns;i++){
        selectedSeat=selectedSeat+numberOfSelectedSeat[i]+", ";
    }
    selSeat.setText("Selected Seat : "+selectedSeat);
    totalPrice.setText("Total price : "+(ns*100));

}
  
}
}
