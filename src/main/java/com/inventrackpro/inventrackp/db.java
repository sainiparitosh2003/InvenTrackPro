package com.inventrackpro.inventrackp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author saini
 */
public class db {
    
    public static Connection mycon(){
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/inventrackpro" , "root" , "");
            return con;
            
        }catch (ClassNotFoundException | SQLException e){
            System.out.println(e);
            return null;
        }
    }
}
