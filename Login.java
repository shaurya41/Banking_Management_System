package Bank_Management_System;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JButton login, clear, signup;
    JTextField cardTextfield;
    JPasswordField pinTextfield;
    Login(){
        setTitle("STATE BANK OF KKR");
        setLayout(null);
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("logo.jpg"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel label=new JLabel(i3);
        label.setBounds(70,10,100,100);
        add(label);

        JLabel text=new JLabel("Welcome to KKR");
        text.setFont(new Font("Osward",Font.BOLD,38));
        text.setBounds(200,40,400,40);
        add(text);

        JLabel cardno=new JLabel("Card No:");
        cardno.setFont(new Font("Raleway",Font.BOLD,28));
        cardno.setBounds(120,150,400,30);
        add(cardno);

        cardTextfield= new JTextField();
        cardTextfield.setBounds(300,150,230,30);
        cardTextfield.setFont(new Font("Arial",Font.BOLD,14));
        add(cardTextfield);

        JLabel pin=new JLabel("PIN:");
        pin.setFont(new Font("Osward",Font.BOLD,28));
        pin.setBounds(120,220,400,30);
        add(pin);

        pinTextfield= new JPasswordField();
        pinTextfield.setBounds(300,220,230,30);
        add(pinTextfield);

        login=new JButton("SIGN IN");
        login.setBounds(300,300,100,30);
        login.setBackground(Color.BLACK);
        login.setForeground(Color.WHITE);
        login.addActionListener(this);
        add(login);

        clear=new JButton("CLEAR");
        clear.setBounds(430,300,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);

        signup=new JButton("SIGN UP");
        signup.setBounds(300,350,230,30);
        signup.setBackground(Color.BLACK);
        signup.setForeground(Color.WHITE);
        signup.addActionListener(this);
        add(signup);

        getContentPane().setBackground(Color.PINK);

        setSize(800,480);
        setLocation(240,100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Login();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==clear){
            cardTextfield.setText("");
            pinTextfield.setText("");

        }
        if(ae.getSource()==login){

        }
        if(ae.getSource()==signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }

    }
}
