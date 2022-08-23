package home;
import java.awt.*;
import javax.swing.*;

import userprofile.Person;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class TermsConditions extends JFrame implements ActionListener  {

    JButton JimButton;
    JLabel jimJLabel;
    Person person;
	static int [][][] allButtonList= new int[5][4][50];
    public TermsConditions(Person person, int[][][] allButtonList){
        this.person=person;
        TermsConditions.allButtonList=allButtonList;

        this.setBounds(0,0,1960,1040);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x3B9AE1));
        this.setLayout(null);

        ImageIcon image= new ImageIcon("C:/Users/Shuvo/OneDrive/Desktop/draft/train.png");

        JLabel photoButton= new JLabel();
        photoButton.setIcon(image);
        photoButton.setBounds(0,0, 500, 500);

        String labelText ="<html>"+"<br>This is to verify that, this project is developed by QuadSquad group as their final term project of Object-oriented Programming-1[JAVA] course. This project is not related to Bangladesh Railway in any way"+"</html>";
        jimJLabel= new JLabel(labelText);
        jimJLabel.setPreferredSize(new Dimension(700, 500));
        jimJLabel.setBackground(new Color(0xF0EABE));
        jimJLabel.setFont(new Font("Times new roman", Font.TRUETYPE_FONT, 30));
        jimJLabel.setOpaque(true);
        jimJLabel.setLayout(null);

        JPanel jimJPanel= new JPanel();
        jimJPanel.setPreferredSize(new Dimension(500, 500));
        jimJPanel.setBackground(Color.black);
        jimJPanel.setLayout(new GridLayout());
        jimJPanel.add(jimJLabel);
        
        JPanel jimBabuJPanel= new JPanel();
        jimBabuJPanel.setPreferredSize(new Dimension(500, 500));
        jimBabuJPanel.setBackground(new Color(0x3120E0));
        jimBabuJPanel.setLayout(null);
        jimBabuJPanel.add(photoButton);

         JimButton= new JButton();
        JimButton.setBackground(new Color(0x21E1E1));
        JimButton.setIcon(new ImageIcon("images/Back.png"));
        JimButton.setLayout(null);
        JimButton.setBounds(0,0,200,100);
        JimButton.setBorder(BorderFactory.createEmptyBorder());
        JimButton.addActionListener(this);
    
        
        JPanel upperPanel= new JPanel();
        upperPanel.setBounds(0, 0, 1960, 100);
        upperPanel.setBackground(new Color(0x21E1E1));
        upperPanel.setLayout(null);
        upperPanel.add(JimButton);

        JPanel lowerPanel= new JPanel();
        lowerPanel.setBounds(0, 100, 1960, 700);
        lowerPanel.setBackground(new Color(0x3B9AE1));
        lowerPanel.setLayout(new GridBagLayout());
        lowerPanel.add(jimBabuJPanel);
        lowerPanel.add(jimJPanel);

        // Toolkit tk=Toolkit.getDefaultToolkit();
        // int x=(int) tk.getScreenSize().getWidth();
        // int y=(int) tk.getScreenSize().getHeight();

        this.add(upperPanel);
        this.add(lowerPanel);
        //this.setLocation(x/2-400, y/2-420);

        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==JimButton){
            new Home(person, allButtonList);
            this.setVisible(false);
        }
        
    }

}
