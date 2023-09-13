package quizbox;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    
    Score(String name, int score){
        setBounds(615, 280, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank You "+name+" for playing QuizBox");
        heading.setBounds(150, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);
        
        JLabel userscore = new JLabel("Your score is : "+score);
        userscore.setBounds(350, 200, 300, 30);
        userscore.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(userscore);
        
        JButton submit = new JButton("Play Again");
        submit.setBounds(400, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 254));
        submit.setFont(new Font("Tahoma", Font.PLAIN, 16));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]){
        new Score("User", 0);
    }
}
