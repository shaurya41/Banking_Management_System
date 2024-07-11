package Bank_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    JButton deposit,back;
    JTextField amount;
    String pinnumber;
    Deposit(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);

        JLabel text= new JLabel("Enter the amount you want to Deposit");
        text.setBounds(190,220,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        amount=new JTextField();
        amount.setFont(new Font("Raleway",Font.BOLD,22));
        amount.setBounds(190,280,280,35);
        image.add(amount);

        deposit=new JButton("Deposit");
        deposit.setBounds(355,345,150,30);
        deposit.addActionListener(this);
        image.add(deposit);

        back=new JButton("Back");
        back.setBounds(355,385,150,30);
        back.addActionListener(this);
        image.add(back);


        setSize(900,700);
        setLocation(300,0);;
        setVisible(true);
    }
    public static void main(String[] args) {
        new Deposit("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==deposit){
            String number=amount.getText();
            Date date=new Date();
            if (number.equals("")) {
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to deposit");
            }
            else{
                try{
                    Conn conn=new Conn();
                    String query="insert into bank values('"+pinnumber+"','"+date+"','Deposit','"+number+"')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null,"Rs "+number+" Deposited Succesfully");
                    new Transactions(pinnumber).setVisible(true);
                }
                catch(Exception ae){
                    System.out.println(ae);
                }

            }


        }
        else if(e.getSource()==back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);


        }

    }
}
