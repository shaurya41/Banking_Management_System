package Bank_Management_System;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton deposit,withdrawal,ministatement,pinchange,fastcash,exit,balanceenquiry;
    String pinnumber;
    FastCash(String pinnumber){
        this.pinnumber=pinnumber;

        setLayout(null);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("atm.jpg"));
        Image i2=i1.getImage().getScaledInstance(900,700, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(0,0,900,700);
        add(image);

        JLabel text= new JLabel("Select Withdrawal Amount");
        text.setBounds(225,220,700,35);
        text.setForeground(Color.white);
        text.setFont(new Font("System",Font.BOLD,16));
        image.add(text);

        deposit=new JButton("Rs 100");
        deposit.setBounds(170,325,150,22);
        deposit.addActionListener(this);
        image.add(deposit);

        withdrawal=new JButton("Rs 500");
        withdrawal.setBounds(360,325,150,22);
        withdrawal.addActionListener(this);
        image.add(withdrawal);

        fastcash=new JButton("Rs 1000");
        fastcash.setBounds(170,353,150,22);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement=new JButton("Rs 2000");
        ministatement.setBounds(360,353,150,22);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange=new JButton("Rs 5000");
        pinchange.setBounds(170,381,150,22);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balanceenquiry=new JButton("Rs 10000");
        balanceenquiry.setBounds(360,381,150,22);
        balanceenquiry.addActionListener(this);
        image.add(balanceenquiry);

        exit=new JButton("BACK");
        exit.setBounds(360,409,150,20);
        exit.addActionListener(this);
        image.add(exit);

        setSize(900,700);
        setLocation(200,0);
        setUndecorated(true);
        setVisible(true);

    }
    public static void main(String[] args) {
        new FastCash("");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
        else{
            String amount=((JButton)e.getSource()).getText().substring(3);
            Conn c=new Conn();
            try{
                ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+pinnumber+"'");
                int balance=0;
                while(rs.next()){
                    if(rs.getString("type").equals("Deposit")){
                        balance+=Integer.parseInt(rs.getString("amount"));

                    }else{
                        balance-=Integer.parseInt(rs.getString("amount"));
                    }

                }
                if(e.getSource()!=exit && balance<Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return ;
                }

                Date date=new Date();
                String query="insert into bank values('"+pinnumber+"','"+date+"','Withdrawal','"+amount+"')";
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Rs "+amount+"Debited Succesfully");

                setVisible((false));
                new Transactions(pinnumber).setVisible(true);

            }catch(Exception ae){
                System.out.println(ae);
            }
        }

    }
}
