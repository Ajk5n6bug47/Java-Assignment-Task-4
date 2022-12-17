import javax.swing.*;

import javax.swing.event.AncestorListener;

import java.awt.*;
import java.awt.event;

package loginform;

public class LoginForm implements AncestorListener
{
    public static JLable password1,lable;
    private static JTextField username;
    private static JButton button;
    private static JPasswordField password;
    
    // creating a JPanel class
    JPanel panel = new JPanel();
    panel.set.layout(null);
    
    //creating a JFrame class
    JFrame frame = new JFrame();
    frame.setTitle("LOGIN PAGE");
    frame.setLocation(new Point(500,300));
    frame.add(panel);
    frame.setSize(new Dimension(400,200));
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    
    //username function label constructor
    lable = new JLable("Username");
    lable.setBounds(100,8,70,20);
    panel.add(label);
    
    
    //username textfield constructor
    username = new JTextField();
    username.setBounds(100,27,193,28);
    panel.add(username);
    
    
    //creating a password text field
    Password = new JPasswordField();
    Password.setBounds(100,75,193,28);
    panel.add(Password);
    
    
    //generating a button constructor
    button = new JButton("Login");
    button.setBounds(100,110,90,25);
    button.setForeground(Color.WHITE);
    button.setBackground(Color.BLACK);
    button.addActionListener((ActionListener)new Java_GUI());
    panel.add(button);
    
    
}
