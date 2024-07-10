package Bank_Management_System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree(String formno) {

        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 16));
        l1.setBounds(150, 20, 300, 30);
        add(l1);

        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 16));
        type.setBounds(50, 70, 150, 25);
        add(type);

        r1 = new JRadioButton("Savings Account");
        r1.setFont(new Font("Raleway", Font.BOLD, 12));
        r1.setBackground(Color.WHITE);
        r1.setBounds(50, 100, 120, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.BOLD, 12));
        r2.setBackground(Color.WHITE);
        r2.setBounds(200, 100, 150, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.BOLD, 12));
        r3.setBackground(Color.WHITE);
        r3.setBounds(50, 130, 120, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway", Font.BOLD, 12));
        r4.setBackground(Color.WHITE);
        r4.setBounds(200, 130, 200, 20);
        add(r4);

        ButtonGroup groupAccount = new ButtonGroup();
        groupAccount.add(r1);
        groupAccount.add(r2);
        groupAccount.add(r3);
        groupAccount.add(r4);

        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 16));
        card.setBounds(50, 170, 150, 25);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 16));
        number.setBounds(220, 170, 200, 25);
        add(number);

        JLabel cardDetail = new JLabel("Your 16 Digit Card Number");
        cardDetail.setFont(new Font("Raleway", Font.BOLD, 10));
        cardDetail.setBounds(50, 200, 200, 15);
        add(cardDetail);

        JLabel pin = new JLabel("PIN:");
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        pin.setBounds(50, 220, 150, 25);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 16));
        pnumber.setBounds(220, 220, 150, 25);
        add(pnumber);

        JLabel pinDetail = new JLabel("Your 4 Digit Password");
        pinDetail.setFont(new Font("Raleway", Font.BOLD, 10));
        pinDetail.setBounds(50, 250, 200, 15);
        add(pinDetail);

        JLabel services = new JLabel("Services Required");
        services.setFont(new Font("Raleway", Font.BOLD, 16));
        services.setBounds(50, 280, 200, 25);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 12));
        c1.setBounds(50, 310, 120, 20);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 12));
        c2.setBounds(200, 310, 150, 20);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 12));
        c3.setBounds(50, 340, 120, 20);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 12));
        c4.setBounds(200, 340, 150, 20);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 12));
        c5.setBounds(50, 370, 120, 20);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 12));
        c6.setBounds(200, 370, 150, 20);
        add(c6);

        c7 = new JCheckBox("<html>I hereby declare that the above entered details are to the best of my knowledge</html>");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(50, 400, 400, 40); // Adjust the width and height as needed
        add(c7);


        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 12));
        submit.setBounds(150, 470, 80, 25);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 12));
        cancel.setBounds(250, 470, 80, 25);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);

        setSize(500, 550);
        setLocation(350, 50);
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupThree("");
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==submit){
            String accountype=null;
            if(r1.isSelected()){
                accountype="Savings Account";
            }
            else if(r2.isSelected()){
                accountype="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accountype="Current Account";
            }
            else if(r4.isSelected()){
                accountype="Reccuring Deposit Account";
            }

            Random random=new Random();
            String cardnumber=" "+ Math.abs((random.nextLong()%90000000L)+504093600000000L);
            String pinnumber=""+ Math.abs((random.nextLong()%9000L)+1000L);
            String facility="";
            if(c1.isSelected()){
                facility=facility+"ATM CARD";
            } else if(c2.isSelected()){
                facility=facility+"Internet Banking";
            } else if(c3.isSelected()){
                facility=facility+"Mobile Banking";
            } else if(c4.isSelected()){
                facility=facility+"EMAIL & SMS Alerts";
            } else if(c5.isSelected()){
                facility=facility+" Cheque Book";
            } else if(c6.isSelected()){
                facility=facility+"E-Statement";
            }

            try{
                if(accountype.equals("")){
                    JOptionPane.showMessageDialog(null,"Account Type is Required");
                }
                else{
                    Conn conn=new Conn();
                    String query1="insert into signupthree values('"+formno+"','"+accountype+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
                    String query2="insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
                    conn.s.executeUpdate(query1);
                    conn.s.executeUpdate(query2);
                }

                JOptionPane.showMessageDialog(null,"Card Number"+ cardnumber+"\n Pin:"+pinnumber);

            } catch(Exception ae){
                System.out.println(ae);

            }

        }else if(e.getSource()==cancel){

        }
    }
}


