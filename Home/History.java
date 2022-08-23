package home;
import java.lang.*;
import javax.swing.*;
import javax.swing.text.AttributeSet.ColorAttribute;

import userprofile.Person;

import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class History implements ActionListener{

	public JButton  previous;
	public JButton[] button= new JButton[6];
	JPanel upperPanel,lowerPanel,
	panel1,panel2,panel3,panel4,panel5,panel6,
	panel11,panel12,panel21,panel22,panel31,panel32,panel41,panel42,panel51,panel52,panel61,panel62;
	JMenuBar menu;
	ImageIcon image1,image2,image3,image4;
	JLabel label,
	label1,label11,label12,
	label2,label21,label22,
	label3,label31,label32,
	label4,label41,label42,
	label5,label51,label52,
	label6,label61,label62;
    JFrame frame;

    Font headingFont =new Font("Avenir Next LT Pro", Font.ROMAN_BASELINE, 30);
    Font bodyFont =new Font("Avenir Next LT Pro", Font.PLAIN, 22);

    Person person;
	int[][][] allButtonList=new int[5][4][50] ;
	static String [][]drawer= new String[500][3];
	public History(Person person, int[][][] allButtonList){
		this.person=person;
		this.allButtonList=allButtonList;


		String filePath= "GeneratedTicket/"+person.getNidNumber()+"/"+person.getFirstName()+".csv";
		BufferedReader reader=null;
		String line="";
		
		try{
		   reader = new BufferedReader(new FileReader(filePath));
		   int j=0;
		   while((line= reader.readLine())!=null){
			  String []row= line.split(",");
			  for(int i=0; i<3;i++){
				 drawer[j][i]=row[i];
			  }
			  j++;
		   }
		}
		catch(Exception e){JOptionPane.showMessageDialog(null, "No History available");; e.printStackTrace();}
		finally{try{reader.close(); } 
		catch (IOException e) {e.printStackTrace();}}

        label1=new JLabel();
		label1.setText(drawer[0][0]);
		label1.setFont(headingFont);
		label1.setForeground(Color.WHITE);
		label1.setHorizontalAlignment(JLabel.CENTER);

        label11=new JLabel();
		label11.setText("Train : "+drawer[0][1]);
		label11.setFont(bodyFont);
		label11.setHorizontalAlignment(JLabel.CENTER);

        label12=new JLabel();
		label12.setText("Date : "+drawer[0][2]);
		label12.setFont(bodyFont);
		label12.setHorizontalAlignment(JLabel.CENTER);

		for(int i=0; i<6;i++){
		button[i]=new JButton("Details");
		button[i].setHorizontalAlignment(JLabel.CENTER);
        button[i].setBackground(new Color(255,255,255));
        button[i].setFocusable(false);
        button[i].setBorder(BorderFactory.createEtchedBorder());
		button[i].addActionListener(this);
	    }


		panel11=new JPanel();
		panel11.setBounds(0,0,385,80);
		panel11.setBackground(new Color(0x1A4D2E)); 
		panel11.add(label1); 
		
		panel12=new JPanel();
		panel12.setBounds(0,80,385,269);
		panel12.setBackground(new Color(0xCEE5D0));
		panel12.setLayout(new GridLayout(3,1,0,0));
		panel12.add(label11);
		panel12.add(label12);
		panel12.add(button[0]);
		

	
        label2=new JLabel();
		label2.setText(drawer[1][0]);
		label2.setFont(headingFont);
		label2.setForeground(Color.WHITE);
		label2.setHorizontalAlignment(JLabel.CENTER);

        label21=new JLabel();
		label21.setText("Train : "+drawer[1][1]);
		label21.setFont(bodyFont);
		label21.setHorizontalAlignment(JLabel.CENTER);

        label22=new JLabel();
		label22.setText("Date : "+drawer[1][2]);
		label22.setFont(bodyFont);
		label22.setHorizontalAlignment(JLabel.CENTER);


		panel21=new JPanel();
		panel21.setBounds(0,0,385,80);
		panel21.setBackground(new Color(0x1A4D2E));
		panel21.add(label2);
		
		panel22=new JPanel();
		panel22.setBounds(0,80,385,269);
		panel22.setBackground(new Color(0xCEE5D0));
		panel22.setLayout(new GridLayout(3,1,0,0));
		panel22.add(label21);
		panel22.add(label22);
		panel22.add(button[1]);

			
		label3=new JLabel();
		label3.setText(drawer[2][0]);
		label3.setFont(headingFont);
		label3.setForeground(Color.WHITE);
		label3.setHorizontalAlignment(JLabel.CENTER);

		label31=new JLabel();
		label31.setText("Train : "+drawer[2][1]);
		label31.setFont(bodyFont);
		label31.setHorizontalAlignment(JLabel.CENTER);

		label32=new JLabel();
		label32.setText("Date : "+drawer[2][2]);
		label32.setFont(bodyFont);
		label32.setHorizontalAlignment(JLabel.CENTER);

		panel31=new JPanel();
		panel31.setBounds(0,0,385,80);
		panel31.setBackground(new Color(0x1A4D2E));
		panel31.add(label3);
		
		panel32=new JPanel();
		panel32.setBounds(0,80,385,269);
		panel32.setBackground(new Color(0xCEE5D0));
		panel32.setLayout(new GridLayout(3,1,0,0));
		panel32.add(label31);
		panel32.add(label32);
		panel32.add(button[2]);



		label4=new JLabel();
		label4.setText(drawer[3][0]);
		label4.setFont(headingFont);
		label4.setForeground(Color.WHITE);
		label4.setHorizontalAlignment(JLabel.CENTER);

		label41=new JLabel();
		label41.setText("Train : "+drawer[3][1]);
		label41.setFont(bodyFont);
		label41.setHorizontalAlignment(JLabel.CENTER);

		label42=new JLabel();
		label42.setText("Date : "+drawer[3][2]);
		label42.setFont(bodyFont);
		label42.setHorizontalAlignment(JLabel.CENTER);

		panel41=new JPanel();
		panel41.setBounds(0,0,385,80);
		panel41.setBackground(new Color(0x1A4D2E));
		panel41.add(label4);

		panel42=new JPanel();
		panel42.setBounds(0,80,385,269);
		panel42.setBackground(new Color(0xCEE5D0));
		panel42.setLayout(new GridLayout(3,1,0,0));
		panel42.add(label41);
		panel42.add(label42);
		panel42.add(button[3]);


		label5=new JLabel();
		label5.setText(drawer[4][0]);
		label5.setFont(headingFont);
		label5.setForeground(Color.WHITE);
		label5.setHorizontalAlignment(JLabel.CENTER);

		label51=new JLabel();
		label51.setText("Train : "+drawer[4][1]);
		label51.setFont(bodyFont);
		label51.setHorizontalAlignment(JLabel.CENTER);

		label52=new JLabel();
		label52.setText("Date : "+drawer[4][2]);
		label52.setFont(bodyFont);
		label52.setHorizontalAlignment(JLabel.CENTER);

		panel51=new JPanel();
		panel51.setBounds(0,0,385,80);
		panel51.setBackground(new Color(0x1A4D2E));
		panel51.add(label5);

		panel52=new JPanel();
		panel52.setBounds(0,80,385,269);
		panel52.setBackground(new Color(0xCEE5D0));
		panel52.setLayout(new GridLayout(3,1,0,0));
		panel52.add(label51);
		panel52.add(label52);
		panel52.add(button[4]);

		
			
		label6=new JLabel();
		label6.setText(drawer[5][0]);
		label6.setFont(headingFont);
		label6.setForeground(Color.WHITE);
		label6.setHorizontalAlignment(JLabel.CENTER);

		label61=new JLabel();
		label61.setText("Train : "+drawer[5][1]);
		label61.setFont(bodyFont);
		label61.setHorizontalAlignment(JLabel.CENTER);

		label62=new JLabel();
		label62.setText("Date : "+drawer[5][2]);
		label62.setFont(bodyFont);
		label62.setHorizontalAlignment(JLabel.CENTER);

		panel61=new JPanel();
		panel61.setBounds(0,0,385,80);
		panel61.setBackground(new Color(0x1A4D2E));
		panel61.add(label6);

		panel62=new JPanel();
		panel62.setBounds(0,80,385,270);
		panel62.setBackground(new Color(0xCEE5D0));
		panel62.setLayout(new GridLayout(3,1,0,0));
		panel62.add(label61);
		panel62.add(label62);
		panel62.add(button[5]);

        panel1=new JPanel();
        panel1.setBackground(new Color(0xFFFCDC));
		panel1.setLayout(null);
        panel1.add(panel11);
        panel1.add(panel12);
        
        panel2=new JPanel();
        panel2.setBackground(new Color(0xFFEEBB));
		panel2.setLayout(null);
		panel2.add(panel21);
		panel2.add(panel22);
		

        panel3=new JPanel();
        panel3.setBackground(new Color(0xFFFCDC));
		panel3.setLayout(null);
        panel3.add(panel31);
        panel3.add(panel32);
        
        panel4=new JPanel();
        panel4.setBackground(new Color(0xFFEEBB));
		panel4.setLayout(null);
		panel4.add(panel41);
		panel4.add(panel42);
		

        panel5=new JPanel();
        panel5.setBackground(new Color(0xFFFCDC));
		panel5.setLayout(null);
        panel5.add(panel51);
        panel5.add(panel52);
        
        panel6=new JPanel();
        panel6.setBackground(new Color(0xFFEEBB));
		panel6.setLayout(null);
		panel6.add(panel61);
		panel6.add(panel62);
		
 
		previous= new JButton("                                                               ");
		previous.setIcon(new ImageIcon("images/Back.png"));
		previous.setHorizontalTextPosition(JMenu.CENTER);
		previous.setBackground(new Color(98, 174, 239));
		previous.setFocusable(false);
		previous.setBorder(BorderFactory.createEmptyBorder());
		previous.addActionListener(this);

		menu = new JMenuBar();
		menu.setPreferredSize(new Dimension(1400,100));
		menu.setBackground(new Color(98, 174, 239));
		menu.add(previous);

		
        label=new JLabel();
		// label.setIcon(new ImageIcon("train.jpg"));
        label.setText("History");
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
		lowerPanel.add(panel1);
		lowerPanel.add(panel2);
		lowerPanel.add(panel3);
		lowerPanel.add(panel4);
		lowerPanel.add(panel5);
		lowerPanel.add(panel6);
		
		lowerPanel.setLayout(new GridLayout(2,3,3,3));
		
		frame= new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(1960,1040);
		frame.setJMenuBar(menu);
		frame.add(upperPanel);
		frame.add(lowerPanel);
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==button[0]){
			String pth="GeneratedTicket/"+person.getNidNumber()+"/"+person.getFirstName()+drawer[0][2]+".txt";
			File f= new File(pth);
			if(f.exists()){
				try {
					Desktop.getDesktop().open(f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "File not found!");
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource()==button[1]){
			String pth="GeneratedTicket/"+person.getNidNumber()+"/"+person.getFirstName()+drawer[1][2]+".txt";
			File f= new File(pth);
			if(f.exists()){
				try {
					Desktop.getDesktop().open(f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "File not found!");
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource()==button[2]){
			String pth="GeneratedTicket/"+person.getNidNumber()+"/"+person.getFirstName()+drawer[2][2]+".txt";
			File f= new File(pth);
			if(f.exists()){
				try {
					Desktop.getDesktop().open(f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "File not found!");
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource()==button[3]){
			String pth="GeneratedTicket/"+person.getNidNumber()+"/"+person.getFirstName()+drawer[3][2]+".txt";
			File f= new File(pth);
			if(f.exists()){
				try {
					Desktop.getDesktop().open(f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "File not found!");
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource()==button[4]){
			String pth="GeneratedTicket/"+person.getNidNumber()+"/"+person.getFirstName()+drawer[4][2]+".txt";
			File f= new File(pth);
			if(f.exists()){
				try {
					Desktop.getDesktop().open(f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "File not found!");
					e1.printStackTrace();
				}
			}
		}
		if(e.getSource()==button[5]){
			String pth="GeneratedTicket/"+person.getNidNumber()+"/"+person.getFirstName()+drawer[5][2]+".txt";
			File f= new File(pth);
			if(f.exists()){
				try {
					Desktop.getDesktop().open(f);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "File not found!");
					e1.printStackTrace();
				}
			}
		}
		
		if(e.getSource()==previous){
			frame.setVisible(false);
			new Home(person, allButtonList);
		}
	}
}
