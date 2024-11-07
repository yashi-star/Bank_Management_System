package bank_management_system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Signup2 extends JFrame implements ActionListener{
    
    JLabel  adddetail,religion,category,income,education,qualify,occupation,adharNum,panNum,senior,exsistAcc,formNo,fmNo;
    JButton b;
    JRadioButton r1,r2,r3,r4;
    JTextField t1,t2,t3;
    JComboBox c1,c2,c3,c4,c5;
    String formno;
    
    Signup2(String formno){
        
    	
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l11 = new JLabel(i3);
        l11.setBounds(20, 0, 100, 100);
        add(l11);
        
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
        adddetail = new JLabel("Page 2: Additonal Details");
        adddetail.setFont(new Font("Raleway", Font.BOLD, 22));
        
        religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 18));
        
        category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 18));
        
        income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 18));
        
        education = new JLabel("Educational");
        education.setFont(new Font("Raleway", Font.BOLD, 18));
        
        qualify= new JLabel("Qualification:");
        qualify.setFont(new Font("Raleway", Font.BOLD, 18));
        
        occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 18));
        
        panNum = new JLabel("PAN Number:");
        panNum.setFont(new Font("Raleway", Font.BOLD, 18));
        
        adharNum = new JLabel("Aadhar Number:");
        adharNum.setFont(new Font("Raleway", Font.BOLD, 18));
        
        senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 18));
        
        exsistAcc = new JLabel("Existing Account:");
        exsistAcc.setFont(new Font("Raleway", Font.BOLD, 18));
        
        formNo = new JLabel("Form No:");
        formNo.setFont(new Font("Raleway", Font.BOLD, 13));
        
        fmNo= new JLabel(formno);
        fmNo.setFont(new Font("Raleway", Font.BOLD, 13));
        
        b = new JButton("Next");
        b.setFont(new Font("Raleway", Font.BOLD, 14));
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        t2 = new JTextField();
        t2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(Color.GRAY);
        
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(Color.GRAY);
        
        r3 = new JRadioButton("Yes");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBackground(Color.GRAY);
        
        r4 = new JRadioButton("No");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBackground(Color.GRAY);
        
        
        String religion1[] = {"Hindu","Muslim","Sikh","Christian","Other"};
        c1 = new JComboBox(religion1);
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String category1[] = {"General","OBC","SC","ST","Other"};
        c2 = new JComboBox(category1);
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String income1[] = {"Null","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000","Above 10,00,000"};
        c3 = new JComboBox(income1);
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String education1[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        c4 = new JComboBox(education1);
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 14));
        
        String occupation1[] = {"Salaried","Self-Employmed","Business","Student","Retired","Others"};
        c5 = new JComboBox(occupation1);
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 14));
       
        
        setLayout(null);
        
        
        formNo.setBounds(700,10,60,30);
        add(formNo);
        
        fmNo.setBounds(760,10,60,30);
        add(fmNo);
        
        adddetail.setBounds(280,30,600,40);
        add( adddetail);
        
        religion.setBounds(100,120,100,30);
        add(religion);        
        c1.setBounds(350,120,320,30);
        add(c1);
        
        category.setBounds(100,170,100,30);
        add(category);        
        c2.setBounds(350,170,320,30);
        add(c2);
        
        income.setBounds(100,220,100,30);
        add(income);       
        c3.setBounds(350,220,320,30);
        add(c3);
        
        education.setBounds(100,270,150,30);
        add(education);       
        c4.setBounds(350,270,320,30);
        add(c4);
        
        qualify.setBounds(100,290,150,30);
        add(qualify);
        
        occupation.setBounds(100,340,150,30);
        add(occupation);
        c5.setBounds(350,340,320,30);
        add(c5);
        
        adharNum.setBounds(100,390,150,30);
        add(adharNum);      
        t1.setBounds(350,390,320,30);
        add(t1);
        
        panNum.setBounds(100,440,180,30);
        add(panNum);       
        t2.setBounds(350,440,320,30);
        add(t2);
        
        senior.setBounds(100,490,150,30);
        add(senior);       
        r1.setBounds(350,490,100,30);
        add(r1);       
        r2.setBounds(460,490,100,30);
        add(r2);
        
        exsistAcc.setBounds(100,540,180,30);
        add(exsistAcc);
        r3.setBounds(350,540,100,30);
        add(r3);        
        r4.setBounds(460,540,100,30);
        add(r4);
        
        b.setBounds(590,560,120,30);
        add(b);
        
        b.addActionListener(this);
        
        getContentPane().setBackground(Color.GRAY);
        
        setSize(850,750);
        setLocation(300,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        String religion = (String)c1.getSelectedItem(); 
        String category = (String)c2.getSelectedItem();
        String income = (String)c3.getSelectedItem();
        String education = (String)c4.getSelectedItem();
        String occupation = (String)c5.getSelectedItem();
        
        String pan = t1.getText();
        String aadhar = t2.getText();
        
        String scitizen = "";
        if(r1.isSelected()){ 
            scitizen = "Yes";
        }
        else if(r2.isSelected()){ 
            scitizen = "No";
        }
           
        String eaccount = "";
        if(r3.isSelected()){ 
            eaccount = "Yes";
        }else if(r4.isSelected()){ 
            eaccount = "No";
        }
        
        try{
            if(t2.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the required fields");
            }else{
                Conn c1 = new Conn();
                String q1 = "insert into signuptwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eaccount+"')";
                c1.s.executeUpdate(q1);
                
                new Signup3(formno).setVisible(true);
                setVisible(false);
            }
                
      
            
        }catch(Exception ex){
             ex.printStackTrace();
        }
    
               
    }
    
    
    public static void main(String[] args){
        new Signup2("").setVisible(true);
    }
}
