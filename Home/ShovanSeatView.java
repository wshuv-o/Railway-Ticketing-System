package home;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import userprofile.Person;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ShovanSeatView extends CoachViewGUI{
    Person person;
	static int [][][] allButtonList= new int[5][4][50];
    public ShovanSeatView(Person p, int[][][] allButtonList){
        super(new JLabel("Shovan Seat View"),new ImageIcon("images/SHOVAN1.jpg"), new ImageIcon("images/SHOVAN2.jpg"), new ImageIcon("images/SHOVAN3.jpg"), new ImageIcon("images/SHOVAN4.jpg"));
        person=p;
        ShovanSeatView.allButtonList=allButtonList;
        
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
