package seattype;
import trainsearch.*;
import payment.*;
import javax.swing.event.*;
import userprofile.Person;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;

public class AcSeat extends SeatPlan implements ActionListener{
    static JButton []buttons;
   public AcSeat(Person p, Train tr, String d, String sType, String f, String t){
    super(p, tr, d, sType, f, t);
    SeatPlan.rightPanel.setLayout(new GridLayout(10,2, 20, 20));
    buttons=new JButton[50];
    for(int i = 0; i < 50; i++) { 
        buttons[i] = new JButton(); 
        buttons[i].setText(i+1+""); 
        buttons[i].addActionListener(this); 

    }
    ConfirmSelection.addActionListener(this);
    backButton.addActionListener(this);
    Seat();
    }

    public static void Seat(){
        int j=0;
        while(j<20){
                buttons[j].setIcon(icon);
                buttons[j].setFocusable(false);
                rightPanel.add(buttons[j], new GridLayout());
                j+=1;
        }
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        int count=0, l=0, ns=0;
        String [] numberOfSelectedSeat= new String[4];
        String selectedSeat="";
        for(int i=0; i<20; i++){
            if(e.getSource()==buttons[i]){
                buttons[i].setBackground(Color.white);
                buttons[i].setEnabled(false);
            }
        }

        for(int k=0; k<20;k++){
            if(buttons[k].getBackground()==Color.white&&buttons[k].isEnabled()==false){
                numberOfSelectedSeat[l]=String.valueOf(k+1);
                l++;
                count++;
            }
        }

        if(count>=4){
            for(int n=0; n<20; n++){
                buttons[n].setEnabled(false);
            }
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
