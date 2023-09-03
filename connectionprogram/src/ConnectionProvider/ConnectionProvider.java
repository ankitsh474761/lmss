/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql*;


/**
 *
 * @author ankitsh671
 */
public class ConnectionProvider {
    private static Connection con;
    
    public static Connection getConnection(){
        if(con==null){
            Class.forName("com.mysql.jdbc");
        }
        
        
        
        
        return con;
    }
    
    
    
    
}
