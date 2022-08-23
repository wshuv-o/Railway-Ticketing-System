package seattype;
import trainsearch.*;
import userprofile.*;
import payment.*;
import javax.swing.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class S_Chair extends SeatPlan implements ActionListener{
  Person person;
  Train train;
  String date;
  String seatType, from, to;
  static int indexOfDate=0;
  static int indexOfSeatType=0;
  static JButton [] button;
  static int [][][] allButtonList= new int[5][4][50];
  int[] ArrayOfSelectedSeats=new int[4];
  Color color=new Color(98, 174, 239);
  static Color colorgreen= new Color(0x2E8B57);

  public S_Chair(Person p, Train tr, String d, String sType, String f, String t, int[][][] allButtonList, int indexOfDate, int indexOfSeatType){
      super(p, tr, d, sType, f, t);
      person=p;
      train=tr;
      date=d;
      seatType=sType;
      from=f;
      to=t;
      S_Chair.indexOfDate=indexOfDate;
      S_Chair.indexOfSeatType=indexOfSeatType;
      S_Chair.allButtonList=allButtonList;

      System.out.println("indexxxx: "+indexOfDate);
      System.out.println("indexxxx: "+indexOfSeatType);

      buttons=new JButton[50];
      for(int i = 0; i < 50; i++) { 
        buttons[i] = new JButton();
        buttons[i].setText(i+1+""); 
        buttons[i].addActionListener(this);
      }
      Seat();
      for(int i=0; i<50;i++){
        if(allButtonList[indexOfDate][indexOfSeatType][i]!=0){
          buttons[allButtonList[S_Chair.indexOfDate][S_Chair.indexOfSeatType][i]%100].setEnabled(false);
          buttons[allButtonList[S_Chair.indexOfDate][S_Chair.indexOfSeatType][i]%100].setBackground(Color.red);
        }
      }
      SeatPlan.rightPanel.setLayout(new GridLayout(10,2, 10, 10));
      SeatPlan.leftPanel.setLayout(new GridLayout(10,2, 10, 10));
      ConfirmSelection.addActionListener(this);

    }

    public static void Seat(){
    int i = 0;
    while( i < 40) { 
      if(i%2==0||i%2==2){
        buttons[i].setIcon(icon);
        buttons[i].setBackground(colorgreen);
        buttons[i].setFocusable(false);
        leftPanel.add(buttons[i], new GridLayout());
        i+=1;
      }
      else{
        buttons[i].setIcon(icon);
        buttons[i].setBackground(colorgreen);
        buttons[i].setFocusable(false);
        leftPanel.add(buttons[i], new GridLayout());
        i+=3;
      }
    }
  

    int j=2;
    while(j<40){
        if(j%2==0){
          buttons[j].setIcon(icon);
          buttons[j].setBackground(colorgreen);
          buttons[j].setFocusable(false);
          rightPanel.add(buttons[j], new GridLayout());
          j+=1;
        }
        else{
          buttons[j].setIcon(icon);
          buttons[j].setBackground(colorgreen);
          buttons[j].setFocusable(false);
          rightPanel.add(buttons[j], new GridLayout());
          j+=3;
        }
    }

    }

public void actionPerformed(ActionEvent e) {
  int count=0, l=0, ns=0;
  String [] numberOfSelectedSeat= new String[4];
  String selectedSeat="";
  for(int i=0; i<40; i++){
      if(e.getSource()==buttons[i]){
          buttons[i].setBackground(color);
          buttons[i].setEnabled(false);
      }
  }

  for(int k=0; k<40;k++){
      if(buttons[k].getBackground()==color&&buttons[k].isEnabled()==false){
          numberOfSelectedSeat[l]=String.valueOf(k+1);
          l++;
          count++;
      }
  }

  if(count>=4){
      for(int n=0; n<40; n++){
          buttons[n].setEnabled(false);
      }
  }
  if(e.getSource()==payButton){
    if(ConfirmSelection.isEnabled()==false){
      frame.setVisible(false);
      new paymentOptionGUI(person, train, date, seatType, from, to, count, ArrayOfSelectedSeats, allButtonList, indexOfDate, indexOfSeatType);
    }else{
      JOptionPane.showMessageDialog(null, "Please confirm selection");
    }
  }
  if(e.getSource()==backButton){
      frame.setVisible(false);
      new Searchtrain(person, allButtonList);
  }

  if(e.getSource()==ConfirmSelection){
    for(int i=0; i<50; i++){
        buttons[i].setEnabled(false);
        ConfirmSelection.setEnabled(false);
        ns=count;
    }
    for(int i=0;i<ns;i++){
        selectedSeat=selectedSeat+numberOfSelectedSeat[i]+", ";
    }
    selSeat.setText("Selected Seat : "+selectedSeat);
    totalPrice.setText("Total price : "+(ns*100));

    for(int f=0; f<numberOfSelectedSeat.length;f++){
      if(numberOfSelectedSeat[f]!=null){
        if(Integer.parseInt(numberOfSelectedSeat[f])-1==0){
          ArrayOfSelectedSeats[f]=100;
        }
        else{
        ArrayOfSelectedSeats[f]=Integer.parseInt(numberOfSelectedSeat[f])-1;
        }
      } 
    }
  }
}
}
