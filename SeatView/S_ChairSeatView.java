package coachview;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class S_ChairSeatView extends CoachViewGUI{
    public S_ChairSeatView(){
        super(new JLabel("S_Chair Seat View"),new ImageIcon("coachview/images/S_CHAIR1.jpg"), new ImageIcon("coachview/images/S_CHAIR2.jpg"), new ImageIcon("coachview/images/S_CHAIR3.jpg"), new ImageIcon("coachview/images/S_CHAIR5.jpg"));
        super.button1.removeActionListener(this);
        super.button2.removeActionListener(this);
        super.button3.removeActionListener(this);
        super.button4.removeActionListener(this);
    }
}
