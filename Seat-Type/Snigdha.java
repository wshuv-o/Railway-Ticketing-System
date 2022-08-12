package seattype;
import trainsearch.*;
import userprofile.*;
import javax.swing.JButton;

import payment.CardPaymentGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class SnigdhaSeat extends SeatPlan implements ActionListener {
  static JButton buttons[];
 public SnigdhaSeat(Person p, Train tr, String d, String sType, String f, String t){
        super(p, tr, d, sType, f, t);
        buttons=new JButton[50];
        for(int i = 0; i < 50; i++) { 
          buttons[i] = new JButton();
          buttons[i].setText(i+1+"");
          buttons[i].addActionListener(this);
        }
        
        SeatPlan.rightPanel.setLayout(new GridLayout(10,2, 10, 10));
        SeatPlan.leftPanel.setLayout(new GridLayout(10,2, 10, 10));
        ConfirmSelection.addActionListener(this);
        Seat();
    }
    // public static void main(String[] args) {
    //     new SnigdhaSeat();
    // }

    public static void Seat(){

    int i = 0;
    while( i < 40) { 
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
    while(j<40){
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
      for(int i=0; i<40; i++){
          if(e.getSource()==buttons[i]){
              buttons[i].setBackground(Color.white);
              buttons[i].setEnabled(false);
          }
      }

      for(int k=0; k<40;k++){
          if(buttons[k].getBackground()==Color.white&&buttons[k].isEnabled()==false){
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

      if(e.getSource()==ConfirmSelection){
          for(int i=0; i<40; i++){
              buttons[i].setEnabled(false);
              ConfirmSelection.setEnabled(false);
              ns=count;
          }
          for(int i=0;i<ns;i++){
              selectedSeat=selectedSeat+numberOfSelectedSeat[i]+", ";
          }
          super.selSeat.setText("Selected Seat : "+selectedSeat);
          super.totalPrice.setText("Total price : "+(ns*100));

      }
      if(e.getSource()==backButton){
          frame.setVisible(false);
          new Searchtrain(person);
      }
      if(e.getSource()==payButton){
          if(ConfirmSelection.isEnabled()==false){
            frame.setVisible(false);
            new CardPaymentGUI(person, train, date, seatType, from, to, ns);
          }else{
            JOptionPane.showMessageDialog(null, "Please confirm selection");
          }
      }
      
    }
    
}
