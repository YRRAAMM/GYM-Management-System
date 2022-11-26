/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;

/**
 *
 * @author youssif
 */
public class ConnectionProvider {
    public static Connection getCon(){
        String url = "jdbc:mysql://localhost:3306/gymdb?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String pass = "" ;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, pass);
            return con;
        } catch (Exception e) {
            return null;
        }
    }
    public static void main(String[] args) {
        
    }
}
