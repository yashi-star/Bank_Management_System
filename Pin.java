package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Pin extends JFrame implements ActionListener{
    
    JPasswordField t1,t2;
    JButton b1,b2;                               
    JLabel pin1,newpin,repin;
    String pin;
    Pin(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l4 = new JLabel(i3);
        l4.setBounds(0, 0, 850,800);
        add(l4);
        
        pin1 = new JLabel("CHANGE YOUR PIN");
        pin1.setFont(new Font("System", Font.BOLD, 16));
        pin1.setForeground(Color.WHITE);
        
        newpin = new JLabel("New PIN:");
        newpin.setFont(new Font("System", Font.BOLD, 14));
        newpin.setForeground(Color.WHITE);
        
        repin = new JLabel("Re-Enter:");
        repin.setFont(new Font("System", Font.BOLD, 14));
        repin.setForeground(Color.WHITE);
        
        t1 = new JPasswordField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JPasswordField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("CHANGE");
        b2 = new JButton("BACK");
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        setLayout(null);
        
        pin1.setBounds(235,350,800,30);
        l4.add(pin1);
        
        newpin.setBounds(210,390,85,20);
        l4.add(newpin);
        
        t1.setBounds(280,390,130,20);
        l4.add(t1);
        
        repin.setBounds(210,420,100,20);
        l4.add(repin);
        
        t2.setBounds(280,420,130,20);
        l4.add(t2);
        
        b1.setBounds(330,460,90,15);
        l4.add(b1);
        
        b2.setBounds(330,485,90,15);
        l4.add(b2);
        
        setSize(850,800);
        setLocation(300,10);
        //setUndecorated(true);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae){
        try{        
            String npin = t1.getText();
            String rpin = t2.getText();
            
            if(!npin.equals(rpin)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                return;
            }
            
            if(ae.getSource()==b1){
                if (t1.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                }
                if (t2.getText().equals("")){
                    JOptionPane.showMessageDialog(null, "Re-Enter new PIN");
                }
                
                Conn c1 = new Conn();
                String q1 = "update bank set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q3 = "update signup3 set pin = '"+rpin+"' where pin = '"+pin+"' ";

                c1.s.executeUpdate(q1);
                c1.s.executeUpdate(q2);
                c1.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transactions(rpin).setVisible(true);
            
            }else if(ae.getSource()==b2){
                new Transactions(pin).setVisible(true);
                setVisible(false);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args){
        new Pin("").setVisible(true);
    }
}
