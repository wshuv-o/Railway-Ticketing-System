package home;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

import userprofile.Person;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SnigdhaSeatView extends CoachViewGUI{
    Person person;
	static int [][][] allButtonList= new int[5][4][50];
    public SnigdhaSeatView(Person p, int[][][] allButtonList){
        super(new JLabel("Snigdha Seat View"),new ImageIcon("images/SNIGDHA1.jpg"), new ImageIcon("images/SNIGDHA2.jpg"), new ImageIcon("images/SNIGDHA3.jpg"), new ImageIcon("images/SNIGDHA4.jpg"));
        person=p;
        SnigdhaSeatView.allButtonList=allButtonList;
        
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
