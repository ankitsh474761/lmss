/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;

import java.sql.*;


/**
 *
 * @author ankitsh671
 */
public class ConnectionProvider {
   public static  Connection con;
    public void getCon(){
        try{
            if(con==null){
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","anshu474");
        con.close();
            }
            
    }
        catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
          
        }
            
        }
    
    
}
