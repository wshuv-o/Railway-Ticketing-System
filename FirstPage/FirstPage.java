import java.awt.*;
import javax.swing.*;

public class FirstPage {
    ImageIcon image = new ImageIcon("bangladesh-railway.png");

    JFrame frame;
    JPanel panel;
    JLabel label;
    JLabel label2;
    JLabel label3;
    JTextField text1, text2;  
    JButton buttonSignIn;
    JButton buttonSignUp;
    JButton forgotPassword;
    FirstPage(){
        ImageIcon image = new ImageIcon("bangladesh-railway.png");
        ImageIcon image2 = new ImageIcon("train-illustration-for-train-1.jpg");
        JLabel user= new JLabel("Email or Phone Number");
        user.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
        JLabel pass= new JLabel("Password");
        pass.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
        forgotPassword=new JButton("Password forgotten?");
        forgotPassword.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
        forgotPassword.setBorder(BorderFactory.createEmptyBorder());
        forgotPassword.setFocusable(false);
        forgotPassword.setBackground(new Color(98, 174, 239));
        forgotPassword.setBounds(50, 430, 200, 20);
        user.setBounds(50,180, 200,20);
        pass.setBounds(50, 240,200,20);

        frame = new JFrame();
        panel = new JPanel();
        //JPanel panelBack= new JPanel();
        label=new JLabel(image);
        label.setText("Bangladesh Railway");
        label.setFont(new Font("Times New Roman", Font.BOLD, 20));
        label.setForeground(Color.black);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setIconTextGap(0);
        label2= new JLabel("        Doesn't have an account?"); 
        label2.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
        //label3= new JLabel(image2); 

         buttonSignIn = new JButton("Sign In");
         buttonSignIn.setFont(new Font("Sitka Heading", Font.PLAIN, 12));
         buttonSignUp = new JButton("Sign Up");
         buttonSignUp.setFont(new Font("Sitka Heading", Font.PLAIN, 12));

         buttonSignIn.setFocusable(false);
         buttonSignUp.setFocusable(false);
         

         
        
        buttonSignIn.setBounds(50, 320, 200, 30);
        buttonSignUp.setBounds(50, 380, 200, 30);


        text1=new JTextField();  
        text1.setBounds(50,200, 200,30);  
        text2=new JTextField();  
        text2.setBounds(50,260, 200,30);  


        label.setBounds(70, 0, 180, 180);
        label2.setBounds(50, 360, 200, 20);


    
        panel.setPreferredSize(new Dimension(320, 500));
        panel.setBackground(new Color(98, 174, 239));  
        panel.add(label);
        panel.add(user);
        panel.add(pass);
        panel.add(text1);
        panel.add(text2);
        panel.add(buttonSignIn);
        panel.add(label2);
        panel.add(buttonSignUp);
        panel.add(forgotPassword);
        panel.setLayout(null);


        frame.setLayout(new GridBagLayout());
        frame.add(panel, new GridBagConstraints());
        frame.add(panel);
        frame.setSize(new Dimension(800, 800));
        frame.getContentPane().setBackground(new Color(155, 198, 227));
        //frame.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    public static void main(String [] args) {
        new FirstPage();

    }
}
