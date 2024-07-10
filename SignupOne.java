package Bank_Management_System;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupOne extends JFrame implements ActionListener{
    JTextField nametextfield, pcodetextfield, fnametextfield, addtextfield, statetextfield, citytextfield, emailtextfield;
    JRadioButton male,female,other,married,unmarried;
    JButton next;
    JDateChooser dateChooser;
    long random;
    SignupOne() {
        setLayout(null);

        Random ran = new Random();
        long random = Math.abs((ran.nextLong() % 9000L) + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 24));
        formno.setBounds(120, 20, 400, 30);
        add(formno);

        JLabel personaldetails = new JLabel("Page 1: Personal Details");
        personaldetails.setFont(new Font("Raleway", Font.BOLD, 18));
        personaldetails.setBounds(190, 60, 300, 30);
        add(personaldetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        name.setBounds(40, 100, 100, 30);
        add(name);

        nametextfield = new JTextField();
        nametextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
        nametextfield.setBounds(200, 100, 300, 30);
        add(nametextfield);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 16));
        fname.setBounds(40, 140, 150, 30);
        add(fname);

        fnametextfield = new JTextField();
        fnametextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
        fnametextfield.setBounds(200, 140, 300, 30);
        add(fnametextfield);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 16));
        dob.setBounds(40, 180, 150, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(200, 180, 300, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        gender.setBounds(40, 220, 100, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(200, 220, 80, 30);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(280, 220, 80, 30);
        female.setBackground(Color.WHITE);
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(40, 260, 150, 30);
        add(email);

        emailtextfield = new JTextField();
        emailtextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
        emailtextfield.setBounds(200, 260, 300, 30);
        add(emailtextfield);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 16));
        marital.setBounds(40, 300, 150, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(200, 300, 100, 30);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(300, 300, 100, 30);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(400, 300, 100, 30);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 16));
        address.setBounds(40, 340, 100, 30);
        add(address);

        addtextfield = new JTextField();
        addtextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
        addtextfield.setBounds(200, 340, 300, 30);
        add(addtextfield);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 16));
        city.setBounds(40, 380, 100, 30);
        add(city);

        citytextfield = new JTextField();
        citytextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
        citytextfield.setBounds(200, 380, 300, 30);
        add(citytextfield);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 16));
        state.setBounds(40, 420, 100, 30);
        add(state);

        statetextfield = new JTextField();
        statetextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
        statetextfield.setBounds(200, 420, 300, 30);
        add(statetextfield);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 16));
        pincode.setBounds(40, 460, 100, 30);
        add(pincode);

        pcodetextfield = new JTextField();
        pcodetextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
        pcodetextfield.setBounds(200, 460, 300, 30);
        add(pcodetextfield);

        next = new JButton("NEXT");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(420, 510, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(600, 600);  // Adjusted size
        setLocation(350, 50);  // Adjusted location
        setVisible(true);
    }

    public static void main(String[] args) {
        new SignupOne();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String formno=""+random;
        String name=nametextfield.getText();
        String fname=fnametextfield.getText();
        String dob=((JTextField)dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(male.isSelected()){
            gender="Male";
        }
        else if(female.isSelected()){
            gender="Female";
        }
        String email=emailtextfield.getText();
        String marital=null;
        if(married.isSelected()){
            marital="Married";
        }
        else if(unmarried.isSelected()){
            marital="Unmarried";
        }
        else if(other.isSelected()){
            marital="Other";
        }
        String address=addtextfield.getText();
        String city=citytextfield.getText();
        String state=statetextfield.getText();
        String pin=pcodetextfield.getText();

        try{
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null,"Name is Required");
            }
            else{
                Conn c=new Conn();
                String query="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
