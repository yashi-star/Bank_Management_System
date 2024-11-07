package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


//actionlisterner is an interface inside awt.event
public class Login extends JFrame implements ActionListener{
	//globally defined
    JLabel text,cardno,pin;
    JTextField textfeild;
    JPasswordField pinfeild;
    JButton signin,clear,signup;
  
    Login(){
        setTitle("AUTOMATED TELLER MACHINE");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label = new JLabel(i3);
        label.setBounds(70, 10, 100, 100);
        add(label);
     
        text = new JLabel("WELCOME TO ATM");
        text.setFont(new Font("Osward", Font.BOLD, 38));
        text.setBounds(200,40,450,40);
        add(text);
        
        cardno = new JLabel("Card No:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 28));
        cardno.setBounds(125,150,375,30);
        add(cardno);
        
        textfeild = new JTextField(15);
        textfeild.setBounds(300,150,230,30);
        textfeild.setFont(new Font("Arial", Font.BOLD, 14));
        add(textfeild);
        
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 28));
        pin.setBounds(125,220,375,30);
        add(pin);
        
        pinfeild = new JPasswordField(15);
        pinfeild.setFont(new Font("Arial", Font.BOLD, 14));
        pinfeild.setBounds(300,220,230,30);
        add(pinfeild);
                
        signin = new JButton("SIGN IN");
        signin.setBackground(Color.BLACK);
        signin.setForeground(Color.WHITE);
        
        clear = new JButton("CLEAR");
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        
        signup = new JButton("SIGN UP");
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        
        setLayout(null);
        
        signin.setFont(new Font("Arial", Font.BOLD, 14));
        signin.setBounds(300,300,100,30);
        add(signin);
        
        clear.setFont(new Font("Arial", Font.BOLD, 14));
        clear.setBounds(430,300,100,30);
        add(clear);
        
        signup.setFont(new Font("Arial", Font.BOLD, 14));
        signup.setBounds(300,350,230,30);
        add(signup);
        
        signin.addActionListener(this);
        clear.addActionListener(this);
        signup.addActionListener(this);
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(800,480);//frame dimensions
        setLocation(350,150);//where frame should open top left right or bottom
        setVisible(true);//to make frame visible
        
    }
    
    //actionlistner used in button to check what action is performed on it
    //in action performed we will write what will happen after click
   //we have to override action performed method which is inside actionlistner then only it works
    public void actionPerformed(ActionEvent ae){
        try{        
            if(ae.getSource()==signin){
                Conn c1 = new Conn();
                String cardno  = textfeild.getText();
                String pin  = pinfeild.getText();
                String q  = "select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";

                ResultSet rs = c1.s.executeQuery(q);
                if(rs.next()){
                    setVisible(false);
                    new Transactions(pin).setVisible(true);
                }else{
                    JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                }
            }
            else if(ae.getSource()==clear){
                textfeild.setText("");
                pinfeild.setText("");
            }
            else if(ae.getSource()==signup){
                setVisible(false);
                new Signup().setVisible(true);
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    public static void main(String[] args){
        new Login().setVisible(true);
    }

    
}



