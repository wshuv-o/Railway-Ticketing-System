import java.awt.*;
import javax.swing.*;

public class Home{
	JButton button1;
	JButton button2, button3, button4, button5, button6;
	Home(){
		button1= new JButton("Purchase");
		button2= new JButton("History");
		button3= new JButton("Coach View");
		button4= new JButton("Train Info");
		button5= new JButton("Help");
		button6= new JButton("Food");

		button1.setIcon(new ImageIcon("receipt.png"));
		button1.setBackground(Color.white);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setIconTextGap(20);
		button1.setFont(new Font("Times new roman", Font.BOLD, 25));
		button1.setFocusable(false);

		button2.setIcon(new ImageIcon("clock.png"));
		button2.setBackground(Color.white);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setIconTextGap(20);
		button2.setFont(new Font("Times new roman", Font.BOLD, 25));
		button2.setFocusable(false);

		button3.setIcon(new ImageIcon("coachView.png"));
		button3.setBackground(Color.white);
		button3.setHorizontalTextPosition(JButton.CENTER);
		button3.setVerticalTextPosition(JButton.BOTTOM);
		button3.setIconTextGap(20);
		button3.setFont(new Font("Times new roman", Font.BOLD, 25));
		button3.setFocusable(false);

		button4.setIcon(new ImageIcon("ballot.png"));
		button4.setBackground(Color.white);
		button4.setHorizontalTextPosition(JButton.CENTER);
		button4.setVerticalTextPosition(JButton.BOTTOM);
		button4.setIconTextGap(20);
		button4.setFont(new Font("Times new roman", Font.BOLD, 25));
		button4.setFocusable(false);

		button5.setIcon(new ImageIcon("users.png"));
		button5.setBackground(Color.white);
		button5.setHorizontalTextPosition(JButton.CENTER);
		button5.setVerticalTextPosition(JButton.BOTTOM);
		button5.setIconTextGap(20);
		button5.setFont(new Font("Times new roman", Font.BOLD, 25));
		button5.setFocusable(false);

		button6.setIcon(new ImageIcon("food.png"));
		button6.setBackground(Color.white);
		button6.setHorizontalTextPosition(JButton.CENTER);
		button6.setVerticalTextPosition(JButton.BOTTOM);
		button6.setIconTextGap(20);
		button6.setFont(new Font("Times new roman", Font.BOLD, 25));
		button6.setFocusable(false);


		JMenuBar menu = new JMenuBar();
		JMenuItem item1 = new JMenuItem("Bangladesh Railway");
		JMenuItem item2 = new JMenuItem("wswmsjw");
		JMenuItem item3 = new JMenuItem("wndiwiswj");

		item1.setIcon(new ImageIcon("rsz_2bangladesh_railway_logo.png"));
		item1.setHorizontalTextPosition(JMenuItem.CENTER);
		item1.setVerticalTextPosition(JMenuItem.BOTTOM);
		item1.setFont(new Font("Times new roman", Font.BOLD, 20));

		item2.setIcon(new ImageIcon("rsz_sign-out-alt_1.png"));
		item2.setFont(new Font("Times new roman", Font.PLAIN, 15));

		item3.setIcon(new ImageIcon("rsz_time-fast.png"));
		item3.setFont(new Font("Times new roman", Font.PLAIN, 15));

		menu.setPreferredSize(new Dimension(1400,100));
		menu.setBackground(new Color(98, 174, 239));
		JMenu logout= new JMenu("                                                                ");
		logout.setHorizontalTextPosition(JMenu.CENTER);
		logout.setIcon(new ImageIcon("menu.png"));
		logout.add(item1);
		logout.add(item2);
		logout.add(item3);
		menu.add(logout);


		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("train.jpg"));
		JPanel upperPanel = new JPanel();
		upperPanel.setBackground(Color.black);
		upperPanel.setBounds(400,0, 1160, 400);
		upperPanel.setLayout(new BorderLayout());
		upperPanel.add(label);
		
		JPanel lowerPanel = new JPanel();
		lowerPanel.setBackground(Color.white);
		lowerPanel.setBounds(400, 400, 1160, 500);
		lowerPanel.add(button1);
		lowerPanel.add(button2);
		lowerPanel.add(button3);
		lowerPanel.add(button4);
		lowerPanel.add(button5);
		lowerPanel.add(button6);
		lowerPanel.setLayout(new GridLayout(2,3));
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(1960,1040);
		frame.setJMenuBar(menu);
		frame.add(upperPanel);
		frame.add(lowerPanel);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new Home();
	}
}
    
