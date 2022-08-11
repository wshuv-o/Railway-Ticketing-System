package coachview;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ShovanSeatView extends CoachViewGUI{
    public ShovanSeatView(){
        super(new JLabel("Shovan Seat View"),new ImageIcon("coachview/images/SHOVAN1.jpg"), new ImageIcon("coachview/images/SHOVAN2.jpg"), new ImageIcon("coachview/images/SHOVAN3.jpg"), new ImageIcon("coachview/images/SHOVAN4.jpg"));
        super.button1.removeActionListener(this);
        super.button2.removeActionListener(this);
        super.button3.removeActionListener(this);
        super.button4.removeActionListener(this);
    }  
}
