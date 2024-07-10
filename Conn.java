package Bank_Management_System;

import java.net.StandardSocketOptions;
import java.sql.DriverManager;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn() {
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver);
            c= DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","shaurya@007");
            s=c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
