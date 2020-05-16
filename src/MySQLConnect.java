
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
public class MySQLConnect {
    Connection conn;
    public static Connection getConnection(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/housingsocietymanagement","sneha","birodkar@123");
            JOptionPane.showMessageDialog(null, "Connection established succesfully");
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Connection failed"+ e);
            return null;
        }
    }
    public static void main(String arg[])
    {
        Connection conn=MySQLConnect.getConnection();
        if(conn!=null)
            JOptionPane.showMessageDialog(null,"Connection is established");
    }
    
}
