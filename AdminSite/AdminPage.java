package AdminSite;
import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AdminPage implements  ActionListener{

	public JButton button1, button2, button3, button4, previous;
	JMenuItem item1,item2,item3;
	JFrame frame;
	JPanel upperPanel,lowerPanel;
	JMenuBar menu;
	ImageIcon image1,image2,image3,image4;
	JLabel label;
	
	public AdminPage(){

		
		
		
		button1= new JButton("Users");
		button2= new JButton("Station Lists");
		button3= new JButton("Trains");
		button4= new JButton("Notice");
	

		button1.setIcon(new ImageIcon("users1.png"));
		button1.setBackground(Color.white);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setIconTextGap(20);
		button1.setFont(new Font("Times new roman", Font.BOLD, 25));
		button1.setFocusable(false);
		button1.addActionListener(this);


		button2.setIcon(new ImageIcon("train-station1.png"));
		button2.setBackground(Color.white);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setIconTextGap(20);
		button2.setFont(new Font("Times new roman", Font.BOLD, 25));
		button2.setFocusable(false);
		button2.addActionListener(this);

		button3.setIcon(new ImageIcon("1train.png"));
		button3.setBackground(Color.white);
		button3.setHorizontalTextPosition(JButton.CENTER);
		button3.setVerticalTextPosition(JButton.BOTTOM);
		button3.setIconTextGap(20);
		button3.setFont(new Font("Times new roman", Font.BOLD, 25));
		button3.setFocusable(false);
		button3.addActionListener(this);


		button4.setIcon(new ImageIcon("notice1.png"));
		button4.setBackground(Color.white);
		button4.setHorizontalTextPosition(JButton.CENTER);
		button4.setVerticalTextPosition(JButton.BOTTOM);
		button4.setIconTextGap(20);
		button4.setFont(new Font("Times new roman", Font.BOLD, 25));
		button4.setFocusable(false);
		button4.addActionListener(this);

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
		lowerPanel.add(button3);
		lowerPanel.add(button4);
		
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
		new AdminPage();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

			if(e.getSource()==button1){
			 frame.setVisible(false);
			 new AUsers();
			}
			if(e.getSource()==button2){
				frame.setVisible(false);
				new AStationList();
			}

			if(e.getSource()==button3){
				frame.setVisible(false);
				new ATrains();
			}


			if(e.getSource()==button4){
				frame.setVisible(false);
				new ANotice();
			}

			if(e.getSource()==previous){
				frame.setVisible(false);
				//  new Home();
			}


	
		}


		
	


	

}



