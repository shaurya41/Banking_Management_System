package Bank_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
        JButton exit;
        String pinnumber;
    BalanceEnquiry(String pinnumber){
        this.pinnumber=pinnumber;
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);

        exit=new JButton("BACK");
        exit.setBounds(360,409,150,20);
        exit.addActionListener(this);
        image.add(exit);

        Conn c=new Conn();
        int balance=0;
        try{
            ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
            while(rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }

            }catch(Exception e){
                System.out.println(e);
            }

        JLabel text=new JLabel("Your Current Account balance is Rs "+ balance);
        text.setForeground(Color.white);
        text.setBounds(170,300,400,30);
        image.add(text);


        setSize(900,700);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new Transactions(pinnumber).setVisible(true);

    }
}
