package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;

public class Signup extends JFrame implements ActionListener{
    JLabel formno,personaldetails,name,fname,dob,sex,mail,status,add,city,pincode,state;
    JTextField t1,t2,t3,t4,t5,t6,t7;
    JRadioButton r1,r2,r3,r4,r5;
    JButton b;
    JDateChooser dateChooser;
    
    
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    String first = "" + Math.abs(first4);
    
    Signup(){
        
        setTitle("NEW ACCOUNT APPLICATION FORM");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);
        
        formno = new JLabel("APPLICATION FORM NO. "+first);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        
        personaldetails = new JLabel("Page 1: Personal Details");
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 22));
        
        name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        
        fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        
        dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        
        sex = new JLabel("Gender:");
        sex.setFont(new Font("Raleway", Font.BOLD, 20));
        
        mail = new JLabel("Email Address:");
        mail.setFont(new Font("Raleway", Font.BOLD, 20));
        
        status = new JLabel("Marital Status:");
        status.setFont(new Font("Raleway", Font.BOLD, 20));
        
        add= new JLabel("Address:");
        add.setFont(new Font("Raleway", Font.BOLD, 20));
        
        city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        
        pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        
        state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
                
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t3 = new JTextField();
        t3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t4 = new JTextField();
        t4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t5 = new JTextField();
        t5.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t6 = new JTextField();
        t6.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t7 = new JTextField();
        t7.setFont(new Font("Raleway", Font.BOLD, 14));
        
       
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.GRAY);
        
        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.GRAY);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(r1);
        groupgender.add(r2);
        
        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.GRAY);
        
        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.GRAY);
        
        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBackground(Color.GRAY);
        
        ButtonGroup groupstatus = new ButtonGroup();
        groupstatus.add(r3);
        groupstatus.add(r4);
        groupstatus.add(r5);
        
        dateChooser = new JDateChooser();
        dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(137, 337, 200, 29);
        add(dateChooser);
        
        setLayout(null);
        
        formno.setBounds(140,20,600,40);
        add(formno);
        
        personaldetails.setBounds(290,80,600,30);
        add(personaldetails);
        
        name.setBounds(100,140,100,30);
        add(name);
        t1.setBounds(300,140,400,30);
        add(t1);
        
        fname.setBounds(100,190,200,30);
        add(fname);
        t2.setBounds(300,190,400,30);
        add(t2);
        
        dob.setBounds(100,240,200,30);
        add(dob);
        dateChooser.setBounds(300, 240, 400, 30);
        
        sex.setBounds(100,290,200,30);
        add(sex);  
        r1.setBounds(300,290,60,30);
        add(r1);
        r2.setBounds(450,290,90,30);
        add(r2);
        
        mail.setBounds(100,340,200,30);
        add(mail);        
        t3.setBounds(300,340,400,30);
        add(t3);
        
        status.setBounds(100,390,200,30);
        add(status);      
        r3.setBounds(300,390,100,30);
        add(r3); 
        r4.setBounds(450,390,100,30);
        add(r4);      
        r5.setBounds(635,390,100,30);
        add(r5);    
             
        add.setBounds(100,440,200,30);
        add(add);      
        t4.setBounds(300,440,400,30);
        add(t4);
        
        city.setBounds(100,490,200,30);
        add(city);   
        t5.setBounds(300,490,400,30);
        add(t5);
        
        pincode.setBounds(100,540,200,30);
        add(pincode);
        t6.setBounds(300,540,400,30);
        add(t6);
        
        state.setBounds(100,590,200,30);
        add(state); 
        t7.setBounds(300,590,400,30);
        add(t7);   
        
        b.setBounds(620,80,90,30);
        add(b);
        b.addActionListener(this); 
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    
    
    
    public void actionPerformed(ActionEvent ae){
        
        String formno = first;
        String name = t1.getText();
        String fname = t2.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){ 
            gender = "Male";
        }else if(r2.isSelected()){ 
            gender = "Female";
        }
            
        String email = t3.getText();
        String marital = null;
        if(r3.isSelected()){ 
            marital = "Married";
        }else if(r4.isSelected()){ 
            marital = "Unmarried";
        }else if(r5.isSelected()){ 
            marital = "Other";
        }
           
        String address = t4.getText();
        String city = t5.getText();
        String pincode = t6.getText();
        String state = t7.getText();
        

        try{
           
            if(t6.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c1.s.executeUpdate(q1);
                
                new Signup2(formno).setVisible(true);
                setVisible(false);
            }
            
        }catch(Exception e){
             e.printStackTrace();
        }
        
    }
    
    
    public static void main(String[] args){
        new Signup().setVisible(true);
    }
}

