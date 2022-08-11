package coachview;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AC_BerthSeatView extends CoachViewGUI implements ActionListener{
    public AC_BerthSeatView(){
        super(new JLabel("AC Berth Seat View"),new ImageIcon("coachview/images/AC_BERTH1.jpg"), new ImageIcon("coachview/images/AC_BERTH2.jpg"), new ImageIcon("coachview/images/AC_BERTH3.jpg"), new ImageIcon("coachview/images/AC_BERTH4.jpg"));
        super.button1.removeActionListener(this);
        super.button2.removeActionListener(this);
        super.button3.removeActionListener(this);
        super.button4.removeActionListener(this);
    }

    @Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1){


		}
		if(e.getSource()==button2){

		}
		
		if(e.getSource()==button3){

		}
		if(e.getSource()==button4){

		}
		if(e.getSource()==previous){
			frame.setVisible(false);
			//new Home();
		}
	}
}
