package AdminSite;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AStationList implements  ActionListener{

	public JButton button1, button2, previous;
	JMenuItem item1,item2,item3;
	JFrame frame;
	JPanel upperPanel,lowerPanel;
	JMenuBar menu;
	ImageIcon image1,image2,image3,image4;
	JLabel label;
	
	AStationList(){

		
		
		
		button1= new JButton("Add Station");
		button2= new JButton("Delete Station");
	
	

		button1.setIcon(new ImageIcon("rsz_add.png"));
		button1.setBackground(Color.white);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setIconTextGap(20);
		button1.setFont(new Font("Times new roman", Font.BOLD, 25));
		button1.setFocusable(false);
		button1.addActionListener(this);


		button2.setIcon(new ImageIcon("rsz_trash.png"));
		button2.setBackground(Color.white);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setIconTextGap(20);
		button2.setFont(new Font("Times new roman", Font.BOLD, 25));
		button2.setFocusable(false);
		button2.addActionListener(this);


		previous= new JButton("                                                               ");
		previous.setHorizontalTextPosition(JMenu.CENTER);
		previous.setBackground(new Color(98, 174, 239));
		previous.setFocusable(false);
		previous.setIcon(new ImageIcon("coachBackButton.png"));
		previous.setBorder(BorderFactory.createEmptyBorder());
		previous.addActionListener(this);

		menu = new JMenuBar();
		menu.setPreferredSize(new Dimension(1400,100));
		menu.setBackground(new Color(98, 174, 239));
		menu.add(previous);

		label = new JLabel("Select Action");
		// label.setIcon(new ImageIcon("train.jpg"));
		label.setBackground(Color.PINK);
		label.setFont(new Font("Times new roman", Font.PLAIN, 55));
		label.setHorizontalAlignment(JLabel.CENTER);

		upperPanel = new JPanel();
		upperPanel.setBackground(Color.WHITE);
		upperPanel.setBounds(400,0, 1160, 200);
		upperPanel.setLayout(new BorderLayout());
		upperPanel.add(label);
		
		lowerPanel = new JPanel();
		lowerPanel.setBackground(Color.white);
		lowerPanel.setBounds(400, 200, 1160, 700);
		lowerPanel.add(button1);
		lowerPanel.add(button2);
		
		
		lowerPanel.setLayout(new GridLayout(2,3));
		
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(1960,1040);
		frame.setJMenuBar(menu);
		frame.add(upperPanel);
		frame.add(lowerPanel);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new AStationList();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

			// if(e.getSource()==button1){
			//  frame.setVisible(false);
			// 	new ShovanSeatView(new JLabel("Shovan Seat View"),new ImageIcon("SHOVAN1.jpg"), new ImageIcon("SHOVAN2.jpg"), new ImageIcon("SHOVAN3.jpg"), new ImageIcon("SHOVAN4.jpg"));
			// }
			// if(e.getSource()==button2){
			// 	frame.setVisible(false);
			// 	new S_ChairSeatView(new JLabel("S_Chair Seat View"),new ImageIcon("S_CHAIR1.jpg"), new ImageIcon("S_CHAIR2.jpg"), new ImageIcon("S_CHAIR3.jpg"), new ImageIcon("S_CHAIR5.jpg"));		
			// }

			// if(e.getSource()==button3){
			// 	frame.setVisible(false);
			// 	new AC_BerthSeatView(new JLabel("AC_Berth Seat View"),new ImageIcon("AC_BERTH1.jpg"), new ImageIcon("AC_BERTH2.jpg"), new ImageIcon("AC_BERTH3.jpg"), new ImageIcon("AC_BERTH4.jpg"));
			// }


			// if(e.getSource()==button4){
			// 	frame.setVisible(false);
			// 	new SnigdhaSeatView(new JLabel("Snigdha Seat View"),new ImageIcon("SNIGDHA1.jpg"), new ImageIcon("SNIGDHA2.jpg"), new ImageIcon("SNIGDHA3.jpg"), new ImageIcon("SNIGDHA4.jpg"));
			// }

			if(e.getSource()==previous){
				frame.setVisible(false);
				 new AdminPage();
			}

	
		}


		
	


	

}



