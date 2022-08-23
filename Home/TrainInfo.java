package home;
import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import trainsearch.Searchtrain;
import userprofile.Person;

public class TrainInfo extends Searchtrain  {
    Person person;
    static int [][][] allButtonList= new int[5][4][50];

    JButton backButton;
    public TrainInfo(Person p, int[][][] allButtonList) {
        super(p, allButtonList);
        super.trainButton[0].setEnabled(false);
        super.trainButton[1].setEnabled(false);
        super.trainButton[2].setEnabled(false);
        super.trainButton[3].setEnabled(false);

        backButton = new JButton();
        backButton.setIcon(new ImageIcon("images/Back.png"));
        backButton.setBounds(0,0, 200, 100);
        backButton.setFocusable(false);
        backButton.setBackground(new Color(98, 174, 239));
        backButton.setBorder(BorderFactory.createEmptyBorder());
        backButton.addActionListener(this);
            }



    
}
