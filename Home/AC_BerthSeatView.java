package home;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import userprofile.Person;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AC_BerthSeatView extends CoachViewGUI implements ActionListener{
	Person person;
	static int [][][] allButtonList= new int[5][4][50];
    public AC_BerthSeatView(Person p, int[][][] allButtonList){
        super(new JLabel("AC Berth Seat View"),new ImageIcon("images/AC_BERTH1.jpg"), new ImageIcon("images/AC_BERTH2.jpg"), new ImageIcon("images/AC_BERTH3.jpg"), new ImageIcon("images/AC_BERTH4.jpg"));
		
		person=p;
		AC_BerthSeatView.allButtonList=allButtonList;

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
			frame.setVisible(false);
			new Home(person, allButtonList);
		}
	}
}
