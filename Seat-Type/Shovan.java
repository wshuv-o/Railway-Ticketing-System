package seattype;
import trainsearch.*;
import userprofile.*;
import javax.swing.event.*;

import payment.CardPaymentGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
public class ShovanSeat extends SeatPlan implements ActionListener{
  Person person;
  Train train;
  String date;
  String seatType, from, to;
  static JButton [] button;
  public ShovanSeat(Person p, Train tr, String d, String sType, String f, String t){
        super(p, tr, d, sType, f, t);
        buttons=new JButton[50];
        for(int i = 0; i < 50; i++) { 
          buttons[i] = new JButton();
          buttons[i].setText(i+"");
          buttons[i].addActionListener(this);
        }
        SeatPlan.leftPanel.setBounds(0, 200, 133, 600);
        SeatPlan.rightPanel.setBounds(200, 200, 200, 600);
        SeatPlan.rightPanel.setLayout(new GridLayout(10,2, 10, 10));
        SeatPlan.leftPanel.setLayout(new GridLayout(10,2, 10, 10));
        ConfirmSelection.addActionListener(this);
        Seat();
    }


    public static void Seat(){

    int i = 0;
    while( i < 50) { 
    if(i%5==0){
        buttons[i].setIcon(icon);
        buttons[i].setFocusable(false);
        leftPanel.add(buttons[i], new GridLayout());
        i+=1;
      }
      else if(i%5==1){
        buttons[i].setIcon(icon);
        buttons[i].setFocusable(false);
        leftPanel.add(buttons[i], new GridLayout());
        i+=4;
      }
    }
    
    int j=2;
    while(j<50){
        if((j%2==0||j%2==1)&&(j+1)%5!=0){
          buttons[j].setIcon(icon);
          buttons[j].setFocusable(false);
          rightPanel.add(buttons[j], new GridLayout());
          j+=1;
        }
        else if((j+1)%5==0){
          buttons[j].setIcon(icon);
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
    for(int i=0; i<50; i++){
      if(e.getSource()==buttons[i]){
          buttons[i].setBackground(Color.white);
          buttons[i].setEnabled(false);
      }
  }

  for(int k=0; k<50;k++){
      if(buttons[k].getBackground()==Color.white&&buttons[k].isEnabled()==false){
          numberOfSelectedSeat[l]=String.valueOf(k+1);
          l++;
          count++;
      }
  }

  if(count>=4){
      for(int n=0; n<50; n++){
          buttons[n].setEnabled(false);
      }
  }
    if(e.getSource()==payButton){
      if(ConfirmSelection.isEnabled()==false){
        frame.setVisible(false);
        new CardPaymentGUI(person, train, date, seatType, from, to, ns);
      }else{
        JOptionPane.showMessageDialog(null, "Please confirm selection");
      }
    }
    if(e.getSource()==backButton){
      frame.setVisible(false);
      new Searchtrain(person);
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
  
  }
    // int count=0;
    // int numberOfSelectedSeat=0;
    // for(int i=0; i<50; i++){
    //     if(e.getSource()==buttons[i]){
    //         buttons[i].setBackground(Color.white);
    //         buttons[i].setEnabled(false);
    //     }
    // }

    // for(int k=0; k<50;k++){
    //     if(buttons[k].getBackground()==Color.white&&buttons[k].isEnabled()==false){
    //         count++;
    //     }
    // }

    // if(count>=4){
    //     for(int n=0; n<50; n++){
    //         buttons[n].setEnabled(false);
    //     }
    // }

    // if(e.getSource()==ConfirmSelection){
    //     for(int i=0; i<50; i++){
    //         buttons[i].setEnabled(false);
    //         ConfirmSelection.setEnabled(false);
    //         numberOfSelectedSeat=count;

    //     }
    //     System.out.println(numberOfSelectedSeat);

    // }
}

}
    

