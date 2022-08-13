import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.FontUIResource;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;


import java.awt.Color;

public class TermsConditions extends JFrame {
    TermsConditions(){
        this.setBounds(0,0,800,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x3B9AE1));
        this.setLayout(null);

        ImageIcon image= new ImageIcon("C:/Users/DELL/Dropbox/PC/Desktop/Myproject/Task 4/train.png");

        JLabel photoButton= new JLabel();
        photoButton.setIcon(image);
        photoButton.setBounds(0,0, 500, 500);

        String labelText ="<html>"+"<br>This is to verify that, this project is developed by QuadSquad group as their final term project of Object-oriented Programming-1[JAVA] course. This project is not related to Bangladesh Railway in any way"+"</html>";
        JLabel jimJLabel= new JLabel(labelText);
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

        JButton JimButton= new JButton();
        JimButton.setBackground(new Color(0x21E1E1));
        JimButton.setLayout(null);
        JimButton.setBounds(0,0,200,100);
        JimButton.setBorder(BorderFactory.createEmptyBorder());
    
        
        JPanel upperPanel= new JPanel();
        upperPanel.setBounds(0, 0, 1600, 100);
        upperPanel.setBackground(new Color(0x21E1E1));
        upperPanel.setLayout(null);
        upperPanel.add(JimButton);

        JPanel lowerPanel= new JPanel();
        lowerPanel.setBounds(0, 100, 1600, 700);
        lowerPanel.setBackground(new Color(0x3B9AE1));
        lowerPanel.setLayout(new GridBagLayout());
        lowerPanel.add(jimBabuJPanel);
        lowerPanel.add(jimJPanel);


    

        this.add(upperPanel);
        this.add(lowerPanel);
        this.setVisible(true);


    }
    public static void main(String[] args) {
        TermsConditions tc= new TermsConditions();
    }
}

