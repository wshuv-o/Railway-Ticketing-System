package home;
import userprofile.*;
import trainsearch.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Home implements ActionListener
{
	static Person person;
	static int [][][] allButtonList= new int[5][4][50];
	
	public JFrame homeFrame;
	public JButton button1, button2, button3, button4, button5, button6;
	JMenuItem item2;
	JMenuItem item3;
	public Home(Person p, int[][][] allButtonList){
		person=p;
		Home.allButtonList=allButtonList;
		
		button1= new JButton("Purchase");
		button2= new JButton("History");
		button3= new JButton("Coach View");
		button4= new JButton("Train Info");
		button5= new JButton("Help");
		button6= new JButton("Food");

		button1.setIcon(new ImageIcon("images/receipt.png"));
		button1.setBackground(Color.white);
		button1.setHorizontalTextPosition(JButton.CENTER);
		button1.setVerticalTextPosition(JButton.BOTTOM);
		button1.setIconTextGap(20);
		button1.setFont(new Font("Times new roman", Font.BOLD, 25));
		button1.setFocusable(false);
		button1.addActionListener(this);

		button2.setIcon(new ImageIcon("images/clock.png"));
		button2.setBackground(Color.white);
		button2.setHorizontalTextPosition(JButton.CENTER);
		button2.setVerticalTextPosition(JButton.BOTTOM);
		button2.setIconTextGap(20);
		button2.setFont(new Font("Times new roman", Font.BOLD, 25));
		button2.setFocusable(false);
		button2.addActionListener(this);


		button3.setIcon(new ImageIcon("images/coachView.png"));
		button3.setBackground(Color.white);
		button3.setHorizontalTextPosition(JButton.CENTER);
		button3.setVerticalTextPosition(JButton.BOTTOM);
		button3.setIconTextGap(20);
		button3.setFont(new Font("Times new roman", Font.BOLD, 25));
		button3.setFocusable(false);
		button3.addActionListener(this);


		button4.setIcon(new ImageIcon("images/ballot.png"));
		button4.setBackground(Color.white);
		button4.setHorizontalTextPosition(JButton.CENTER);
		button4.setVerticalTextPosition(JButton.BOTTOM);
		button4.setIconTextGap(20);
		button4.setFont(new Font("Times new roman", Font.BOLD, 25));
		button4.setFocusable(false);
		button4.addActionListener(this);


		button5.setIcon(new ImageIcon("images/users.png"));
		button5.setBackground(Color.white);
		button5.setHorizontalTextPosition(JButton.CENTER);
		button5.setVerticalTextPosition(JButton.BOTTOM);
		button5.setIconTextGap(20);
		button5.setFont(new Font("Times new roman", Font.BOLD, 25));
		button5.setFocusable(false);
		button5.addActionListener(this);


		button6.setIcon(new ImageIcon("images/food.png"));
		button6.setBackground(Color.white);
		button6.setHorizontalTextPosition(JButton.CENTER);
		button6.setVerticalTextPosition(JButton.BOTTOM);
		button6.setIconTextGap(20);
		button6.setFont(new Font("Times new roman", Font.BOLD, 25));
		button6.setFocusable(false);
		button6.addActionListener(this);

		JMenuBar menu = new JMenuBar();
		JMenuItem item1 = new JMenuItem("Bangladesh Railway");
		item2 = new JMenuItem("Log out");
		item3 = new JMenuItem("Terms & Condition");

		item1.setIcon(new ImageIcon("images/rsz_2bangladesh_railway_logo.png"));
		item1.setHorizontalTextPosition(JMenuItem.CENTER);
		item1.setVerticalTextPosition(JMenuItem.BOTTOM);
		item1.setFont(new Font("Times new roman", Font.BOLD, 20));

		item2.setIcon(new ImageIcon("images/rsz_sign-out-alt_1.png"));
		item2.setFont(new Font("Times new roman", Font.PLAIN, 15));
		item2.addActionListener(this);


		item3.setIcon(new ImageIcon("images/rsz_time-fast.png"));
		item3.setFont(new Font("Times new roman", Font.PLAIN, 15));
		item3.addActionListener(this);


		menu.setPreferredSize(new Dimension(1400,100));
		menu.setBackground(new Color(98, 174, 239));
		JMenu logout= new JMenu("                                                                ");
		logout.setHorizontalTextPosition(JMenu.CENTER);
		logout.setIcon(new ImageIcon("images/menu.png"));
		logout.add(item1);
		logout.add(item2);
		logout.add(item3);
		menu.add(logout);


		JLabel label = new JLabel();
		label.setIcon(new ImageIcon("images/train.jpg"));
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
		
		homeFrame = new JFrame();
		homeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		homeFrame.setLayout(null);
		homeFrame.setSize(1960,1040);
		homeFrame.setJMenuBar(menu);
		homeFrame.add(upperPanel);
		homeFrame.add(lowerPanel);
		homeFrame.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==item2)
		{
			new SignInPage(person, allButtonList);
			homeFrame.setVisible(false);
		}
		
		if(e.getSource()==item3)
		{
			homeFrame.setVisible(false);
			new TermsConditions(person, allButtonList);
		}
		if(e.getSource()==button1)
		{
			new Searchtrain(person, allButtonList);
			homeFrame.setVisible(false);
		}
		if(e.getSource()==button2)
		{
			new History(person, allButtonList);
			homeFrame.setVisible(false);
		}
		if(e.getSource()==button3)
		{
			new CoachViewGUI(person, allButtonList);
			homeFrame.setVisible(false);
		}
		if(e.getSource()==button4)
		{
			new TrainInfo(person, allButtonList);
			homeFrame.setVisible(false);
		}
		if(e.getSource()==button5)
		{
			new Help(person, allButtonList);
			homeFrame.setVisible(false);
		}
		if(e.getSource()==button6)
		{
			homeFrame.setVisible(false);
			new AvailableFood(person, allButtonList);
		}

	}

}
