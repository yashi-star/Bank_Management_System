package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;

public class Signup3 extends JFrame implements ActionListener{
    
    JLabel accDetail,accType,cardNum,aadharNum,cnum,appear,pin,l8,pswd,service,formnumber,l12;
    JRadioButton r1,r2,r3,r4;
    JButton b1,b2;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    String formno;
    Signup3(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
    
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(50, 0, 100, 100);
        add(l14);
        
        accDetail = new JLabel("Page 3: Account Details");
        accDetail.setFont(new Font("Raleway", Font.BOLD, 22));
        
        accType= new JLabel("Account Type:");
        accType.setFont(new Font("Raleway", Font.BOLD, 18));
        
        cardNum = new JLabel("Card Number:");
        cardNum.setFont(new Font("Raleway", Font.BOLD, 18));
        
        aadharNum = new JLabel("XXXX-XXXX-XXXX-4184");
        aadharNum.setFont(new Font("Raleway", Font.BOLD, 18));
        
        cnum = new JLabel("(Your 16-digit Card number)");
        cnum.setFont(new Font("Raleway", Font.BOLD, 12));
        
        appear = new JLabel("It would appear on ATM Card/Cheque Book and Statements");
        appear.setFont(new Font("Raleway", Font.BOLD, 12));
        
        pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 18));
        
        l8 = new JLabel("XXXX");
        l8.setFont(new Font("Raleway", Font.BOLD, 18));
    
        pswd= new JLabel("(4-digit password)");
        pswd.setFont(new Font("Raleway", Font.BOLD, 12));
    
        service = new JLabel("Services Required:");
        service.setFont(new Font("Raleway", Font.BOLD, 18));
        
        formnumber = new JLabel("Form No:");
        formnumber.setFont(new Font("Raleway", Font.BOLD, 14));
        
        l12 = new JLabel(formno);
        l12.setFont(new Font("Raleway", Font.BOLD, 14));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        
        
        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.GRAY);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.GRAY);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.GRAY);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c4 = new JCheckBox("EMAIL Alerts");
        c4.setBackground(Color.GRAY);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.GRAY);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.GRAY);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.",false);
        c7.setBackground(Color.GRAY);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
         
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 16));
        r1.setBackground(Color.GRAY);
        
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 16));
        r2.setBackground(Color.GRAY);
        
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 16));
        r3.setBackground(Color.GRAY);
        
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 16));
        r4.setBackground(Color.GRAY);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        groupgender.add(r3);
        groupgender.add(r4);
        
        setLayout(null);
        
        formnumber.setBounds(700,10,70,30);
        add(formnumber);
        
        l12.setBounds(770,10,40,30);
        add(l12);
        
        accDetail.setBounds(280,40,400,40);
        add(accDetail); 
        
        accType.setBounds(100,140,200,30);
        add(accType); 
        r1.setBounds(100,180,150,30);
        add(r1);       
        r2.setBounds(350,180,300,30);
        add(r2);       
        r3.setBounds(100,220,250,30);
        add(r3);        
        r4.setBounds(350,220,250,30);
        add(r4);
        
        cardNum.setBounds(100,280,200,30);
        add(cardNum);
        
        aadharNum.setBounds(330,280,250,30);
        add(aadharNum);
        
        cnum.setBounds(100,310,200,20);
        add(cnum);
        
        appear.setBounds(330,310,500,20);
        add(appear);
        
        pin.setBounds(100,350,200,30);
        add(pin);
        
        l8.setBounds(330,350,200,30);
        add(l8);
        
        pswd.setBounds(100,370,200,20);
        add(pswd);
        
        service.setBounds(100,430,200,30);
        add(service);
        
        c1.setBounds(100,470,200,30);
        add(c1);       
        c2.setBounds(350,470,200,30);
        add(c2);        
        c3.setBounds(100,500,200,30);
        add(c3);        
        c4.setBounds(350,500,200,30);
        add(c4);        
        c5.setBounds(100,530,200,30);
        add(c5);       
        c6.setBounds(350,530,200,30);
        add(c6);      
        c7.setBounds(100,600,200,60);
        add(c7);
        
        
        b1.setBounds(250,90,100,30);
        add(b1);       
        b2.setBounds(420,90,100,30);
        add(b2);
        
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(850,850);
        setLocation(300,10);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(r1.isSelected()){ 
            atype = "Saving Account";
        }
        else if(r2.isSelected()){ 
            atype = "Fixed Deposit Account";
        }
        else if(r3.isSelected()){ 
            atype = "Current Account";
        }else if(r4.isSelected()){ 
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(c1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        else if(c2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        else if(c3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        else if(c4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        else if(c5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        else if(c6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==b1){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                    new Deposit(pin).setVisible(false);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==b2){
            	 setVisible(false);
            	 new Login().setVisible(true);
//                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signup3("").setVisible(true);
    }
    
}


