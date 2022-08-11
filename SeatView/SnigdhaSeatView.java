package coachview;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class SnigdhaSeatView extends CoachViewGUI{
    public SnigdhaSeatView(){
        super(new JLabel("Snigdha Seat View"),new ImageIcon("coachview/images/SNIGDHA1.jpg"), new ImageIcon("coachview/images/SNIGDHA2.jpg"), new ImageIcon("coachview/images/SNIGDHA3.jpg"), new ImageIcon("coachview/images/SNIGDHA4.jpg"));
        super.button1.removeActionListener(this);
        super.button2.removeActionListener(this);
        super.button3.removeActionListener(this);
        super.button4.removeActionListener(this);
    } 
}
