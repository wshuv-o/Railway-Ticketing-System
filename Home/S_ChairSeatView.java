package home;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import userprofile.Person;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class S_ChairSeatView extends CoachViewGUI implements ActionListener{
    Person person;
	static int [][][] allButtonList= new int[5][4][50];
    public S_ChairSeatView(Person p, int[][][] allButtonList){
        super(new JLabel("S_Chair Seat View"),new ImageIcon("images/S_CHAIR1.jpg"), new ImageIcon("images/S_CHAIR2.jpg"), new ImageIcon("images/S_CHAIR3.jpg"), new ImageIcon("images/S_CHAIR5.jpg"));
        person=p;
        S_ChairSeatView.allButtonList=allButtonList;
        super.button1.removeActionListener(this);
        super.button2.removeActionListener(this);
        super.button3.removeActionListener(this);
        super.button4.removeActionListener(this);


    }
    @Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==button1){}
		if(e.getSource()==button2){}	
		if(e.getSource()==button3){}
		if(e.getSource()==button4){}
		if(e.getSource()==previous){
			super.frame.setVisible(false);
			new Home(person, allButtonList);
		}
	}
}
