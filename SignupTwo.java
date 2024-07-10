package Bank_Management_System;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
public class SignupTwo extends JFrame implements ActionListener{
    JTextField pan,aadhar;
    JRadioButton male,female,other,syes,sno,eyes,eno;
    JButton next;
    JComboBox religion,category,inccategory,education,occupation;
    JDateChooser dateChooser;
    String formno;
//    long random;
    SignupTwo(String formno) {
        this.formno=formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 2");


        JLabel additionaldetails = new JLabel("Page 2:Additional Details");
        additionaldetails.setFont(new Font("Raleway", Font.BOLD, 18));
        additionaldetails.setBounds(190, 60, 300, 30);
        add(additionaldetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 16));
        name.setBounds(40, 100, 100, 30);
        add(name);

        String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
        religion=new JComboBox(valReligion);
        religion.setBounds(200, 100, 300, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

//        nametextfield = new JTextField();
//        nametextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
//        nametextfield.setBounds(200, 100, 300, 30);
//        add(nametextfield);

        JLabel fname = new JLabel("Category:");
        fname.setFont(new Font("Raleway", Font.BOLD, 16));
        fname.setBounds(40, 140, 150, 30);
        add(fname);

        String valcategory[]={"General","OBC","SC","ST","Other"};
        category=new JComboBox(valcategory);
        category.setBounds(200, 140, 300, 30);
        category.setBackground(Color.WHITE);
        add(category);

//        fnametextfield = new JTextField();
//        fnametextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
//        fnametextfield.setBounds(200, 140, 300, 30);
//        add(fnametextfield);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 16));
        income.setBounds(40, 180, 150, 30);
        add(income);

        String[] incomecategory ={"NULL","<1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
        inccategory=new JComboBox(incomecategory);
        inccategory.setBounds(200, 180, 300, 30);
        inccategory.setBackground(Color.WHITE);
        add(inccategory);
//        dateChooser = new JDateChooser();
//        dateChooser.setBounds(200, 180, 300, 30);
//        dateChooser.setForeground(new Color(105, 105, 105));
//        add(dateChooser);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 16));
        gender.setBounds(40, 220, 100, 30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 16));
        email.setBounds(40, 240, 150, 30);
        add(email);

        String[] edvalues ={" NON-GRADUATE","<GRADUATE","<POST-GRADUATE","PHD","OTHER"};
        education=new JComboBox(edvalues);
        education.setBounds(200, 230, 300, 30);
        education.setBackground(Color.WHITE);
        add(education);

//        emailtextfield = new JTextField();
//        emailtextfield.setFont(new Font("Raleway", Font.PLAIN, 14));
//        emailtextfield.setBounds(200, 260, 300, 30);
//        add(emailtextfield);

        JLabel marital = new JLabel("Occupation:");
        marital.setFont(new Font("Raleway", Font.BOLD, 16));
        marital.setBounds(40, 280, 150, 30);
        add(marital);

        String[] occvalues ={"Salaried","Self-Employed","Business","Student","Retired"};
        occupation=new JComboBox(occvalues);
        occupation.setBounds(200, 280, 300, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);


        JLabel address = new JLabel("PAN Number:");
        address.setFont(new Font("Raleway", Font.BOLD, 16));
        address.setBounds(40, 330, 200, 30);
        add(address);

        pan = new JTextField();
        pan.setFont(new Font("Raleway", Font.PLAIN, 14));
        pan.setBounds(200, 330, 300, 30);
        add(pan);

        JLabel city = new JLabel("Aadhar Number:");
        city.setFont(new Font("Raleway", Font.BOLD, 16));
        city.setBounds(40, 380, 200, 30);
        add(city);

        aadhar = new JTextField();
        aadhar.setFont(new Font("Raleway", Font.PLAIN, 14));
        aadhar.setBounds(200, 380, 300, 30);
        add(aadhar);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 16));
        state.setBounds(40, 420, 200, 30);
        add(state);

        syes = new JRadioButton("Yes");
        syes.setBounds(200, 420, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(300, 420, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(syes);
        maritalgroup.add(sno);

        JLabel pincode = new JLabel("Existing Account:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 16));
        pincode.setBounds(40, 460, 200, 30);
        add(pincode);

        eyes = new JRadioButton("Yes");
        eyes.setBounds(200, 460, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(300, 460, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup magroup = new ButtonGroup();
        magroup.add(eyes);
        magroup.add(eno);

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
        new SignupTwo("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
//        String formno=""+random;
        String sreligion=(String)religion.getSelectedItem();
        String scategory=(String)category.getSelectedItem();
        String icategory=(String)inccategory.getSelectedItem();
        String seducation=(String)education.getSelectedItem();
        String soccupation=(String)occupation.getSelectedItem();
        String seniorcitizen=null;
        if(syes.isSelected()){
            seniorcitizen="Yes";
        }
        else if(sno.isSelected()){
            seniorcitizen="No";
        }
        String existingaccount=null;
        if(eyes.isSelected()){
            existingaccount="Yes";
        }
        else if(eyes.isSelected()){
            existingaccount="No";
        }
        String span=pan.getText();
        String saadhar=aadhar.getText();

        try{
                Conn c=new Conn();
                String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+icategory+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                c.s.executeUpdate(query);

            }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
